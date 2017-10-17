public class ListaCircular{
  public Nodo primero;
  public Nodo ultimo;

  public ListaCircular(int dato){
      primero = new Nodo(dato);
      /*
        completar el resto del código
      */
  }

  public void InsertarAlFinal(int dato){
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
