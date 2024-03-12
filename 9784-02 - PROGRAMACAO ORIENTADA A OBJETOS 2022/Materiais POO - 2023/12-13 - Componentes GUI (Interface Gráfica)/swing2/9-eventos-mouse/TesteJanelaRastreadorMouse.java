
import javax.swing.JFrame;

public class TesteJanelaRastreadorMouse 
{
   public static void main(String[] args)
   { 
      JanelaRastreadorMouse janela = new JanelaRastreadorMouse(); 
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(300, 100); 
      janela.setVisible(true); 
   } 
} 
