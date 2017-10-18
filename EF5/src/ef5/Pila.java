package ef5;


public class Pila{
  public Nodo primero;
  String j="";
  public Pila(int dato){
      primero = new Nodo(dato);
  }

  public void Apilar(int dato){
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = primero;
    primero = nuevo;
  }

  public int Desapilar(){
    int dato = primero.dato;
    primero = primero.siguiente;
    return dato;
  }

  public void Imprimir(){
    
      while(primero!=null){
        System.out.print(Desapilar()+",");      
     
    }
      
      
  }


}
