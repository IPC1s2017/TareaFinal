public class ListaCircular{
  public Nodo primero;
  public Nodo ultimo;

  public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente=primero;
  }

  public void InsertarAlFinal(int dato){
       Nodo nuevo= new Nodo(dato);
       ultimo=nuevo;
       ultimo.siguiente=primero;
  }

  public void Imprimir(){
      Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }

}
