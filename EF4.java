package ef4;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EF4 extends JFrame  {
    public JLabel texto;
    public JLabel texto2;
    public JLabel texto3;
    public JTextField caja;        
    public JButton boton;  
	public static void main(String args[]){
            
					EF4 ventana = new EF4();
          ventana.show();
          
	}
  public EF4(){
    super();
    setSize(250, 300);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(null);  
        texto = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        texto.setText("Inserte Listado de numeros"); 
        texto.setBounds(50, 50, 200, 25);  
        texto2.setText("Resultado:"); 
        texto2.setBounds(50, 150, 100, 25);  
        texto3.setBounds(50, 170, 50, 25);  
        caja.setBounds(40, 75, 175, 30);   
        caja.setText("212,31,50,10,23,4,1,0,25");
        boton.setText("Sumar");  
        boton.setBounds(80, 120, 80, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        this.add(texto);
        this.add(texto2);
        this.add(texto3);
        this.add(caja);
        boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            texto3.setText(getSuma(caja.getText()));
        }
        });
        this.add(boton);
  }
  public String getSuma(String entrada){
    String[] numeros = entrada.split(",");
    int suma = 0;
    int valor =0;
    //Realizar suma
    for(String numero:numeros)
    {
        int N = Integer.parseInt(numero);
        suma = valor + N;
        valor = suma;
    }
    return suma+"";
  }
}