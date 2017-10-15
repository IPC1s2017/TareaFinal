public class ListaDoble{
  public Nodo primero;
 
  public ListaDoble(int dato){
      primero = new Nodo(dato);
      /*
        completar el resto del código
      */
  }

  public void InsertarAlFrente(int dato){
    /*
      completar el resto del código
    */
  }

  public void Imprimir(){
    Nodo auxiliar = primero;
    while(auxiliar!=null){
      auxiliar.Imprimir();
      auxiliar = auxiliar.siguiente;
    }
  }
}
