import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class JanelaCaixaSelecao extends JFrame {
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 

   public JanelaCaixaSelecao(){
      super("Janela com caixa de seleção");
      setLayout(new FlowLayout());

      textField = new JTextField("Veja o estilo da fonte mudar...", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField); 

      boldJCheckBox = new JCheckBox("Bold"); 
      italicJCheckBox = new JCheckBox("Italic"); 
      add(boldJCheckBox); 
      add(italicJCheckBox); 

      TratadorCaixaSelecao handler = new TratadorCaixaSelecao();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
   } 

   private class TratadorCaixaSelecao implements ItemListener {
     
      @Override
      public void itemStateChanged(ItemEvent event){
         Font font = null; // armazena a nova fonte

         // determina qual caixa está selecionada e cria a fonte
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);

         textField.setFont(font); 
      } 
   }
}
