package ipc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 22437
 */
public class EF4 extends JFrame implements ActionListener {
//JLabel lblTitulo =  new JLabel("Ingrese cualquier digito seguido de coma (,)");
JButton btnSuma=new JButton("SUMAR");
JButton btnNuevo=new JButton("Intentar de nuevo");
JTextField txtDigito=new JTextField();
JLabel lblResultado =new JLabel();
public EF4(){
    
    setLayout(null);
    setSize(280, 150);
    setLocationRelativeTo(null);
    setTitle("Sumadora");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
  //  lblTitulo.setBounds(10, 10, 400, 25);
    txtDigito.setBounds(10,40,100,25);
    btnSuma.setBounds(120,40,100,25);
    btnNuevo.setBounds(120,75,100,25);
    lblResultado.setBounds(10, 75, 100, 25);
    btnSuma.addActionListener(this);
    add(txtDigito);
    add(btnSuma);   
    add(lblResultado);
//    add(lblTitulo);
    add(btnNuevo);
}


@Override
public void actionPerformed(ActionEvent p){
if(p.getSource()==btnSuma){
    try {
        int suma=0;
String resultado=txtDigito.getText();
String [] numero=resultado.split(",");
int longitud=numero.length;
int [] x=new int[longitud];
for(int i=0; i<numero.length;i++){
    x[i] = Integer.parseInt(numero[i]);
    suma=suma + x[i];
    }
String r;
r = String.valueOf(suma);
r = Integer.toString(suma);
add(lblResultado);
lblResultado.setText("Resultado: "+ r);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "DATO ERRONEO");
    }


}
    
}


    

public static void main(String[] args) {
    EF4 ventana=new EF4();    
    ventana.show();
    }
    
}
