import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JanelaListaSuspensa extends JFrame {
   private final JComboBox<String> imagensJComboBox; // contém os nomes dos ícones
   private final JLabel label; // mostra o ícone selecionado

   private static final String[] nomes = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"};
   private final Icon[] icones = { 
      new ImageIcon(getClass().getResource(nomes[0])),
      new ImageIcon(getClass().getResource(nomes[1])), 
      new ImageIcon(getClass().getResource(nomes[2])),
      new ImageIcon(getClass().getResource(nomes[3]))};

   public JanelaListaSuspensa(){
      super("Janela com lista suspensa");
      setLayout(new FlowLayout()); //      

      imagensJComboBox = new JComboBox<String>(nomes); 
      imagensJComboBox.setMaximumRowCount(3); // mostra 3 linhas

      imagensJComboBox.addItemListener(
         new ItemListener() // classe interna anônima
         {
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // determina qual item foi selecionado
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icones[
                     imagensJComboBox.getSelectedIndex()]);
            } 
         } 
      ); 

      add(imagensJComboBox); // adiciona o combo box ao frame
      label = new JLabel(icones[0]); // mostra o 1o ícone
      add(label); // adiciona o label ao frame
   }
} 
