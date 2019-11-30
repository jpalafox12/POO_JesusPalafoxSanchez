/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseGenerica;

/**
 *
 * @author Invitado
 */
class ClaseGenerica<T> {
  T obj;
 
  public ClaseGenerica(T o) {
    obj = o;
  }
 
  public void classType() {
    System.out.println("El tipo de T es " + obj.getClass().getName());
  }
}
 
public class MainClass {
  public static void main(String args[]) {
    // Creamos una instancia de ClaseGenerica para Integer.
    ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
    intObj.classType();
 
    // Creamos una instancia de ClaseGenerica para String.
    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
    strObj.classType();
 
  }
}
