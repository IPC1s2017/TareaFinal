
package tarea_final_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class main {
public static String[] arrayNumeros ;
public static int [] x;
 static String cadena;
 static  int numero;
 static  int num;
 static int i;
     
public static void main(String[] args) throws IOException {
     
    
   
     muestraArchivo("C:\\Users\\Sergio_RPR\\Documents\\EF5\\Finobacci.txt");

    }
    public static  void muestraArchivo(String archivo) throws FileNotFoundException, IOException {
    
        Pila pila = new Pila(num);
        Cola cola=new Cola(num);
        ListaDoble doble= new ListaDoble(num);
        ListaCircular circular=new ListaCircular(num);
      
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
     
     
      while((cadena = b.readLine())!=null) {
      
      arrayNumeros = cadena.split(",");
      int longitud=arrayNumeros.length;
      x=new int[longitud];
      
        for ( i = 0; i < arrayNumeros.length; i++) {
        x[i] = Integer.parseInt(arrayNumeros[i]);
	//System.out.println(arrayNumeros[i]);
        //x[i]=num;
        pila.Apilar(x[i]);
        cola.Encolar(x[i]);
        doble.InsertarAlFrente(x[i]);
     
        //System.out.print(" " + x[i]);
        //pila.Imprimir();
         
        
        
}
         System.out.println(" PILA ");
         pila.Imprimir();
          System.out.println("");
         System.out.println(" COLA ");
         cola.Imprimir();
         
         System.out.println(" LISTA DOBLE ");
         doble.Imprimir();
         System.out.println("");
    
      }
      b.close();

}
}