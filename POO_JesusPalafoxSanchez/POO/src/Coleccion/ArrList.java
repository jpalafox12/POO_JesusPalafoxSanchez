/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;

import Clases.Consola;
import Clases.Musica;
import Clases.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Invitado
 */
public class ArrList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Object> ListaObjetos = new ArrayList<Object>();
        
        ListaObjetos.add(new Consola());
        ListaObjetos.add(new Consola());
        ListaObjetos.add(new Pelicula());
        ListaObjetos.add(new Musica());
        
        for (Object aux: ListaObjetos){
        if(aux instanceof Consola){
            Consola aux2 = (Consola)aux;
            System.out.println(aux2.toString());
        }else{
            if(aux instanceof Pelicula){
                Pelicula aux3 = (Pelicula)aux;
                System.out.println(aux3.toString());
            }else{
                Musica aux4 = (Musica)aux;
                System.out.println(aux4.toString());
            }
        }
    }
        
    }
    
}
