
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JanelaMouseAdapter extends JFrame 
{
   private String details; 
   private final JLabel statusBar; 

   public JanelaMouseAdapter()
   {
      super("Cliques de mouse");

      statusBar = new JLabel("Clique no mouse");
      add(statusBar, BorderLayout.SOUTH);
      addMouseListener(new MouseClickHandler()); 
   }


   private class MouseClickHandler extends MouseAdapter 
   {

      @Override
      public void mouseClicked(MouseEvent event)
      {
         int xPos = event.getX(); 
         int yPos = event.getY(); 

         details = String.format("Clicou %d vez(es)", 
            event.getClickCount());
      	 
      	 if (SwingUtilities.isLeftMouseButton(event))  
            details += " com o botão esquerdo do mouse";
         else if (SwingUtilities.isRightMouseButton(event))  
            details += " com o botão direito do mouse";
         else if (SwingUtilities.isMiddleMouseButton(event))  
            details += " com o botão do meio do mouse";                     

         statusBar.setText(details); 
      }
   } 
} 
