import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EF4 extends JFrame{
    private JLabel resultado;
    private JTextField entrada;
    private JLabel instrucciones;
    private JPanel panel;
    private JButton suma;
    private JLabel total;
	public static void main(String args[]){
		  EF4 ventana = new EF4();
          ventana.show();
	}

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    //label donde que da instrucciones
    instrucciones=new JLabel();
    instrucciones.setBounds(10,30,220,40);
    instrucciones.setText("Ingrese numeros a sumar");
    //fin de configuracion de label que da instrucciones
    //textbox donde se ingesan los numeros a sumar
    entrada=new JTextField();
    entrada.setBounds(30, 80,100, 30);
    //fin de la configutacion de el dise;o 
    //configuracion de label qe va a dar resultado
    total=new JLabel();
    total.setText("Total:");
    total.setBounds(30, 130, 50, 30);
    resultado=new JLabel();
    resultado.setText("0");
    resultado.setBounds(70, 130, 50, 30);
    //boton donde se llevara a cabo la accion de sumar los numeros 
    suma=new JButton();
    suma.setText("sumar");
    suma.setBounds(150, 80, 80, 30);
    suma.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            resultado.setText(getSuma(entrada.getText()));
            
        }
    });
    //fin boton en el sual se llevaran a cabo la opcion de sumar
    panel=new JPanel();
    panel.setLayout(null);
    panel.add(instrucciones);
    panel.add(entrada);
    panel.add(suma);
    panel.add(total);
    panel.add(resultado);
    add(panel);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

  }

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    /*for(String numero:numeros)
    {
    	suma= suma+Integer.parseInt(numeros);
    }*/
    for(int i=0;i<numeros.length;i++){
       suma= suma+Integer.parseInt(numeros[i]);    
    }
    System.out.println(suma);
    return suma+"";
  }

}