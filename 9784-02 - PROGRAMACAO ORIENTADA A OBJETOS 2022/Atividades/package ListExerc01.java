package ListExerc01;
import java.util.Scanner;
public class Exercicio1{
	public static void main(String[] args{
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número a ser dividido: ");
		int entrada = in.nextInt();
		String escrito = Integer.toString(entrada);
		for (i=0; i<=escrito.length()-1;i++){
			String saida = escrito.substring(i,i+1);
			System.out.printf("%s   ", saida);
		}
	}
}