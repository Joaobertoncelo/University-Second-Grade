package listexerc4;
import java.util.Random;
import java.util.Scanner;
public class Exerc2 {
    public static int quemGanha(int array[][]){
        if(array[0][0]==array[1][1] && array[1][1] == array[2][2]){
            return array[0][0];//Cruzados
        }else if(array[0][2]==array[1][1] && array[1][1] == array[2][0]){
            return array[0][2];//Cruzados
        }else if(array[0][0]==array[0][1] && array[0][1] == array[0][2]){
            return array[0][0];//linhas
        }else if(array[1][0]==array[1][1] && array[1][1] == array[1][2]){
            return array[1][0];//linhas
        }else if(array[2][0]==array[2][1] && array[2][1] == array[2][2]){
            return array[2][0];//linhas
        }else if(array[0][0]==array[1][0] && array[1][0] == array[2][0]){
            return array[0][0];//Colunas
        }else if(array[0][1]==array[1][1] && array[1][1] == array[2][1]){
            return array[0][1];//Colunas
        }else if(array[0][2]==array[1][2] && array[1][2] == array[2][2]){
            return array[0][2];//Colunas
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int[][] array = new int[3][3];
        int maior = 0, menor=9999999;
        Random gerador = new Random();
        for(int i=0; i < array.length;i++){
            for(int j=0; j < array.length;j++){
                array[i][j] = gerador.nextInt(3);
            }
        }
        for(int i=0; i < array.length;i++){
            for(int j=0; j < array.length;j++){
                System.out.print(array[i][j] + "   ");
            }
            System.out.print("\n");
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o Jogador: ");
        int jogador = in.nextInt();
        int vitoria = quemGanha(array);
        if(jogador == vitoria){
            System.out.println("O Jogador " + jogador + " venceu :D");
        }else{
            System.out.println("O Jogador " + jogador + " perdeu :(");
        }
        
    }
}
