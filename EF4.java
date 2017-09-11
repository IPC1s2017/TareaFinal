import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    
public class EF4 extends JFrame implements ActionListener{
   JButton sumar;
   JTextField ingresar;
   JLabel texto;
   JLabel resultado;
	public static void main(String args[]){
      
	EF4 ventana = new EF4();
          ventana.show();
        }
            
  public EF4(){
    setSize(350, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(null);
    
    texto = new JLabel();
    texto.setText("Ingrese la serie de números separados por coma:");
    texto.setBounds(15, 70, 1000, 20);
    getContentPane().add(texto);
    
    ingresar = new JTextField();
    ingresar.setBounds(45, 120, 250, 20);
    getContentPane().add(ingresar);
    
    sumar = new JButton();
    sumar.setText("Sumar");
    sumar.setBounds(120, 170, 100, 20);
    getContentPane().add(sumar);
     sumar.addActionListener(this);

    
    resultado = new JLabel();
    resultado.setText("");
    resultado.setBounds(150, 220, 100, 20);
    getContentPane().add(resultado);
    
   
  }

  public  String getSuma(){
    String entrada = ingresar.getText().trim();
     String [] numeros;
       numeros = entrada.split(",");
       int suma = 0;
       for(int i=0; i< numeros.length; i++){
           
          suma =+ suma + Integer.parseInt(numeros[i]);
          
        }
       
   resultado.setText(String.valueOf(suma));
    return "";
  }

    @Override
    public void actionPerformed(ActionEvent evento) {
       
       if(evento.getSource()== sumar){ 
           
           getSuma();
       }
        
    }
    
        
        }