public class Cola{
  public Nodo primero;
  public Nodo ultimo;


  public Cola(int dato){
      primero = new Nodo(dato);
      ultimo = primero;
  }

  public void Encolar(int dato){
    Nodo nuevo = new Nodo(dato);
    ultimo.siguiente = nuevo;
    ultimo = nuevo;
  }

  public int Desencolar(){
    int dato = primero.dato;

   int dato = primero.dato;
   primero=primero.siguiente; 
    return dato;
  }

  public void Imprimir(){
    while(primero!=null){
      System.out.println(Desencolar());
    }
  }


}
