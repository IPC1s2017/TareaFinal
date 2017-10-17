package tad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TAD {

    /**
     * @param args the command line arguments
     */
    JButton aceptar,cargar;
    static JPanel panel;
     Pila pila=new Pila(0);
      Cola cola=new Cola(0);
      ListaDoble listadoble= new ListaDoble(0);
      ListaCircular listacircular=new ListaCircular(0);
    public static void main(String[] args) {
       TAD t= new TAD();
      t.leer(t.OpenFile());
      t.pila.Imprimir();
      t.cola.Imprimir();
      t.listadoble.Imprimir();
      t.listacircular.Imprimir();  
    }
    public File OpenFile(){
           JFileChooser mFileChooser= new JFileChooser();
           mFileChooser.setAcceptAllFileFilterUsed(true);
           int resultFileC= mFileChooser.showDialog(panel, null);
           if(resultFileC==JFileChooser.APPROVE_OPTION){
               mFileChooser.getSelectedFile().getAbsolutePath();
               return mFileChooser.getSelectedFile();
           }
       return null;
       }
       public void leer(File archivo){
           String aux="";
           try{
               if(archivo != null){
                   BufferedReader mBuffer= new BufferedReader(new FileReader(archivo));
                   while((aux=mBuffer.readLine())!=null){
                       pila.Apilar(Integer.parseInt(aux));
                       cola.Encolar(Integer.parseInt(aux));
                       listadoble.InsertarAlFrente(Integer.parseInt(aux));
                       listacircular.InsertarAlFinal(Integer.parseInt(aux));
                   }
                   mBuffer.close();
               }
               
           }catch(IOException e){
               
           }
           
       }

}