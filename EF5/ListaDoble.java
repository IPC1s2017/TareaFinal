package tad;
public class ListaDoble {
    
    public Nodo primero;
 
  public ListaDoble(int dato){
      primero = new Nodo(dato);   
  }

  public void InsertarAlFrente(int dato){
    Nodo nuevo= new Nodo(dato);
        nuevo.siguiente=primero;
        primero.anterior=nuevo;
        primero=nuevo;
  }

  public void Imprimir(){
      System.out.println("Salida de la Lista doble");
    Nodo auxiliar = primero;
    while(auxiliar!=null){
      System.out.println(auxiliar.dato);
      auxiliar = auxiliar.siguiente;
    }
  }
}
