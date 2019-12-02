/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Alumno
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerBotones implements ActionListener{

    static void add(Botones boton1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListenerBotones() {
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
     Botones aux = (Botones) e.getSource();
       
     
       if (aux.getText().equals("No. 1")){
         /*para los mensajes de dialogo  JOptionPane*/
          JOptionPane.showMessageDialog(aux, "TEM UM NOVO MESSAGEM", "O QUE TEM PRA FAZER", JOptionPane.DEFAULT_OPTION);
    /*showMessageDialog para el boton "No. 1" el cual nos muestra el mensaje en el cuadro de dialogo del No. 1 por defecto*/
       }
       if (aux.getText().equals("No. 2")){
          
//           JOptionPane.showConfirmDialog(aux,JOptionPane.YES_NO_OPTION );
           JOptionPane.showConfirmDialog(aux, JOptionPane.YES_NO_OPTION, "ESCOLHA", 0);
//el showConfirmDialog es para crear un cuadro de dialogo en donde de las opciones de elegir si/cancelar
//por lo que se utiliza el JOptionPanel con el YES_NO_OPTION para elegir lo que se quiere hacer con las "OPCIONES"
    }
        if (aux.getText().equals("No. 3")){
        JOptionPane.showOptionDialog(null, "ESCOLHA UMA ACAO", "BOM DIA", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
            new Object[] {"Sim", "Nao","sei la"}, "Sim");
//el showOptionDialog es para crear un cuadro de dialogo en donde de las opciones de elegir si/cancelar
//por lo que se utiliza el JOptionPanel con el QUESTION_MESSAGE para poner el icono de "?"      
//se crea un NUEVO objeto para definir lo de los tres botones como opciones
        
    }
         if (aux.getText().equals("No. 4")){
        JOptionPane.showInputDialog (null, "DEIXE SEU TEXTO: ", "CUADRO DO TEXTO",
             JOptionPane.INFORMATION_MESSAGE);
        //el showConfirmDialog es para crear un cuadro de dialogo en donde de las opciones de elegir si/cancelar
//por lo que se utiliza el JOptionPanel con el YES_NO_OPTION para elegir lo que se quiere hacer con las "OPCIONES"
    } 
         if (aux.getText().equals("No. 5")){
        JOptionPane.showMessageDialog(aux, "NAO PODE FAZER NADA SUE COMPUTADOR TEM UM VIRUS", "CUADRO MALO", JOptionPane.ERROR_MESSAGE);
    }
         
    
}}

