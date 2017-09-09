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
