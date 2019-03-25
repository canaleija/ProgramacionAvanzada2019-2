/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Calculadora extends JFrame {
    private JTextField display;
    private JPanel teclado;
    
    public Calculadora(){
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        //creamos el teclado
        teclado = new JPanel();
        // re definiendo el tipo de distribucion del panel donde estaran los botones
        teclado.setLayout(new GridLayout(5,4));
        inicializaBotonesTeclado();
        // agregamos el teclado a la calculadora
        add(teclado,BorderLayout.CENTER);
        // agregamos el display a la calculadora
        display = new JTextField();
        add(display,BorderLayout.NORTH);
        // cambiar el tamaño de la calculadora
        setSize(400,700);
        // ahora hacemos visible a la calculadora
        setVisible(true);
    }
    private void inicializaBotonesTeclado (){
    // creamos los botones manualmente y los agregamos
    JButton btnCE = new JButton("CE");
    teclado.add(btnCE);
    // todo: agregar los botones restantes
   
       
    }
}
