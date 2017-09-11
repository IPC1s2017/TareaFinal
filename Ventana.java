import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana extends JFrame{
    
    JPanel Panel = new JPanel();
    JTextField Datos = new JTextField();
    JLabel Resultado = new JLabel();
    JButton Suma = new JButton ("Calcular suma");
    String entrada;
    
    
    
    Ventana(){
        Panel.setLayout (null); 

            this.add(Panel);

            Panel.add(Datos);
            Datos.setBounds(new Rectangle(25,25,250,25));
                        
            Panel.add(Suma);
            Suma.setBounds(new Rectangle(300,25,200,25));
                Suma.addActionListener((ActionEvent B) -> {
                    getSuma(Datos.getText());
                });
            
            Panel.add(Resultado);
            Resultado.setBounds(new Rectangle(150,75,200,25));
    }
    
    public void getSuma(String entrada){
        String[] numeros = entrada.split(","); 
        int suma=0;
          
        for(int i=0; i< numeros.length; i++){
            suma = suma + Integer.parseInt(numeros[i]);
        }
            Resultado.setText(Integer.toString(suma));
        
    }
}