public class ListaCircular{
  public Nodo primero;
  public Nodo ultimo;

  public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente = primero;
	  primero.anterior = primero;
	  ultimo = primero;
	  
  }

  public void InsertarAlFinal(int dato){
    Nodo auxiliar = new Nodo(dato);
	primero.anterior = auxiliar;
	auxiliar.siguiente = primero;
	ultimo.siguiente = auxiliar;
	ultimo = auxiliar;
	
  }

  public void Imprimir(){
      Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }

}
