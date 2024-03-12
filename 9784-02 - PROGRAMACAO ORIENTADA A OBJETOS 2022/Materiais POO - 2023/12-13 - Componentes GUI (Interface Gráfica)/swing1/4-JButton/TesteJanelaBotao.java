import javax.swing.JFrame;

public class TesteJanelaBotao {
   public static void main(String[] args){ 
      JanelaBotao janela = new JanelaBotao(); 
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(275, 110); 
      janela.setVisible(true); 
   } 
} 
