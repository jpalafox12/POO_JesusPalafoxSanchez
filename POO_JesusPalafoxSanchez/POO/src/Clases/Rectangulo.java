/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author _
 */
public class Rectangulo {
    private double base;
    private double altura;
    private String color;
    
    public Rectangulo(){
        base= 2.8;
        altura= 3.5;
        color= "amarillo";
    }
    
    public Rectangulo(double b, double a, String c){
        this.base= b;
        this.altura= a;
        this.color= c;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double base){
        this.base= base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura (double altura){
        this.altura= altura;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
}
