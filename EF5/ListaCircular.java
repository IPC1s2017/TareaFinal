package tad;
public class ListaCircular {
    
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

    public void InsertarAlFinal(int x) {
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
    
    public void Imprimir(){
        Nodo aux = primero;
        do{
            System.out.print(aux.dato+", ");
            aux = aux.siguiente;
        }while(aux!=primero);
        System.out.println("");
    }
    
}
