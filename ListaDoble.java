
package main;

public class ListaDoble {
public Nodo primero;

public ListaDoble(int dato){
primero = new Nodo(dato);
Nodo nuevo = new Nodo(dato);
nuevo.siguiente = primero;
//primero = nuevo;
    
}
public void InsertarAlFrente(int dato){
  Nodo nuevo = new Nodo(dato);
  nuevo.siguiente = primero;
  primero = nuevo;   
  
}
  public void Imprimir(){
    Nodo auxiliar = primero;
    while(auxiliar!=null){
    auxiliar.Imprimir();
    auxiliar = auxiliar.siguiente;
       
        }
}

} 
   
