// Fig. 26.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class JanelaBotaoOpcao extends JFrame 
{
   private JTextField campoTexto; 
   
   private Font fonteSimples; 
   private Font fonteNegrito; 
   private Font fonteItalico; 
   private Font fonteNegritoItalico; 
   
   private JRadioButton botaoFonteSimples; 
   private JRadioButton botaoFonteNegrito; 
   private JRadioButton botaoFonteItalico; 
   private JRadioButton botaoFonteNegritoItalico; 
   
   private ButtonGroup grupo; 

   public JanelaBotaoOpcao(){
      super("Janela com botões de opção");
      setLayout(new FlowLayout()); 

      campoTexto = new JTextField("Veja o estilo da fonte mudar...", 25);
      add(campoTexto); 

      // cria os botões de opções e os adiciona ao frame
      botaoFonteSimples = new JRadioButton("Simples", true);
      botaoFonteNegrito = new JRadioButton("Negrito", false);
      botaoFonteItalico = new JRadioButton("Italico", false);
      botaoFonteNegritoItalico = new JRadioButton("Negrito/Italico", false);
      add(botaoFonteSimples); 
      add(botaoFonteNegrito); 
      add(botaoFonteItalico); 
      add(botaoFonteNegritoItalico); 

      // cria a relação lógica entre os botões
      grupo = new ButtonGroup(); 
      grupo.add(botaoFonteSimples); 
      grupo.add(botaoFonteNegrito); 
      grupo.add(botaoFonteItalico); 
      grupo.add(botaoFonteNegritoItalico); 

      // cria os objetos das fontes
      fonteSimples = new Font("Serif", Font.PLAIN, 14);
      fonteNegrito = new Font("Serif", Font.BOLD, 14);
      fonteItalico = new Font("Serif", Font.ITALIC, 14);
      fonteNegritoItalico = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      campoTexto.setFont(fonteSimples);

      // register events for JRadioButtons
      botaoFonteSimples.addItemListener(
         new TratadorBotaoOpcao(fonteSimples));
      botaoFonteNegrito.addItemListener(
         new TratadorBotaoOpcao(fonteNegrito));
      botaoFonteItalico.addItemListener(
         new TratadorBotaoOpcao(fonteItalico));
      botaoFonteNegritoItalico.addItemListener(
         new TratadorBotaoOpcao(fonteNegritoItalico));
   } 

   private class TratadorBotaoOpcao implements ItemListener 
   {
      private Font font; 

      public TratadorBotaoOpcao(Font f)
      {
         font = f; 
      } 
   
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         campoTexto.setFont(font); 
      } 
   } 
} 
