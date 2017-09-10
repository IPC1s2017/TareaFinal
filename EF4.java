import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EF4 extends JFrame implements ActionListener{

	public static void main(String args[]){
	EF4 ventana = new EF4();
        ventana.campoTexto();
        ventana.show();
        ventana.paintAll(ventana.getGraphics());
        
	}

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setLayout(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    
  }
  
  private JTextField Campo;
  private JLabel label1;
  private JButton boton;
  private JLabel label2;
      
  public void campoTexto(){
      Campo = new JTextField("0");
      Campo.setBounds(75,100,100,25);
      Campo.setEditable(true);
      Campo.setHorizontalAlignment(JTextField.RIGHT);
      this.add(Campo);
      
      label1 = new JLabel();
      label1.setText("Ingrese los valores:");
      label1.setBounds(70, 60, 150, 25);
      this.add(label1);
      
      boton = new JButton();
      boton.setText("Suma");
      boton.setBounds(75, 140, 100, 25);
      boton.addActionListener(this);
      this.add(boton);

      label2 = new JLabel();
      label2.setBounds(75, 180, 100, 25);
      label2.setText("");
      this.add(label2);
      
  }

  @Override
  public void actionPerformed(ActionEvent e){
      
      String res = this.getSuma(Campo.getText());

      label2.setText("Resultado:   " + res);
  }  
 
  public String getSuma(String entrada){
    
    String[] numeros = entrada.split(",");
    
    
    int suma = 0;
    //Realizar suma
    int temp = 0;
    for(String numero:numeros)
    {
        int a = Integer.parseInt(numero);
            suma = temp + a;
            temp = suma;
        
    }
    return suma+"";
    
  }
  
}
