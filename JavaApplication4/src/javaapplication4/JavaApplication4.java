/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Jesus
 */
public class JavaApplication4 <A> {

    A atrib;

    public JavaApplication4(A r){
        atrib=r;
       // atrib2=t;
    }
    public void Mdemostrar(){
        System.out.println("El tipo de dato es :"+atrib.getClass());
       // System.out.println("El tipo de dato es :"+atrib2.getClass());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication4<String> s= new JavaApplication4<String>("Hi");
        s.Mdemostrar();
        JavaApplication4<Integer> d= new JavaApplication4<Integer>(2);
        d.Mdemostrar();

    }

}
