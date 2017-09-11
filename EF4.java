import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame {
    private JButton jbtnsumar;
    private JTextField num;
    private JLabel resultado;
    private JPanel panel;
    
 
    public static void main(String[] args) {
        EF4 ventana = new EF4();
        ventana.show();
        
    }
    
    public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    Container contenedor = getContentPane();
    
    num = new JTextField("Ingrese Numeros Separados (,)");
    num.setBounds(20, 20, 200, 30);
    
    jbtnsumar = new JButton("Sumar");
    jbtnsumar.setBounds(50,50,100,20);
    jbtnsumar.addActionListener((ActionEvent e) -> {
       String entrada = num.getText();
       resultado.setText(getsuma(entrada));
    });
    
    resultado = new JLabel();
    resultado.setBounds(70,100,100,100);
    
    panel= new JPanel();
    panel.setLayout(null);
    panel.add(num);
    panel.add(jbtnsumar);
    panel.add(resultado);
    contenedor.add(panel);
    
    }
   
    
    public String getsuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //realizar suma
    for(String numero:numeros){
        suma += Integer.parseInt(numero);
    }
    return suma+"";    
    }
    
}
