
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author danie
 */
public class EF4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyVentana mb = new MyVentana();
    }
    
    public static class MyVentana extends JFrame{
         //Configuraciones
        
        public MyVentana(){
            setSize(800,525);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("EF 4");
            setLocationRelativeTo(null);
            JPanel pnlCuadricula4x4 = new JPanel();
            
            JLabel lblPR = new JLabel("Ingrese sus numeros ");
            JTextArea txtPR = new JTextArea ( 1, 15 );
            JButton btnCalculo = new JButton("Calcular");
            JLabel lblResultado = new JLabel(" Resultado : ");
            
            pnlCuadricula4x4.add(lblPR);
            pnlCuadricula4x4.add(txtPR);
            pnlCuadricula4x4.add(btnCalculo);
            pnlCuadricula4x4.add(lblResultado);
            
            this.add(pnlCuadricula4x4);
            
            btnCalculo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String[] numeros = txtPR.getText().replace(" ", "").split(",");
                    lblResultado.setText( "Resultado "+ String.valueOf(getSuma(numeros)));
                }
            });

        }
        
        public Integer getSuma(String[] numeros){
            Integer no = 0;
            for(int i=0; i<numeros.length; i++){
                no = no + Integer.parseInt(numeros[i]);
            }
            return no;
        }
        
        

    }

}


