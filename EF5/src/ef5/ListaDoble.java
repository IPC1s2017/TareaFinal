package ef5;


public class ListaDoble{
  public Nodo primero;

  public ListaDoble(int dato){
      primero = new Nodo(dato);
      primero.anterior=primero;
      primero.siguiente=primero;
  }

  public void InsertarAlFrente(int dato){
   Nodo nuevo=new Nodo(dato);
   nuevo.siguiente=primero;
   nuevo.anterior=primero.anterior;
   primero.anterior.siguiente=nuevo;
   primero.anterior=nuevo;
   primero=nuevo;
  }

  public void Imprimir(){
    Nodo auxiliar = primero;
    do {
        auxiliar.Imprimir();
      
        auxiliar = auxiliar.siguiente;
          
      } while (auxiliar!=primero);

  }
  
}
