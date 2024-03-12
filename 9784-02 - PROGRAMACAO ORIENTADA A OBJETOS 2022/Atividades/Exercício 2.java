package listexerc02;
import java.util.Scanner;
public class Exerc2 {
    public static boolean ehMultiplo(int x1, int x2){
        if (x2 % x1 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = in.nextInt();
        System.out.printf("eh multiplo?: %b",ehMultiplo(valor1, valor2));
    }
}