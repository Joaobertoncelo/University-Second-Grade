
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class JanelaLista extends JFrame 
{
   private final JList<String> listaCores; 
   private static final String[] nomesCores = {"Preto", "Azul", "Ciano",
      "Cinza escuro", "Cinza", "Verde", "Cinza claro", "Magenta",
      "Lanranja", "Rosa", "Vermelho", "Branco", "Amarelo"};
   private static final Color[] cores = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};

  
   public JanelaLista()
   {
      super("Janela com lista");
      setLayout(new FlowLayout()); 

      listaCores = new JList<String>(nomesCores); 
      listaCores.setVisibleRowCount(5); 
      
      listaCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      add(new JScrollPane(listaCores));

      listaCores.addListSelectionListener(
         new ListSelectionListener() // classe aninhada anônima
         {   
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               getContentPane().setBackground(
                  cores[listaCores.getSelectedIndex()]);
            } 
         } 
      ); 
   } 
} 
