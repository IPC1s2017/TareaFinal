public class Pila{
  public Nodo primero;

  public Pila(int dato){
      primero = new Nodo(dato);
     // System.out.println("Estoy en la pila "+dato);
  }

  public void Apilar(int dato){
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = primero;
    primero = nuevo;
    //nuevo.Imprimir();
    //System.out.println("Estoy apilando "+dato);
  }

  public int Desapilar(){
    int dato = primero.dato;
    primero = primero.siguiente;
    //System.out.println("Estoy desapilando "+dato);
    return dato;
    
  }

  public void Imprimir(){
    while(primero!=null){
      System.out.println(Desapilar());
    }
  }


}