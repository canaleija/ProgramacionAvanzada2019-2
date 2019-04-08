/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ListenerGato implements ActionListener{

    private Gato gato;
    
    public ListenerGato(Gato gato) {
        this.gato = gato;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonNuevo boton = (JButtonNuevo) e.getSource();
        boolean ganador = this.gato.agregarJugada(boton.getR(), boton.getC());
        // verificar primero el turno
        int turno = this.gato.getMovimientos()[this.gato.getJugada()];
        if(turno == 1){
        boton.setBackground(Color.RED);
        
        }else{
        boton.setBackground(Color.BLUE);
        }
        boton.setEnabled(false);
        if (ganador){
            JOptionPane.showMessageDialog(null,"Gano "+turno);
        }
        
       // gato.agregarJugada(boton.getR(),boton.getC());
       // System.out.println(boton.getC()+","+boton.getR());
    }
    
}
