/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaImagenes.gui;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alumno
 */
public class JFrameImagen extends JFrame{

    public JFrameImagen(Image image) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JLabel etiqueta = new JLabel();
        etiqueta.setIcon(new ImageIcon(image));
        setSize( image.getWidth(this), image.getHeight(this));
        add(etiqueta);
        setVisible(true);
    }
    
    
}
