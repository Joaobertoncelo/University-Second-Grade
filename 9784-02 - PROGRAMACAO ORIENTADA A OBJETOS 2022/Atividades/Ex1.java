ppackage listexerc4;
public class ListExerc4 {
    public static void main(int[] array){
        int maior = 0, menor=9999999;
        for(int i=0; i < array.length;i++){
            if(array[i] > maior){
                maior = array[i];
            }
            if(array[i] < menor){
                menor = array[i];
            }
        }
        System.out.print("Menor Número: " + menor);
        System.out.print("\n");
        System.out.print("Maior Número: " + maior);
        System.out.print("\n");
        System.out.print("Média: " + (maior+menor)/2);
        System.out.print("\n");
    }
}