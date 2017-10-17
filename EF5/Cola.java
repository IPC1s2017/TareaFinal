package tad;

/**
 *
 * @author lenovo
 */
public class Cola {
    
    public Nodo primero;
  public Nodo ultimo;


  public Cola(int dato){
      primero = new Nodo(dato);
      ultimo = primero;
  }

  public void Encolar(int dato){
    Nodo nuevo = new Nodo(dato);
    ultimo.siguiente = nuevo;
    ultimo = nuevo;
  }

  public int Desencolar(){
    int dato = primero.dato;
    primero=primero.siguiente;
    return dato;
  }

  public void Imprimir(){
      System.out.println("Salida de la cola");
    while(primero!=null){
      System.out.println(Desencolar());
    }
  }
    
}
