package listexerc02;
import java.util.Scanner;
public class Exerc1 {
    public static double hipotenusa(double lado1, double lado2){
        double hipot = Math.hypot(lado1,lado2);
        return (hipot);
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o Cateto 1: ");
        double cateto1 = in.nextInt();
        System.out.println("Digite o Cateto 2: ");
        double cateto2 = in.nextInt();
        System.out.printf("A hipotenusa é: %f",hipotenusa(cateto1, cateto2));
    }
}
