
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class JanelaAreaTexto extends JFrame 
{
   private final JTextArea areaTexto1; 
   private final JTextArea areaTexto2; 
   private final JButton botaoCopia; 

   public JanelaAreaTexto() 
   {
      super("Janela com área de texto"); 
      Box box = Box.createHorizontalBox(); 
      String demo = "Esta é uma string de teste \n" + 
         "para ilustrar a cópia de texto\nde uma área para outra\n" +
         " usando um evento externo\n";

      areaTexto1 = new JTextArea(demo, 10, 15); 
      box.add(new JScrollPane(areaTexto1)); 

      botaoCopia = new JButton("Copia >>>"); 
      box.add(botaoCopia); 
      botaoCopia.addActionListener(
         new ActionListener() 
         {   
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               areaTexto2.setText(areaTexto1.getSelectedText());
            } 
         } 
      ); 

      areaTexto2 = new JTextArea(10, 15);
      areaTexto2.setEditable(false); 
      box.add(new JScrollPane(areaTexto2)); 

      add(box); 
   } 
} 
