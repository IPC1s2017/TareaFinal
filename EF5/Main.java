
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main{
    static String [] vector;
    public static void main(String[] args) {
      Pila pila=new Pila(0);
      Cola cola=new Cola(0);
      ListaDoble listadoble=new ListaDoble(0);
      ListaCircular listacircular=new ListaCircular(0);

      /*
        Lectura del archivo para poder llenar las estructuras de datos
      */

        File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      

      try {
        
         archivo = new File ("C:\\Users\\jorgi\\OneDrive\\Documentos\\NetBeansProjects\\Main\\src\\Fibonacci.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         
         String Cadena;
         while((Cadena=br.readLine())!=null){
            System.out.println(Cadena);
            vector=Cadena.split(",");
            
         }
         
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
for(int i=0;i<vector.length;i++){
                //System.out.print(vector[i]+" ");
                pila = new Pila(Integer.parseInt(vector[i]));
                pila.Apilar(Integer.parseInt(vector[i]));
                cola = new Cola(Integer.parseInt(vector[i]));
                listadoble = new ListaDoble(Integer.parseInt(vector[i]));
                listacircular = new ListaCircular(Integer.parseInt(vector[i]));
         }

      /*
        Imprimir cada una de las estructura de datos
      */
      pila.Imprimir();
      cola.Imprimir();
      listadoble.Imprimir();
      listacircular.Imprimir();

    }
}
