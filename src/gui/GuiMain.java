/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GuiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana2 = new JFrame("Ventana 2");
        ventana2.setSize(new Dimension(300, 550));
        ventana2.setLayout(new BorderLayout());
        JButton boton = new JButton("Boton North");
        JButton boton2 = new JButton("Boton South");
        JButton boton3 = new JButton("Boton West");
        JButton boton4 = new JButton("Boton Center");
        JButton boton5 = new JButton("Boton East");
        BotonesListener escuchador = new BotonesListener();
        boton.addActionListener(escuchador);
        boton2.addActionListener(escuchador);
        boton3.addActionListener(escuchador);
        boton4.addActionListener(escuchador);
        boton5.addActionListener(escuchador);
        ventana2.add(boton,BorderLayout.NORTH);
        ventana2.add(boton2,BorderLayout.SOUTH);
        ventana2.add(boton3,BorderLayout.WEST);
        ventana2.add(boton4,BorderLayout.CENTER);
        ventana2.add(boton5,BorderLayout.EAST);
        // hacemos visible 
        ventana2.setVisible(true);
        
    }
    
}
