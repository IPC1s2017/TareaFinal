import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame  implements ActionListener{
    
    public JButton btnBotonSumar = new JButton("SUMAR");
    public JLabel lblNumeros = new JLabel("INGRESE NUMEROS : ");
    public JTextField txtNumeros = new JTextField(20);
    public JLabel lblResultado = new JLabel();

  public static void main(String args[]){
            EF4 ventana = new EF4();
            ventana.show();
  }

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    this.btnBotonSumar.addActionListener(this);
    FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.CENTER,30,30);
        this.setLayout(DISTRIBUIDOR);
        this.add(this.lblNumeros);
        this.add(this.txtNumeros);
        this.add(this.btnBotonSumar);
        this.add(this.lblResultado);    
    }

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    for(String numero:numeros)
    {
    suma += Integer.parseInt(numero);
    }
    return "Resultado:" +suma+ "";
  }
  
      @Override
    public void actionPerformed(ActionEvent AE) 
    {
        if(AE.getSource() == this.btnBotonSumar)
        {
        String entrada = txtNumeros.getText();
        lblResultado.setText(getSuma(entrada));
        }

            }
}