
package EF4;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author Zelda
 */
 public class EF4 extends JFrame {
   private JButton jsumar;
   private JTextField numero;
   private JLabel resultado;
   private JPanel caja;

   public static void main(String[] args) {
          EF4 ventana = new EF4();
          ventana.show();     
          }
     
      public EF4(){
      setSize(250, 300);
      setTitle("Calculadora");
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);
      }
      
    public String getSuma(String entrada){
     Container contenedor = getContentPane();
     
     numero = new JTextField("Ingresar números separados por comas");
     numero.setBounds(30, 30, 200, 30);
    
     jsumar = new JButton("Sumar");
     jsumar.setBounds(50,50,100,20);
     jsumar.addActionListener((ActionEvent e) -> {
       String ingresar = numero.getText();
       resultado.setText(getSuma(entrada));
     });
     
     resultado = new JLabel();
     resultado.setBounds(100,100,100,100);
     
     caja= new JPanel();
     caja.setLayout(null);
     caja.add(numero);
     caja.add(jsumar);
     caja.add(resultado);
     contenedor.add(caja);  
        
     public String getSuma(String entrada){
       String[] numeros = entrada.split(",");
             int suma = 0;
             int suma1 = 0;
     //Realizar suma
     for(String numero:numeros)
     {
        int N = Integer.parseInt(numero);
        suma = suma1 + N;
        suma1 = suma;
    }
     return suma+"";
     
 
     
    }
 }


