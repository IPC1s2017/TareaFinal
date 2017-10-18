package ef5;


public class Nodo{
String j="";
  public Nodo siguiente;
  public Nodo anterior;
  public int dato;

  public Nodo(int dato){
    this.dato = dato;
  }

  public void Imprimir(){
      System.out.print(dato+",");
     
      
  }
}
