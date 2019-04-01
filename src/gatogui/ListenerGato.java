/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ListenerGato implements ActionListener{

    Gato gato;
    public ListenerGato() {
        this.gato = new Gato();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonNuevo boton = (JButtonNuevo) e.getSource();
        gato.agregarJugada(boton.getR(),boton.getC());
       // System.out.println(boton.getC()+","+boton.getR());
    }
    
}
