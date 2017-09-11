/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 *
 * @author LuisMiguel
 */
public class EF4 extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JFrame ef4;
    JButton boton;
    JTextField text;
    JLabel etiqueta;

    public EF4() {

        ef4 = new JFrame("EF4");
        ef4.setSize(640, 260);
        ef4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ef4.setVisible(true);
        ef4.setResizable(false);
        ef4.setLocationRelativeTo(null);
        ef4.setLayout(null);

        boton = new JButton("Sumar split");
        boton.setBounds(270, 150, 100, 30);
        ef4.add(boton);
        boton.addActionListener(this);

        text = new JTextField();
        text.setBounds(95, 60, 450, 30);
        ef4.add(text);
        
        etiqueta = new JLabel();
        etiqueta.setText("Ingrese numeros separados por comas para sumatoria");
        etiqueta.setBounds(60, 100, 500, 30);
        ef4.add(etiqueta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            etiqueta.setText(String.valueOf(sumar()));
        }
    }

    public int sumar() {
        int i;
        int sumatoria = 0;
        try {
            String[] texto = text.getText().split(",");
            int[] numeros = new int[texto.length];

            for (i = 0; i < texto.length; i++) {
                numeros[i] = Integer.parseInt(texto[i]);
            }
            for (i = 0; i < numeros.length; i++) {
                sumatoria = sumatoria + numeros[i];
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(text, e);
        }
        return sumatoria;
    }

    public static void main(String[] args) {
        new EF4();
    }

}
