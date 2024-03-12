package ListExerc01;
public class Exercicio2{
	public static void main(String[] args){
		System.out.println("Number  Square  Cube");
		for(int i=0; i<=10; i++){
			System.out.printf("%-8d%-8.0f%-8.0f\n", i, Math.pow(i,2), Math.pow(i,3));/*O "-" serve para a String começar pela orientação correta, o "8"
			é o número de caracteres reservados para ela e o ".0" é para não aparecer valores após o ponto*/
		}
	}
}