/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GatoGUI extends JFrame {

    private JPanel panelBotones;
    private JPanel panelEtiquetas;
    
    public GatoGUI(){
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // definir el layout del jframe principal
        setLayout(new BorderLayout());
        // inicializar los Jpanels
        this.panelBotones = new JPanel(new GridLayout(3,3));
        this.panelEtiquetas = new JPanel(new GridLayout(1,2));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        // agregamos los botones
        this.panelBotones.add(b1);
        this.panelBotones.add(b2);
        this.panelBotones.add(b3);
        this.panelBotones.add(b4);
        this.panelBotones.add(b5);
        this.panelBotones.add(b6);
        this.panelBotones.add(b7);
        this.panelBotones.add(b8);
        this.panelBotones.add(b9);
        // agregar el panel al frame
        add(this.panelBotones,BorderLayout.CENTER);
        JLabel e1 = new JLabel("Turno");
        JLabel e2 = new JLabel("Ganó");
        // agregamos las etiquetas 
        this.panelEtiquetas.add(e1);
        this.panelEtiquetas.add(e2);
        // agregamos el panel al frame
        add(this.panelEtiquetas,BorderLayout.SOUTH);
        
        
        // modificamos el size del frame
        setSize(400,400);
        setVisible(true);
        
    }
    
    
}
