package listexerc02;
import java.util.Scanner;
public class Exerc3 {
    public static boolean ehAnoBisexto(int ano){
        if (ano % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int valor1 = in.nextInt();
        System.out.printf("eh bisexto?: %b",ehAnoBisexto(valor1));
    }
}
