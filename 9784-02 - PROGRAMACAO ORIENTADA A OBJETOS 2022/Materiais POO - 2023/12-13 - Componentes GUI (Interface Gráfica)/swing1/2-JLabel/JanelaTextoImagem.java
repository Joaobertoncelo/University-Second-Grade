import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

public class JanelaTextoImagem extends JFrame 
{
   private final JLabel label1; // JLabel com apenas texto
   private final JLabel label2; // JLabel construída com texto e ícone
   private final JLabel label3; // JLabel com texto e ícone adicionados

   public JanelaTextoImagem(){
      super("Janela com JLabel");
      setLayout(new FlowLayout()); 

      
      label1 = new JLabel("Label com texto");
      add(label1); // adiciona label1 ao JFrame


      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      label2 = new JLabel("Label com texto e ícone", bug, 
         SwingConstants.LEFT);
      add(label2); 

      label3 = new JLabel(); 
      label3.setText("Label com texto e ícone");
      label3.setIcon(bug); 
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      add(label3); // adiciona label3 ao JFrame
   } 
} 


