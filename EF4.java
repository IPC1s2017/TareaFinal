import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EF4 extends JFrame implements ActionListener {
JButton sumar=new JButton("SUMAR");
JTextField introducir=new JTextField();
JLabel imprimir =new JLabel();
//String resultado=introducir.getText();
//String[] numeros = resultado.split(",");

String entrada;
//String[] numeros = entrada.split(",");
public EF4(){
    
    setLayout(null);
    setTitle("LOGIN");
    setSize(500, 400);
    setLocationRelativeTo(null);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
   
    introducir.setBounds(40,150,200,30);
    sumar.setBounds(350,150,100,30);
    imprimir.setBounds(40, 200, 100, 100);
    sumar.addActionListener(this);
    add(introducir);
    add(sumar);   
    add(imprimir);
    //sumar.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent p){
if(p.getSource()==sumar){
int suma=0;


String resultado=introducir.getText();
String [] numeros=resultado.split(",");
int longitud=numeros.length;
int [] x=new int[longitud];
for(int i=0; i<numeros.length;i++){
    x[i] = Integer.parseInt(numeros[i]);
    suma=suma + x[i];
    }
String t;
t = String.valueOf(suma);
t= Integer.toString(suma);
add(imprimir);
imprimir.setText(t);

}
    
}


    

public static void main(String[] args) {
    EF4 ventana=new EF4();    
    ventana.show();
    }
    
}
