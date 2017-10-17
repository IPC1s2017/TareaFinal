package tad;

/**
 *
 * @author lenovo
 */
public class ListaCircular {
    
    public Nodo primero;
  public Nodo ultimo;

  public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente=primero;
  }

  public void InsertarAlFinal(int dato){
        Nodo nuevo= new Nodo(dato);
        //ultimo.siguiente=nuevo;
        ultimo=nuevo;
        ultimo.siguiente=primero;
  }

  public void Imprimir(){
      System.out.println("Salida de la Lista circular");
      Nodo auxiliar = primero;
      do {
        System.out.println(auxiliar.dato);
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }
    
}
