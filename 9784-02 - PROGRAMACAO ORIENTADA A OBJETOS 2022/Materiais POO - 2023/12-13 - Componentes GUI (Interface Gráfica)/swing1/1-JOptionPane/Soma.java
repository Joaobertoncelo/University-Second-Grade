import javax.swing.JOptionPane; 

public class Soma {
   public static void main(String[] args)
   {
      
      // obtém as entradas  
      String primeiroNumero = 
         JOptionPane.showInputDialog("Insira um valor inteiro");
      String segundoNumero =
          JOptionPane.showInputDialog("Insira outro valor inteiro");

      // converte as strings de entrada em valores inteiros
      int numero1 = Integer.parseInt(primeiroNumero); 
      int numero2 = Integer.parseInt(segundoNumero);

      int soma = numero1 + numero2; // faz a soma

      // mostra o resultado 
      JOptionPane.showMessageDialog(null, "A soma é " + soma, 
         "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
   } 
} 
