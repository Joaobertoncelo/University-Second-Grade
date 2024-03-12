#include<stdio.h>
#include<conio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

//Função inserção direta
void insercao_direta(int vetor[], int tamanho){
	int i, j, chave, trocas;
   srand(time(0));
   for(i=0;i<tamanho;i++)
      {
      vetor[i]=rand()%100;
      printf("Vetor [%2d]: %3d\n",i+1,vetor[i]);
      }
   for (j=1;j<tamanho;j++)
      {
      chave = vetor[j];
      i = j - 1;
      while((i>=0) && (vetor[i]>chave))
         {
         vetor[i+1] = vetor[i];
         i = i - 1;
         trocas++;
         }
      vetor[i+1] = chave;
      }
}

//Função Bubble sort
void bubble_sort (int vetor[], int n) {
    int k, j, aux;

    for (k = 1; k < n; k++) {
        printf("\n[%d] ", k);

        for (j = 0; j < n - k; j++) {
            printf("%d, ", j);

            if (vetor[j] > vetor[j + 1]) {
                aux          = vetor[j];
                vetor[j]     = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
}

//Função Seleção Direta
void selecao_direta(int vetor[], int tamanho)
{
  int i, j, menor, aux;

  for (i = 0; i < tamanho - 1; ++i)
  {
    menor = i;
    for (j = i + 1; j < tamanho; ++j)
    {
      if (vetor[j] < vetor[menor])
        menor = j;
    }
    aux = vetor[i];
    vetor[i] = vetor[menor];
    vetor[menor] = aux;
  }
}

//Função ShellSort
void shellSort(int *vet, int size) {
    int i, j, value;
 
    int h = 1;
    while(h < size) {
        h = 3*h+1;
    }
    while (h > 0) {
        for(i = h; i < size; i++) {
            value = vet[i];
            j = i;
            while (j > h-1 && value <= vet[j - h]) {
                vet[j] = vet[j - h];
                j = j - h;
            }
            vet[j] = value;
        }
        h = h/3;
    }
}


//Função Quicksort
int
separa (int v[], int p, int r) {
   int c = v[r];
   int t, j = p;
   for (int k = p; k < r; ++k)
      if (v[k] <= c) {
         t = v[j], v[j] = v[k], v[k] = t;
         ++j; 
      } 
   t = v[j], v[j] = v[r], v[r] = t;
   return j; 
}

void quickSort (int vetor[], int p, int r)
{
   while (p < r) {      
      int j = separa (vetor, p, r);    
      if (j - p < r - j) {     
         quickSort (vetor, p, j-1);
         p = j + 1;            
      } else {                 
         quickSort (vetor, j+1, r);
         r = j - 1;
      }
   }
}

//Função Heapsort
void peneira(int *vet, int raiz, int fundo) {
	int pronto, filhoMax, tmp;

	pronto = 0;
	while ((raiz*2 <= fundo) && (!pronto)) {
		if (raiz*2 == fundo) {
			filhoMax = raiz * 2;
		}
		else if (vet[raiz * 2] > vet[raiz * 2 + 1]) {
			filhoMax = raiz * 2;
		}
		else {
			filhoMax = raiz * 2 + 1;
		}

	if (vet[raiz] < vet[filhoMax]) {
		tmp = vet[raiz];
		vet[raiz] = vet[filhoMax];
		vet[filhoMax] = tmp;
		raiz = filhoMax;
    }
	else {
      pronto = 1;
	}
  }
}

void heapsort(int vetor[], int n) {
	int i, tmp;

	for (i = (n / 2); i >= 0; i--) {
		peneira(vetor, i, n - 1);
	}

	for (i = n-1; i >= 1; i--) {
		tmp = vetor[0];
		vetor[0] = vetor[i];
		vetor[i] = tmp;
		peneira(vetor, 0, i-1);
	}
}

//Função MergeSort
void merge(int vetor[], int comeco, int meio, int fim) {
    int com1 = comeco, com2 = meio+1, comAux = 0, tam = fim-comeco+1;
    int *vetAux;
    vetAux = (int*)malloc(tam * sizeof(int));

    while(com1 <= meio && com2 <= fim){
        if(vetor[com1] < vetor[com2]) {
            vetAux[comAux] = vetor[com1];
            com1++;
        } else {
            vetAux[comAux] = vetor[com2];
            com2++;
        }
        comAux++;
    }

    while(com1 <= meio){  //Caso ainda haja elementos na primeira metade
        vetAux[comAux] = vetor[com1];
        comAux++;
        com1++;
    }

    while(com2 <= fim) {   //Caso ainda haja elementos na segunda metade
        vetAux[comAux] = vetor[com2];
        comAux++;
        com2++;
    }

    for(comAux = comeco; comAux <= fim; comAux++){    //Move os elementos de volta para o vetor original
        vetor[comAux] = vetAux[comAux-comeco];
    }
    
    free(vetAux);
}

void mergeSort(int vetor[], int comeco, int fim){
    if (comeco < fim) {
        int meio = (fim+comeco)/2;

        mergeSort(vetor, comeco, meio);
        mergeSort(vetor, meio+1, fim);
        merge(vetor, comeco, meio, fim);
    }
}

//Função RadixSort
void radixsort(int vetor[], int tamanho) {
    int i;
    int *b;
    int maior = vetor[0];
    int exp = 1;

    b = (int *)calloc(tamanho, sizeof(int));

    for (i = 0; i < tamanho; i++) {
        if (vetor[i] > maior)
    	    maior = vetor[i];
    }

    while (maior/exp > 0) {
        int bucket[10] = { 0 };
    	for (i = 0; i < tamanho; i++)
    	    bucket[(vetor[i] / exp) % 10]++;
    	for (i = 1; i < 10; i++)
    	    bucket[i] += bucket[i - 1];
    	for (i = tamanho - 1; i >= 0; i--)
    	    b[--bucket[(vetor[i] / exp) % 10]] = vetor[i];
    	for (i = 0; i < tamanho; i++)
    	    vetor[i] = b[i];
    	exp *= 10;
    }

    free(b);
}

int main()
{
	srand(time(NULL));
	
	int opcao;
	int vetor[300];
	int crescente[300];
	int decrescente[300];
	
	for (int i = 0; i < 300; i++){
        vetor[i] = rand() % 300;
	}
	
	for (int i = 0; i < 200; i++){
        crescente[i];
	}

    for (int i = 200; i > 0; i--){
        decrescente[i];
    }


	
	
	do{
	
		printf("Digite qual ordenacao quer fazer{ \n	1-Insercao direta \n	2-BubbleSort \n	3-Selecao Direta \n	4-ShellSort \n	5-Quicksort \n	6-HeapSort \n	7-Mergesort \n	8-RadixSort \n	0-Finalizar programa \n}\n");
		scanf("%d", &opcao);
		
	switch(opcao){
		
		case 0: {
			printf("Fim do programa");
			break;
		}
		case 1: {
			printf("Iniciando Incercao Direta:\n");
			
			insercao_direta(vetor,300);
			insercao_direta(crescente,300);
			insercao_direta(decrescente,300);
			
			break;
		}
		case 2: {
			printf("Iniciando BubbleSort:\n");
			
			bubble_sort(vetor, 300);
			bubble_sort(crescente, 300);
			bubble_sort(decrescente, 300);
			
			break;
		}
		case 3: {
			printf("Iniciando Selecao direta:\n");
			
			selecao_direta(vetor,300);
			selecao_direta(crescente,300);
			selecao_direta(decrescente,300);
			
			break;
		}
		case 4: {
			printf("Iniciando Shellsort:\n");
			
			shellSort(vetor,300);
			shellSort(crescente,300);
			shellSort(decrescente,300);
			
			break;
		}
		case 5: {
			printf("Iniciando Quicksort:\n");
			
			quickSort(vetor,0,300);
			quickSort(crescente,0,300);
			quickSort(decrescente,0,300);
			
			break;
		}
		case 6: {
			printf("Iniciando Heapsort:\n");
			
			heapsort(vetor,300);
			heapsort(crescente,300);
			heapsort(decrescente,300);
			
			break;
		}
		case 7: {
			printf("Iniciando Mergesort:\n");
			
			mergeSort(vetor,0,300);
			mergeSort(crescente,0,300);
			mergeSort(decrescente,0,300);
			
			break;
		}
		case 8: {
			printf("Iniciando RadixSort:\n");
			
			radixsort(vetor,300);
			radixsort(crescente,300);
			radixsort(decrescente,300);
			
			break;
		}
	}
	}while(opcao != 0);
   
   return 0;
}
