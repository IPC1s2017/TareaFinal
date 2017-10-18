/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef5;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Jose David
 */
public class EF5 extends JFrame{
    JPanel panen ;
    JLabel lmostrar;
    JButton cargar;
   public EF5(){
       setSize(400,500);
       setDefaultCloseOperation(EF5.EXIT_ON_CLOSE);
      
       setTitle("Ejercicio 5");
       panen =new JPanel();
        panen.setLayout(new GridLayout());
         panen.setVisible(true);
        setLayout(new GridLayout());
         
       lmostrar= new JLabel("hola");
     
       cargar=new JButton("cargar");
      cargar.setBounds(20, 100, 20, 30);
      
       panen.add(cargar);
       panen.add(lmostrar);
       this.add(panen);
       this.setVisible(true);
   
   
   }
    public void Archivo(){
        Pila pila = new Pila(0);
      Cola cola = new Cola(0);
      ListaDoble listadoble = new ListaDoble(0);
      ListaCircular listacircular = new ListaCircular(0);

      /*
        Lectura del archivo para poder llenar las estructuras de datos
      */




      /*
        Imprimir cada una de las estructura de datos
      */
//      pila.Imprimir();
//      cola.Imprimir();
//      listadoble.Imprimir();
//      listacircular.Imprimir();

    }

  
    
}
