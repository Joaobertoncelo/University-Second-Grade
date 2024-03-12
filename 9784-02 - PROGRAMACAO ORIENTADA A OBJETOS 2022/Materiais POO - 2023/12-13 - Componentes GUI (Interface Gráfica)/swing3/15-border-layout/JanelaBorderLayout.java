import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaBorderLayout extends JFrame implements ActionListener 
{
   private final JButton[] botoes; 
   private static final String[] nomes = {"Esconder norte", "Esconder sul", 
      "Esconder leste", "Esconder oeste", "Esconder centro"};
   private final BorderLayout layout; 


   public JanelaBorderLayout(){
      super("Demonstração BorderLayout");

      layout = new BorderLayout(5, 5); // gaps de 5 pixels
      setLayout(layout);
      botoes = new JButton[nomes.length]; 

      for (int i = 0; i < nomes.length; i++) 
      {
         botoes[i] = new JButton(nomes[i]);
         botoes[i].addActionListener(this);
      }

      add(botoes[0], BorderLayout.NORTH); 
      add(botoes[1], BorderLayout.SOUTH); 
      add(botoes[2], BorderLayout.EAST); 
      add(botoes[3], BorderLayout.WEST); 
      add(botoes[4], BorderLayout.CENTER);
   } 

   @Override
   public void actionPerformed(ActionEvent event){
      for (JButton b : botoes)
      {
         if (event.getSource() == b)
            b.setVisible(false); 
         else
            b.setVisible(true); 
      }

      layout.layoutContainer(getContentPane()); 
   }
} 


