
import javax.swing.JFrame;

public class TesteJanelaMouseAdapter
{
   public static void main(String[] args)
   { 
      JanelaMouseAdapter janela = new JanelaMouseAdapter(); 
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(400, 150); 
      janela.setVisible(true); 
   } 
} 
