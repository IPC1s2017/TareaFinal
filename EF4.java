import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class EF4 extends JFrame{
   static EF4 ventana = new EF4();
	public static void main(String args[]){
	
        ventana.show();
	Principal();
        }

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

  }
  public static void Principal(){
     JLabel label=new JLabel("prueba");
     label.setText("donde estoy");
     label.setBounds(20, 50, 30, 60);
     label.setVisible(true);
     JTextField caja=new JTextField("Este si funcionan"); 
     caja.setText("");
     caja.setSize(200,30);
     caja.setLocation(20,100);
    caja.setVisible(true);
     JButton miboton =new JButton("Presiona para sumar");
     miboton.setSize(200, 30);
     miboton.setLocation(20, 150);
     miboton.setVisible(true);
     ventana.add(label);
     ventana.add(miboton);
     ventana.add(caja);
    
     miboton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
             label.setText(getSuma(caja.getText())); 
            }
        });
  }
  public static String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    for(int i=0; i<numeros.length;i++)
    {
        suma=suma+Integer.parseInt(numeros[i]);
    }
    return suma+"";
  }

}