import java.util.Scanner;
import java.util.StringTokenizer;


public class EF3 {

    
    public static void main(String[] args) {
        
        
    String Opcion;
    String Mensaje = "";
    String Encriptado = "";
    String Desencriptado = "";
    String Mensaje2 = "";
    float m,x,c,d;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese el mensaje a encriptar");
    Opcion = teclado.next();
    
    for(int i=0; i<Opcion.length(); i++){
        x = Opcion.codePointAt(i);
        c = (((5*x)+11)/26)+1;
        int y = (int) x;
        Mensaje = Mensaje + y + "  ";
        Encriptado = Encriptado + c + "  ";
        
    }
    System.out.println("El codigo del mensaje original es: "+Mensaje);
    System.out.println("El codigo del mensaje encriptado es: "+Encriptado);
    
    StringTokenizer Caracter = new StringTokenizer(Encriptado, "  ");
    while(Caracter.hasMoreTokens()){
        m = Float.parseFloat(Caracter.nextToken());
        d = ((26*m)-37)/5;
        int z = (int) d;
        char Letra = (char)z;
        Mensaje2 = Mensaje2 + z +"  ";
        Desencriptado = Desencriptado + Letra;
    }
    System.out.println("El codigo del mensaje desencriptado es: "+Mensaje2);
    System.out.println("El mensaje desencriptado es: "+Desencriptado);
    }
    
}