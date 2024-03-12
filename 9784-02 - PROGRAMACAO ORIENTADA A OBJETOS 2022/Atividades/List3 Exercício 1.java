package listExerc3;

public class Exerc1{
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int[] frequencias = new int[11];
        
        System.out.println("Grade Distribution: ");
        
        for(int i=0; i < array.length;i++){
            if(array[i] < 10){
                frequencias[0]++;
            }else if(array[i]<20){
                frequencias[1]++;
            }else if(array[i]<30){
                frequencias[2]++;
            }else if(array[i]<40){
                frequencias[3]++;
            }else if(array[i]<50){
                frequencias[4]++;
            }else if(array[i]<60){
                frequencias[5]++;
            }else if(array[i]<70){
                frequencias[6]++;
            }else if(array[i]<80){
                frequencias[7]++;
            }else if(array[i]<90){
                frequencias[8]++;
            }else if(array[i]<100){
                frequencias[9]++;
            }else{
                frequencias[10]++;
            }
        }
        System.out.print("00-09: ");
        for (int j=0; j<frequencias[0]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("10-19: ");
        for (int j=0; j<frequencias[1]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("20-29: ");
        for (int j=0; j<frequencias[2]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("30-39: ");
        for (int j=0; j<frequencias[3]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("40-49: ");
        for (int j=0; j<frequencias[4]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("50-59: ");
        for (int j=0; j<frequencias[5]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("60-69: ");
        for (int j=0; j<frequencias[6]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("70-79: ");
        for (int j=0; j<frequencias[7]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("80-89: ");
        for (int j=0; j<frequencias[8]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("90-99: ");
        for (int j=0; j<frequencias[9]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("  100: ");
        for (int j=0; j<frequencias[10]; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
