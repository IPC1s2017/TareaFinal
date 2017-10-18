public class ListaCircular{
  public Nodo primero;
  public Nodo ultimo;
 
  public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente=primero;
      ultimo=primero;
      /*
        completar el resto del código
      */
  }

  public void InsertarAlFinal(int dato){
      Nodo nuevo=new Nodo(dato);
      ultimo.siguiente=nuevo;
      ultimo=nuevo;
      ultimo.siguiente=primero;
    /*
      completar el resto del código
    */
  }

  public void Imprimir(){
      Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }

}