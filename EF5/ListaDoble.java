
public class ListaDoble{
  public Nodo primero;
 
  public ListaDoble(int dato){
      primero = new Nodo(dato);
      //primero.anterior = primero;
      //primero.siguiente = primero;
  }

  public void InsertarAlFrente(int dato){
    Nodo nuevo = new Nodo(dato);
    //nuevo.siguiente = primero;
    if (primero == null){
        primero = nuevo;
    } else {
        nuevo.siguiente = primero;
        primero.anterior = nuevo;
        primero = nuevo;
    //    nuevo.anterior = primero.anterior;
    //    primero.anterior.siguiente = nuevo;
    //    primero.anterior = nuevo;
    //    primero = nuevo;
    }
  }

  public void Imprimir(){
    Nodo auxiliar = primero;
    while(auxiliar!=null){
      auxiliar.Imprimir();
      auxiliar = auxiliar.siguiente;
      System.out.print(", ");
    }
  }
}
