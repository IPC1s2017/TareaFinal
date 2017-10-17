

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
/**
 *
 * @author HPBEATS
 */
public class Main{

    public static void main(String[] args) {
      Main m = new Main();
      Pila pila = new Pila(0);
      Cola cola = new Cola(0);
      ListaDoble listadoble = new ListaDoble(0);
      ListaCircular listacircular = new ListaCircular(0);
      
      String aux = (m.readFile(m.openFile()));
      String[] matriz = aux.split(",");
      
        for (String matriz1 : matriz) {
            pila.Apilar(Integer.parseInt(matriz1));
            cola.Encolar(Integer.parseInt(matriz1));
            listadoble.InsertarAlFrente(Integer.parseInt(matriz1));
            listacircular.InsertarAlFinal(Integer.parseInt(matriz1));
        }
        
      System.out.println("Pila: ");
      pila.Imprimir();
      System.out.println("\n"+"Cola: ");
      cola.Imprimir();
      System.out.println("\n"+"Lista Doble: ");
      listadoble.Imprimir();
      System.out.println("\n"+"Lista Circular: ");
      listacircular.Imprimir();
      System.out.println("");
    }
    
    public File openFile(){
        JFileChooser mFileChooser = new JFileChooser();
        mFileChooser.setAcceptAllFileFilterUsed(true);//Â«All Files ("*")Â»
        int resultFileC = mFileChooser.showDialog(null, "Aceptar");
        if (resultFileC==JFileChooser.APPROVE_OPTION){
            mFileChooser.getSelectedFile().getAbsolutePath();
            return mFileChooser.getSelectedFile();
        } else {
            System.exit(0);
        }
        return null;
    }
    
    public String readFile(File archivo/*, int puntero*/){ 
        String aux = "", texto= "";
        
        try{
            if (archivo != null){
                BufferedReader mBuffer = new BufferedReader(new FileReader(archivo));//Solo para archivos Â«planosÂ»
                while ((aux=mBuffer.readLine())!=null){
                    texto += aux + ",";
                }
                mBuffer.close();
            }
        } catch (IOException e) {
            
        }
        return texto;
    }
    
    
            
}
