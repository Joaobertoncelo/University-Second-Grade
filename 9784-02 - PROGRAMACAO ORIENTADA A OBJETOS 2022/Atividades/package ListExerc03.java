package ListExerc01;
import java.util.Scanner;
public class Exercicio3{
	public static void main{
		double pi = 0.0, termo = 0.0;
		int impar = 1;
		for(i=0;i<100;i++){
			if (i%2==0){
				termo = (double) -4/impar;
			}else{
				termo = (double) 4/impar;
			}
			impar = impar+2;
			pi = pi + termo;
			System.out.printf("%f\n", pi);
		}
	}
}