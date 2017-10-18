public class ListaDoble{
  public Nodo primero;
 
  public ListaDoble(int dato){
      primero = new Nodo(dato);
	  primero.siguiente = null;
	  primero.anterior = null;
  }

  public void InsertarAlFrente(int dato){	
	Nodo auxiliar = new Nodo(dato);
	auxiliar.siguiente = primero;
	auxiliar.anterior = null;
	primero = auxiliar;
  }

  public void Imprimir(){
    Nodo auxiliar = primero;
    while(auxiliar!=null){
      auxiliar.Imprimir();
      auxiliar = auxiliar.siguiente;
    }
  }
}
