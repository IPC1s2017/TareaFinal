package tad;

/**
 *
 * @author lenovo
 */

public class Nodo {
     public Nodo siguiente;
  public Nodo anterior;
  public int dato;
  
  public Nodo(int dato){
    this.dato = dato;
    siguiente=null;
  }

  public void Imprimir(){
    System.out.println(dato);
  }
    
}
