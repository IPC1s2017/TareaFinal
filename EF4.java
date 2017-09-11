import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.util.logging.*;

public class EF4 extends JFrame {
    JLabel lbltexto,lblresultado;
    JTextField txtnumero;
    JButton sumar;
   
    public static void main(String[] args) {
        EF4 ventana = new EF4();
        ventana.setVisible(true);
    }
    public EF4(){
    setSize(250, 300);
    setTitle("Sumadora"); 
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(null);
    Componentes();
    
    }
    public void Componentes(){
    
    
    txtnumero = new JTextField("");
    txtnumero.setBounds(70, 60, 100, 20);
    
    lbltexto = new JLabel("Ingrese un numero separado por comas: ");
    lbltexto.setBounds(5, 20, 250, 40);
    
    lblresultado = new JLabel("0");
    lblresultado.setBounds(50, 150, 50, 40);
    
    sumar = new JButton("Sumar");
    sumar.setBounds(77, 100, 80,40);
    sumar.addActionListener(new ActionListener(){
  
        public  void actionPerformed(ActionEvent e){
            lblresultado.setText(getSuma(txtnumero.getText()));
         
        }
    
    });
     
    add(txtnumero);
    add(lbltexto);
    add(sumar);
    add(lblresultado);
    
    
    }
    
    public String getSuma(String entrada){
        String[] numeros= entrada.split(",");
        int ent;
        int suma =0;
        int g=0;
        
        for(String numero:numeros){
            ent = Integer.parseInt(numero); 
            suma = g + ent;
            g=suma;
        }
    
    return suma+"";
       
    } 
     
}
