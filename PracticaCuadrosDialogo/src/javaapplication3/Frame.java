/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author CRUZLEIJA
 */
public class Frame extends JFrame {

    public Frame() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,1));
        // creamos los botones
        Dimension dim;
        dim = new Dimension(20,20);
        Botones boton1 = new Botones("No. 1", dim, Color.red);
        Botones boton2 = new Botones("No. 2", dim, Color.red);
        Botones boton3 = new Botones("No. 3", dim, Color.red);
        Botones boton4 = new Botones("No. 4", dim, Color.red);
        Botones boton5 = new Botones("No. 5", dim, Color.GREEN);
        
        
         panelCentral.add(boton1);
         panelCentral.add(boton2);
         panelCentral.add(boton3);
         panelCentral.add(boton4);
         panelCentral.add(boton5);
         
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.NORTH);
         
         
        
        ListenerBotones a= new ListenerBotones();
        boton1.addActionListener(a);
        boton2.addActionListener(a);
        boton3.addActionListener(a);
        boton4.addActionListener(a);
        boton5.addActionListener(a);
       
        
       
        
        
    }}