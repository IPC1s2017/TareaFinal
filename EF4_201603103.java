import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.util.logging.*;
/**
 *
 * @author USUARIO
 */
public class EF4_201603103 extends JFrame {
    static private JTextField texto;
    static private JLabel et;
    static private JButton boton;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EF4_201603103 ventana = new EF4_201603103();
        ventana.show();
        
    }
    public EF4_201603103(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    this.setLayout(null);
    texto = new JTextField();
    texto.setBounds(10, 10, 100,30);
    texto.setVisible(true);
    this.add(texto);
    et = new JLabel();
    et.setBounds(120, 10, 50, 30);
    et.setVisible(true);
    this.add(et);
    boton = new JButton("Sumar");
    boton.setBounds(10, 50, 100,40);
    boton.setVisible(true);
    boton.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            et.setText(getSuma(texto.getText()));
        }

    });
    this.add(boton);

  }

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    int guardar = 0;
    //Realizar suma
    for(String numero:numeros)
    {
        int num = Integer.parseInt(numero);
        suma = guardar + num;
        guardar = suma;
    }
    return suma+"";
  }

    
}