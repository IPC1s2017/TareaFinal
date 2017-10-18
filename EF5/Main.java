
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Pila pila = new Pila(0);
        Cola cola = new Cola(0);
        ListaDoble listadoble = new ListaDoble(0);
        ListaCircular listacircular = new ListaCircular(0);

        /*
        Lectura del archivo para poder llenar las estructuras de datos
         */
        String[] fibonaccitexto;
        int[] fibonacci;

        int i;
        File f = new File("Fibonacci.txt");
        BufferedReader entrada;
        try {
            entrada = new BufferedReader(new FileReader(f));
            String linea;
            while (entrada.ready()) {
                linea = entrada.readLine();
                fibonaccitexto = linea.split(",");

                fibonacci = new int[fibonaccitexto.length];
                for (i = 0; i < fibonaccitexto.length; i++) {
                    fibonacci[i] = Integer.parseInt(fibonaccitexto[i]);
                }

                for (i = 0; i < fibonacci.length; i++) {
                    pila.Apilar(fibonacci[i]);
                }
                for (i = 0; i < fibonacci.length; i++) {
                    cola.Encolar(fibonacci[i]);
                }
                for (i = 0; i < fibonacci.length; i++) {
                    listadoble.InsertarAlFrente(fibonacci[i]);
                }
                for (i = 0; i < fibonacci.length; i++) {
                    listacircular.InsertarAlFinal(fibonacci[i]);
                }

                /*
        Imprimir cada una de las estructura de datos
                 */
                System.out.println("Pila");
                pila.Imprimir();
                System.out.println("Cola");
                cola.Imprimir();
                System.out.println("Lista doble");
                listadoble.Imprimir();
                System.out.println("Lista circular");
                listacircular.Imprimir();
                //System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
