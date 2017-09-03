import java.io.IOException;
import java.util.Scanner;

public class EF3 {
        public static Scanner entrada = new Scanner(System.in);
        public static String texto;
        public static int numero;
        public static char opcion;
        public static String mensaje;
        
        
        
    
public static void main(String []args) throws IOException{
        
                do {
                    

            System.out.print("Introduce un texto o mensaje: ");

            texto = entrada.nextLine();

        } 
                while (texto.isEmpty());

        

        do {

            System.out.println("Presione 1 para cifrar o descifrar ");
           

            numero = entrada.nextInt();

        } while (numero < 1);

        
        int condicion =0;
        do {

            entrada.nextLine();

           
           System.out.println("Presione la tecla c: si quiere cifrar el mensaje");
           System.out.println("Presione la tecla d: si quiere descifrar el mensaje");
          

        opcion = (char) System.in.read();

        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');

        if (Character.toUpperCase(opcion) == 'C') {

         System.out.println("Texto cifrado: " + Cifrar(texto, numero));
         System.out.println("Texto Introducido : " + texto + " Texto cifrado : " + Cifrar(mensaje,numero));    
        } else {

            System.out.println("Texto descifrado: " + Descifrar(texto, numero));
            mensaje=Descifrar(mensaje, numero);
            System.out.println("Texto Introducido : " + texto + " Texto descifrado : " + mensaje);  
            
        }
       
       
         
    
    

       }
    public static String Cifrar(String mensaje,int numero){
        StringBuilder cifrado = new StringBuilder();

        numero = numero % 26;

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {

                if ((texto.charAt(i) + numero) > 'z') {

                    cifrado.append((char) (texto.charAt(i) + numero - 26));

                } else {

                    cifrado.append((char) (texto.charAt(i) + numero));

                }

            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {

                if ((texto.charAt(i) + numero) > 'Z') {

                    cifrado.append((char) (texto.charAt(i) + numero - 26));

                } else {

                    cifrado.append((char) (texto.charAt(i) + numero));

                }

            }

        }
        
			
return cifrado.toString();

    }

        
public static String Descifrar(String mensaje,int codigo){
        StringBuilder cifrado = new StringBuilder();
        
        codigo = codigo % 26;

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {

                if ((texto.charAt(i) - codigo) < 'a') {

                    cifrado.append((char) (texto.charAt(i) - codigo + 26));

                } else {

                    cifrado.append((char) (texto.charAt(i) - codigo));

                }

            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {

                if ((texto.charAt(i) - codigo) < 'A') {

                    cifrado.append((char) (texto.charAt(i) - codigo + 26));

                } else {

                    cifrado.append((char) (texto.charAt(i) - codigo));

                }

            }

        
        }
					
return cifrado.toString();

}
            


    }


