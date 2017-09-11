import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame implements ActionListener{
    JPanel panel;
    
    JLabel label1=new JLabel("Ingresa números para sumar ");
    JTextField texto1=new JTextField();
    JButton boton1=new JButton("Sumar");
    JLabel label2=new JLabel();
    
	public static void main(String args[]){
	  EF4 ventana = new EF4();
          ventana.show();
	}

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    panel= new JPanel();
    setContentPane(panel);
    panel.setLayout(null);
    
    
    label1.setBounds(20,50,200,40);
    texto1.setBounds(20,100,200,40);
    boton1.setBounds(20,140,100,40);
    label2.setBounds(20,190,130,40);
    boton1.addActionListener(this);
    
    panel.add(label1);
    panel.add(label2);
    panel.add(texto1);
    panel.add(boton1);

  }
  
  

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    for(String numero:numeros)
    {
        suma=suma+Integer.parseInt(numero);
    }
    return suma+"";
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        label2.setText(getSuma(texto1.getText()));
        
    }

}