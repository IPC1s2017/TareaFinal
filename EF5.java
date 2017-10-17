import java.io.*;

public class EF5 {
     class Pila {

    class Nodo {

        int dato;
        Nodo siguiente;
    }

    private Nodo cabeza;

    public Pila() {
        cabeza = null;
    }
    
    //************************************************************************//
    //                                 PILA                                   //
    //************************************************************************//

    public void insetar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        if (cabeza == null) {
            nuevo.siguiente = null;
            cabeza = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
    }

    public int extraer() {
        if (cabeza != null) {
            int dato = cabeza.dato;
            cabeza = cabeza.siguiente;
            return dato;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimirPila() {
        Nodo pila = cabeza;
        while (pila != null) {
            System.out.print(pila.dato + ", ");
            pila = pila.siguiente;
        }
        System.out.println("");
    }
  
}
    
     class Cola {
    
     class Nodo {

        public int dato;
        public Nodo siguiente;
        public Nodo anterior;
        
    }

    private Nodo cabeza, fondo;

    public Cola() {
        cabeza = null;
        fondo = null;
    }
    
    boolean vacia(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarCola(int x){
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        nuevo.siguiente = null;
        if (vacia()) {
            cabeza = nuevo;
            fondo = nuevo;
        }else{
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
    }
    
    public int extrarCola(){
        if(!vacia()){
            int info = cabeza.dato;
            if (cabeza == fondo) {
                cabeza = null;
                fondo = null;
            }else{
                cabeza = cabeza.siguiente;
            }
            return info;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimirCola(){
        Nodo aux = cabeza;
        while(aux!=null){
            System.out.print(aux.dato+", ");
            aux = aux.siguiente;
        }
    }
}
    
     class ListaCircular {

    class Nodo {

        public int dato;
        public Nodo siguiente;
        public Nodo anterior;
    }
    
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaCircular(){
        primero = null;
        ultimo = null;
    }

    public void Insertar_al_final(int x) {
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = primero;
        }else{
        ultimo.siguiente =nuevo;
        nuevo.siguiente = primero;
        ultimo = nuevo;
        }
    }
    
    public void impirmirListaCircular(){
        Nodo aux = primero;
        do{
            System.out.print(aux.dato+", ");
            aux = aux.siguiente;
        }while(aux!=primero);
        System.out.println("");
    }

}
    
     class ListaDoble {
    class Nodo{
        public int dato;
        public Nodo siguiente;
        public Nodo anterior;
    }
     private Nodo primero;
    public ListaDoble(){
        primero = null;
}
    public void InsetarInicioLD(int x){
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        if(primero == null){
            primero =nuevo;
        }else{
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
    }
    
    public void impirmirLD(){
        Nodo aux = primero;
        while(aux!=null){
            System.out.print(aux.dato+", ");
            aux = aux.siguiente;
        }
        System.out.println("");
    }
}
    
     class LeerArchivo {
    public String leerFibonacci(String archivo){
        String texto = "";
        try {
            BufferedReader mBuffer = new BufferedReader(new FileReader(archivo));
            String bfReader;
            String aux= "";
            while((bfReader = mBuffer.readLine())!= null){
                aux = aux + bfReader;
            }
            texto = aux;
            mBuffer.close();
        } catch (Exception e) {
        }return texto;
        
    }
}
    
     void leerArchivo() {
        LeerArchivo la = new LeerArchivo();
        String fibonnacci = la.leerFibonacci("C:\\Users\\Pasco Dominguez\\Documents\\NetBeansProjects\\TareaFinal\\archivo.txt");
        System.out.println("FIBONACCI");
        System.out.println(fibonnacci);
        String numeros[] = fibonnacci.split(", ");
        int n = 0;
        
        Pila miPila = new Pila();
        Cola cl = new Cola();
        ListaCircular listaC = new ListaCircular();
        ListaDoble ld = new ListaDoble();
        
        for (int i = 0; i < numeros.length; i++) {
            n = Integer.parseInt(numeros[i]);
            miPila.insetar(n);
            cl.insertarCola(n);
            listaC.Insertar_al_final(n);
            ld.InsetarInicioLD(n);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("PILA");
        miPila.imprimirPila();
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("COLA");
        cl.imprimirCola();
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("LISTA DOBLE (InsertaralFrente)");
        ld.impirmirLD();
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("LISTA CIRCULAR (InsertaralFinal)");
        listaC.impirmirListaCircular();
        
    }
    
         void escribirArchivo() {
        File archivo;
        String fibonacci = "0, 1, 1, 2, 5, 8, 13, 21, 34, 55, 89";
        try {
            archivo = new File("archivo.txt");
            if (archivo.createNewFile()) {
                System.out.println("se ha creado el archivo");
                FileWriter escribir = new FileWriter(archivo); //escribir en una sola linea de texto
                PrintWriter linea = new PrintWriter(escribir);//para esccribir en varias lineas de texto
                linea.println(fibonacci);
                linea.close();
                escribir.close();
            }
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo" + e);
        }
    }
        
        public static void main(String[] args) {
        EF5 tad = new EF5();
        tad.escribirArchivo();
        tad.leerArchivo();
    }
}
