import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame {

    private JLabel Muestra;
    private JTextField Datos;
    private JButton Sumar;

    public static void main(String args[]) {
        EF4 ventana = new EF4();
        ventana.setVisible(true);
        ventana.show();
    }

    public EF4() {
        setSize(250, 300);
        setTitle("Sumadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Datos = new JTextField();
        Muestra = new JLabel("");
        Sumar = new JButton("Sumar");

        add("North", Datos);
        add("Center", Muestra);
        add("South", Sumar);

        Sumar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                SumarActionPerformed(evt);
            }

            private void SumarActionPerformed(ActionEvent evt) {

                if (Datos.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Introdusca Datos numericos ");
                    Datos.setText(" ");
 
                } else {
                    //Muestra.setText(Datos.getText());
                    EF4 E = new EF4();
                    E.getSuma(Datos.getText());
                    Muestra.setText(E.getSuma(Datos.getText()));
                    //Datos.setText(" ");
                }

            }

        });

    }

    public String getSuma(String entrada) {
        int suma = 0;
        int sum=0;
        String[] numeros = entrada.split(",");
        //Realizar suma
        for (String numero : numeros) {

            suma = Integer.parseInt(numero) + sum;
            sum= suma;
        }

        return suma + "";

    }

}
