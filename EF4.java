import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.logging.*;
public class EF4 extends JFrame{
	static private JLabel imprimir=new JLabel();
	public static void main(String [] args){
		EF4 ventana=new EF4();
		ventana.show();
	}
	public EF4(){
		setSize(250, 300);
        setTitle("Sumadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        this.getContentPane().setLayout(null);
        JLabel entrada= new JLabel("Entrada");
        entrada.setBounds(25,25,100,22);
        
        JTextField ent =new JTextField();
        ent.setBounds(75,25,100,22);
        ent.setVisible(true);
        
        imprimir.setBounds(40, 200, 100, 100);
        imprimir.setVisible(true);
        
        JButton sumar=new JButton("Sumar");
        sumar.setBounds(50,85,80,22);
        sumar.setVisible(true);
        
        this.add(entrada);
        this.add(ent);
        this.add(sumar);
        this.add(imprimir);
        
       sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imprimir.setText(getSuma(ent.getText()));
              
            
            } 
            });
	}
	 public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    int incrementar = 0;
    //Realizar suma
    for(String numero:numeros)
    {
        int num = Integer.parseInt(numero);
        suma = incrementar + num;
        incrementar = suma;
    }
    return suma+"";

  }

}