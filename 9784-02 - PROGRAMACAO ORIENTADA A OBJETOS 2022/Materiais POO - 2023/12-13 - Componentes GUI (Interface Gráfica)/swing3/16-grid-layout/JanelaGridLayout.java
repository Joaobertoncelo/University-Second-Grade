import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaGridLayout extends JFrame implements ActionListener 
{
   private final JButton[] botoes; 
   private static final String[] nomes = 
      {"Torre", "Cavalo", "Bispo", "rei", "dama", "Bispo",  "Cavalo", "Torre",
         "Peao", "Peao", "Peao", "Peao", "Peao", "Peao", "Peao", "Peao",
         "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio",
         "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio", "Vazio",
         "Peao", "Peao", "Peao", "Peao", "Peao", "Peao", "Peao", "Peao",
         "Torre", "Cavalo", "Bispo", "rei", "dama", "Bispo",  "Cavalo", "Torre"};
   private boolean toggle = true; // alterna entre dois layouts
   private final Container container; 
   private final GridLayout gridLayout1; 
   private final GridLayout gridLayout2; 

   public JanelaGridLayout(){
      super("Demonstração GridLayout");
      gridLayout1 = new GridLayout(8, 8, 5, 5); // 2 por 3; gaps de 5
      gridLayout2 = new GridLayout(3, 2); // 3 por 2; sem gaps
      container = getContentPane();
      setLayout(gridLayout1); 
      botoes = new JButton[nomes.length];

      for (int i = 0; i < nomes.length; i++){
         botoes[i] = new JButton(nomes[i]);
         botoes[i].addActionListener(this);
         add(botoes[i]); 
      }
   }

   @Override
   public void actionPerformed(ActionEvent event){ 
      if (toggle) // configura o layout com base no toggle
         container.setLayout(gridLayout2); 
      else
         container.setLayout(gridLayout1); 

      toggle = !toggle;
      container.validate(); // rearranja os elementos do container
   } 
}
