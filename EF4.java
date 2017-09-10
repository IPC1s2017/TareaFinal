package tareafinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EF4 extends JFrame {

    private JPanel contentPane;
    private JButton btnOk;
    private JTextField txtIngrese, txtResultado;
    private JLabel lblIngrese, lblResultado;

    public static void main(String args[]) {
        EF4 ventana = new EF4();
        ventana.show();
    }

    public EF4() {
        setSize(250, 300);
        setTitle("Sumadora");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        this.iniciar_componente();

    }

    public void iniciar_componente() {
        this.contentPane = (JPanel) getContentPane();
        this.contentPane.setLayout(null);
        this.contentPane.setSize(250, 300);

        this.lblIngrese = new JLabel("Ingrese los numeros");
        this.lblIngrese.setSize(150, 30);
        this.lblIngrese.setLocation(60, 20);
        this.contentPane.add(this.lblIngrese);

        this.txtIngrese = new JTextField();
        this.txtIngrese.setSize(150, 30);
        this.txtIngrese.setLocation(10, 60);
        this.contentPane.add(this.txtIngrese);

        this.btnOk = new JButton("OK");
        this.btnOk.setSize(60, 30);
        this.btnOk.setLocation(170, 60);
        this.contentPane.add(this.btnOk);

        this.lblResultado = new JLabel("resultado");
        this.lblResultado.setSize(150, 30);
        this.lblResultado.setLocation(60, 120);
        this.contentPane.add(this.lblResultado);
        
        this.txtResultado = new JTextField();
        this.txtResultado.setSize(80, 30);
        this.txtResultado.setLocation(45, 150);
        this.btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnOK(evt);
            }
        });
        this.contentPane.add(this.txtResultado);
    }

    public String getSuma(String entrada) {
        String[] numeros = entrada.split(", ");
        int suma = 0;
    //Realizar suma
    for(String numero:numeros)
    {
        suma += Integer.parseInt(numero);
    }
    return suma+"";
    }
    
    public void btnOK(ActionEvent evt){
        String entrada = this.txtIngrese.getText();
        this.lblResultado.setText(this.getSuma(entrada));
        this.txtIngrese.setText("");
    }

}
