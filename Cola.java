/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final_5;

public class Cola {
public Nodo primero;
  public Nodo ultimo;


  public Cola(int dato){
      primero = new Nodo(dato);
      ultimo = primero;
  }

  public void Encolar(int  dato){
    Nodo nuevo = new Nodo(dato);
    ultimo.siguiente = nuevo;
    ultimo = nuevo;
    
  }

  public int Desencolar(){
    int dato = primero.dato;
    primero = primero.siguiente;
    return dato;
  }

  public void Imprimir(){
    while(primero!=null){
      System.out.print(" " +  Desencolar() );
    }
  }    
}
