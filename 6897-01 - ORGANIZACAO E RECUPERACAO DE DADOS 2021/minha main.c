#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {
    long offset;
    short int size;
} LEDNode;


int main(int argc, char *argv[]) {

    LEDNode headLED;  // Cabeça da LED
    int numLEDNodes;   // Número de nós na LED


    if (argc == 3 && strcmp(argv[1], "-e") == 0) {

        printf("Modo de execucao de operacoes ativado ... nome do arquivo = %s\n", argv[2]);
        // chamada da funcao que executa o arquivo de operacoes
        // o nome do arquivo de operacoes estara armazenado na variavel argv[2]
        // executa_operacoes(argv[2])

    } else if (argc == 2 && strcmp(argv[1], "-p") == 0) {

        printf("Modo de impressao da LED ativado ...\n");
        // chamada da funcao que imprime as informacoes da led
        // imprime_led();

    } else {

        fprintf(stderr, "Argumentos incorretos!\n");
        fprintf(stderr, "Modo de uso:\n");
        fprintf(stderr, "$ %s -e nome_arquivo\n", argv[0]);
        fprintf(stderr, "$ %s -p\n", argv[0]);
        exit(EXIT_FAILURE);

    }

    return 0;
}

void remocao(char *chave, char *nomeDoArquivo) {
    FILE *arquivo;

    arquivo = fopen(nomeDoArquivo, "rb+");

    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo");
        exit(1);
    }

    char buffer[256];
    char linha[256];
    char *token;

    printf("Remocao do registro de chave %s\n", chave);

    while (fgets(buffer, 256, arquivo) != NULL) {
        fseek(arquivo, 2, SEEK_CUR);

        strcpy(linha, buffer);

        token = strtok(buffer, "|");

        if (strcmp(token, chave) == 0) {
            printf("Registro removido! (%ld bytes)\n", strlen(linha) - 1);
            printf("Local: offset = %ld bytes\n", ftell(arquivo) - strlen(linha) - 2);

            fseek(arquivo, -strlen(linha) - 2, SEEK_CUR);

            // Marcando o registro como removido logicamente
            fputc('*', arquivo); // Marcador de registro removido
            fwrite("|", 1, 1, arquivo); // Caractere separador
            fwrite(linha + 1, sizeof(char), strlen(linha) - 1, arquivo); // Resto do registro

            // Atualização da LED após remoção
            LEDNode newNode;
            newNode.offset = ftell(arquivo) - strlen(linha);
            newNode.size = strlen(linha);
            // Você precisa adicionar a newNode à LED (em memória) e atualizar numLEDNodes
            // Certifique-se de manter a LED ordenada por offset.

            fclose(arquivo);
            return;
        }
    }

    printf("Erro: registro nao encontrado!\n");

    fclose(arquivo);
}

void insercao(char *conteudo, char *nomeDoArquivo) {
    FILE *arquivo;
    char chave[256];
    char *token;
    short int bytesLidos = strlen(conteudo) + sizeof(short int);

    arquivo = fopen(nomeDoArquivo, "rb+");
    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo");
        exit(1);
    }

    strcpy(chave, conteudo);

    token = strtok(chave, "|");

    printf("Insercao do registro %s\n", token);

    LEDNode espacoEscolhido;
    espacoEscolhido.offset = -1; // Valor inválido para indicar que nenhum espaço foi encontrado
    espacoEscolhido.size = 0;

    // Percorra a LED para encontrar um espaço disponível adequado para a inserção
    fseek(arquivo, sizeof(int), SEEK_SET); // Pule o cabeçalho do arquivo

    while (fread(&espacoEscolhido.size, sizeof(short int), 1, arquivo) == 1) {
        if (espacoEscolhido.size >= bytesLidos) {
            // Espaço adequado encontrado na LED
            break;
        }
        fseek(arquivo, espacoEscolhido.size, SEEK_CUR); // Pule o espaço disponível atual
    }

    if (espacoEscolhido.offset != -1) {
        // Inserção do registro no espaço escolhido
        fseek(arquivo, espacoEscolhido.offset, SEEK_SET);
        fwrite(&bytesLidos, sizeof(short int), 1, arquivo);
        fwrite(conteudo, sizeof(char), strlen(conteudo), arquivo);

        // Atualização da LED após inserção
        espacoEscolhido.offset += bytesLidos;
        espacoEscolhido.size -= bytesLidos;

        if (espacoEscolhido.size <= 0) {
            // Remover o nó da LED se não houver espaço restante
            // Você precisa ajustar a LED para remover esse nó
        }

        printf("Registro inserido! (%d bytes)\n", bytesLidos);
        printf("Local: offset = %ld bytes\n", espacoEscolhido.offset);

        fclose(arquivo);
        return;
    }

    // Inserção no final do arquivo se não houver espaço adequado na LED
    fseek(arquivo, 0, SEEK_END);
    fwrite("\r\n", 1, 2, arquivo); // Nova linha
    fwrite(&bytesLidos, sizeof(short int), 1, arquivo);
    fwrite(conteudo, sizeof(char), strlen(conteudo), arquivo);

    printf("Registro inserido no final do arquivo!\n");
    printf("Local: offset = final do arquivo\n");

    fclose(arquivo);
}
