package listexerc02;
import java.util.Scanner;
public class Exerc4 {
    public static boolean ehPalindromo(int valor){
        String s = Integer.toString(valor);
        String sInvertido = new StringBuilder(s).reverse().toString();
        System.out.printf("%s  %s", s, sInvertido);
        if (s.equals(sInvertido)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int valor1 = in.nextInt();
        System.out.printf("eh Palindromo?: %b",ehPalindromo(valor1));
    }
}
