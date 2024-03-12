import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaFlowLayout extends JFrame 
{
   private final JButton botaoEsquerda; 
   private final JButton botaoCentro; 
   private final JButton botaoDireita; 
   private final FlowLayout layout; 
   private final Container container; 
   

   public JanelaFlowLayout(){
      super("Demonstração FlowLayout");

      layout = new FlowLayout(); 
      container = getContentPane(); 
      setLayout(layout); 


      botaoEsquerda = new JButton("Esquerda"); 
      add(botaoEsquerda); 
      botaoEsquerda.addActionListener(
         new ActionListener() {   
            @Override
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.LEFT); 
               layout.layoutContainer(container); // realinha os componentes
            } 
         } 
      ); 


      botaoCentro = new JButton("Centro"); 
      add(botaoCentro); 
      botaoCentro.addActionListener(
         new ActionListener() {   
            @Override
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.CENTER);
               layout.layoutContainer(container);
            }
         }
      ); 


      botaoDireita = new JButton("Direita"); 
      add(botaoDireita);
      botaoDireita.addActionListener(
         new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.RIGHT);
               layout.layoutContainer(container);
            } 
         } 
      ); 
   } 
} 

