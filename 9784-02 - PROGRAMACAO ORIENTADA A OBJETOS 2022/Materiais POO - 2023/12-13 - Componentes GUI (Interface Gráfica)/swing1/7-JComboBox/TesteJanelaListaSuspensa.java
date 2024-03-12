import javax.swing.JFrame;

public class TesteJanelaListaSuspensa
{
   public static void main(String[] args)
   { 
      JanelaListaSuspensa janela = new JanelaListaSuspensa(); 
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(350, 150); 
      janela.setVisible(true); 
   } 
} 
