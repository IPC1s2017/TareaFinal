
package main;

public class ListaCircular {
   public Nodo primero;
   public Nodo ultimo; 
  
    public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente = primero;
      ultimo = primero;
    
  }
  public void InsertarAlFinal(int dato){
       Nodo nuevo = new Nodo(dato);
       ultimo.siguiente = nuevo;/*nuevo.siguiente = primero;*/
       ultimo = nuevo;/*primero = nuevo;*/
       ultimo.siguiente = primero;
  }
  public void Imprimir(){
       Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
        System.out.print(", ");
      } while (auxiliar!=primero);
  }
}
   
