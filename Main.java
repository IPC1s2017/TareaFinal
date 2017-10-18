
package main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
public static String[] Numeros ;
public static int [] x;
 static String cadena;
 static  int numero;
 static  int cont;
 static int i;
     
public static void main(String[] args) throws IOException {
     
    
   
     Archivo("C:\\User\\Waleska Martinez\\Documents\\Fibonacci.txt");

    }
    public static  void Archivo(String archivo) throws FileNotFoundException, IOException {
    
        Pila pila = new Pila(cont);
        Cola cola=new Cola(cont);
        ListaDoble doble= new ListaDoble(cont);
        ListaCircular listacircular=new ListaCircular(cont);
      
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
     
     
      while((cadena = b.readLine())!=null) {
      
      Numeros = cadena.split(",");
     int longitud=Numeros.length;
      x=new int[longitud];
      
        for ( i = 0; i < Numeros.length; i++) {
        x[i] = Integer.parseInt(Numeros[i]);
	
        pila.Apilar(x[i]);
        cola.Encolar(x[i]);
        doble.InsertarAlFrente(x[i]);
        listacircular.InsertarAlFinal(x[i]);
     
        
        
}
         System.out.println(" PILA ");
         pila.Imprimir();
          System.out.println("");
         System.out.println(" COLA ");
         cola.Imprimir();
         System.out.println("");
         System.out.println(" LISTA DOBLE ");
         doble.Imprimir();
         System.out.println("");
         System.out.println("Lista Circular");
         listacircular.Imprimir();
    
      }
      b.close();

}
}

