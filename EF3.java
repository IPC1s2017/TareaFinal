import java.util.Scanner;
public class EF3 {

    public static void main(String args[]) {
        Encriptador p = new Encriptador();
        System.out.println("Escria su mensaje");
        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();
        p.cifrar(mensaje);
    }

    public static class Encriptador {

        private String abc[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",};

        private String mensaje;

        private String[] cifrado;
        private int cadenaNumeros[];

        public String cifrar(String mensaje) {

            System.out.println("+++++++++++ MENSAJE A CIFRAR +++++++++");
            System.out.println(mensaje);
            System.out.println("");
            System.out.println("");
            String cadena = "";
            //limpia espacios en blanco
            for (int i = 0; i < mensaje.length(); i++) {
                if (mensaje.charAt(i) != ' ') {
                    cadena = cadena + mensaje.charAt(i);
                }
            }
            //compara cada caracter
            cadenaNumeros = new int[cadena.length()];
            for (int c = 0; c < cadena.length(); c++) {
                for (int x = 0; x < abc.length; x++) {
                    if (cadena.charAt(c) == abc[x].charAt(0)) {
                        cadenaNumeros[c] = (5 * x + 11) % 26 + 1;

                    }
                }
            }

            //cifrado
            String cifradoMostrar = "";
            cifrado = new String[cadenaNumeros.length];
            System.out.println("+++++++++++ MENSAJE CIFRADO  +++++++++");
            for (int i = 0; i < cadena.length(); i++) {
                for (int j = 0; j < abc.length; j++) {
                    if (cadenaNumeros[i] == j) {
                        cifrado[i] = abc[j];
                        System.out.print(abc[j]);
                        cifradoMostrar = abc[j];
                    }
                }
            }
            System.out.println("");
            System.out.println("");

            return cifradoMostrar;
        }

    }
}