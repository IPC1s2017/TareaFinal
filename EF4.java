package ef4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lenovo
 */
public class EF4 extends JFrame {

    /**
     * @param args the command line arguments
     */
    JTextField txtentrada= new JTextField();
    JButton boton= new JButton("Sumar");
    JPanel contentPane= new JPanel();
    JLabel label= new JLabel("Resultado");
    public static void main(String[] args) {
        EF4 ventana = new EF4();
           ventana.show();
        
    }
    public EF4(){
      setSize(250, 300);
      setTitle("Sumadora");
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);
      
      contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        
      txtentrada.setSize(150,30 );
      txtentrada.setLocation(40,95);
      //txtentrada.setEnabled(true);
      txtentrada.setVisible(true);
      contentPane.add(txtentrada);
      
      label.setSize(120, 30);
      label.setLocation(50, 175);
      
      label.setVisible(true);
      contentPane.add(label);
      
      boton.setSize(100,20);
      boton.setLocation(45,150);
      boton.setVisible(true);
      boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResult(evt);
            }

            private void ButtonResult(ActionEvent evt) {
               
                label.setText( getSuma(txtentrada.getText()));
            }
        });
      contentPane.add(boton);
      
              }
  
    public String getSuma(String entrada){
      String[] numeros = entrada.split(",");
      int suma = 0;
      //Realizar suma
      for(String numero:numeros)
      {
          suma+=Integer.parseInt(numero);
      }
      return suma+"";
    }
}
