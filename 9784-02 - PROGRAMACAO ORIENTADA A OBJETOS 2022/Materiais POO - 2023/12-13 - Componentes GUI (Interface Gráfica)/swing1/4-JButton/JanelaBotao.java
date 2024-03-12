import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelaBotao extends JFrame 
{
   private final JButton botaoTexto; // botão com apenas texto
   private final JButton botaoIcone; // botão com ícone

   public JanelaBotao(){
      super("Janela com JButton");
      setLayout(new FlowLayout()); 

      botaoTexto = new JButton("Botão com texto"); 
      add(botaoTexto); 

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      botaoIcone = new JButton("Botão com ícone", bug1); 
      botaoIcone.setRolloverIcon(bug2); 
      add(botaoIcone);

      
      TratadorEventoBotao handler = new TratadorEventoBotao();
      botaoTexto.addActionListener(handler);
      botaoIcone.addActionListener(handler);
   }


   private class TratadorEventoBotao implements ActionListener{
      
      @Override
      public void actionPerformed(ActionEvent event)
      {
         JOptionPane.showMessageDialog(JanelaBotao.this, String.format(
            "Você pressionou: %s", event.getActionCommand()));
      }
   } 
} 
