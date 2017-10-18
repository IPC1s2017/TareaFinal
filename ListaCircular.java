
package tarea_final_5;

public class ListaCircular {
   public Nodo primero;
   public Nodo ultimo; 
  
  
  public ListaCircular(int dato){
      primero = new Nodo(dato);
      ultimo = primero;
    
  }
  public void InsertarAlFinal(int dato){
     //primero = new Nodo(dato);
          Nodo nuevo = new Nodo(dato);
          ultimo.siguiente = nuevo;
          primero = nuevo;
  }
  public void Imprimir(){
      Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }
}
