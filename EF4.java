import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame{
    
    private JPanel contentPane;
    private JTextField texto;
    private JLabel sum;
    private JLabel result;
    private JLabel insert;
    private JButton operar;
    
  public static void main(String args[]){
            EF4 ventana = new EF4();
            ventana.show();
  }

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
      
      
    this.contentPane = (JPanel) getContentPane();
    this.contentPane.setSize(250,300);
    this.contentPane.setLayout(null);
    
    texto = new JTextField();
    texto.setBounds(20,50,200,25);
    contentPane.add(texto);
        
    insert = new JLabel();
    insert.setText("Ingrese Numeros Separados por coma");
    insert.setBounds(05,10,220,20);
    contentPane.add(insert);
    
    sum = new JLabel();
    sum.setText("Suma:");
    sum.setBounds(75,200,50,20);
    contentPane.add(sum);
    
    result = new JLabel();
    result.setBounds(130,200,100,20);
    contentPane.add(result);
    
    operar = new JButton("Operar");
    operar.setBounds(60,100,125,30);
    
    operar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent evt){
                
                operar(evt);
            }
            });
    contentPane.add(operar);
  }
  

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    try{
        for(String numero:numeros)
    {
        suma += Integer.parseInt(numero);
    }   
    return suma+"";
  }
  catch(NumberFormatException m){
        return "Ingrese numeros";
    }
  }

public void operar(ActionEvent evt){
    String entrada = texto.getText();
    result.setText(getSuma(entrada));
}

}