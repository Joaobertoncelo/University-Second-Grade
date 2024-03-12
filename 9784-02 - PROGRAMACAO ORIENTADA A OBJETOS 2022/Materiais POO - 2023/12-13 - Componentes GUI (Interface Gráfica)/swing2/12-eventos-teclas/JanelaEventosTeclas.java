
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JanelaEventosTeclas extends JFrame implements KeyListener 
{
   private String linha1 = ""; 
   private String linha2 = ""; 
   private JTextArea areaTexto; 

   public JanelaEventosTeclas()
   {
      super("Demonstrando eventos de teclas");

      areaTexto = new JTextArea(10, 15); 
      areaTexto.setText("Pressione qualquer tecla no teclado...");
      areaTexto.setEnabled(false);
      areaTexto.setDisabledTextColor(Color.BLACK);
      add(areaTexto); 

      addKeyListener(this); 
   } 

   @Override
   public void keyPressed(KeyEvent event)
   {
      linha1 = String.format("Tecla pressionada: %s", 
        KeyEvent.getKeyText(event.getKeyCode())); 
      setLinha2(event); 
   }

   @Override
   public void keyReleased(KeyEvent event)
   {
      linha1 = String.format("Tecla liberada: %s",
         KeyEvent.getKeyText(event.getKeyCode())); 
      setLinha2(event); 
   }


   @Override
   public void keyTyped(KeyEvent event)
   {
      linha1 = String.format("Tecla digitada: %s", event.getKeyChar());
      setLinha2(event); 
   }

   private void setLinha2(KeyEvent event)
   {
      linha2 = String.format("Esta %sé uma tecla de ação", 
         (event.isActionKey() ? "" : "não "));

      areaTexto.setText(String.format("%s\n%s\n", 
         linha1, linha2)); 
   }
} 
