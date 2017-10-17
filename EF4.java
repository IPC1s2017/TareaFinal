<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4ed0a9edb429775789ddb045e0145f53c7ad414b
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame{
    JButton btnAceptar;
    JTextField txtSumandos;
    JLabel lblSuma;
    
    public static void main(String args[]){
        EF4 ventana = new EF4();
        ventana.show();
    }

    public EF4(){
        setSize(250, 150);
        setTitle("Sumadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        lblSuma = new JLabel("<html>Escribe lo numeros que desees sumar y separalos por una coma. Ej: 10,-20,60,..</html>");
        lblSuma.setBounds(25,60,200,50);
        getContentPane().add(lblSuma);
        
        txtSumandos = new JTextField();
        txtSumandos.setBounds(25,30,125,25);
        getContentPane().add(txtSumandos);  
        
        btnAceptar = new JButton();
        btnAceptar.setText("Sumar");
        btnAceptar.setBounds(150,30,75,25);
        btnAceptar.addActionListener((ActionEvent e) -> {
            String entrada = txtSumandos.getText();
            lblSuma.setText(getSuma(entrada));
        });
        getContentPane().add(btnAceptar);
    }
        
    public String getSuma(String entrada){
        String[] numeros = entrada.split(",");
        int suma = 0;
        //Realizar suma
        try{
            for(String numero:numeros){
                suma += Integer.parseInt(numero);
            }
            return "El resultado es: "+suma+"";
        } catch (NumberFormatException e){
            return "<html>Escribe lo numeros que desees sumar y separalos por una coma. Ej: 10,-20,60,...</html>";
        }
    }
<<<<<<< HEAD
}
=======
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EF4 extends JFrame{

	public static void main(String args[]){
					EF4 ventana = new EF4();
          ventana.show();
	}

  public EF4(){
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

  }

  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    //Realizar suma
    for(String numero:numeros)
    {

    }
    return suma+"";
  }

}
>>>>>>> master
=======
}
>>>>>>> 4ed0a9edb429775789ddb045e0145f53c7ad414b
