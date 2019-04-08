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
        JButtonNuevo b1 = new JButtonNuevo(0,0);
        JButtonNuevo b2 = new JButtonNuevo(0,1);
        JButtonNuevo b3 = new JButtonNuevo(0,2);
        JButtonNuevo b4 = new JButtonNuevo(1,0);
        JButtonNuevo b5 = new JButtonNuevo(1,1);
        JButtonNuevo b6 = new JButtonNuevo(1,2);
        JButtonNuevo b7 = new JButtonNuevo(2,0);
        JButtonNuevo b8 = new JButtonNuevo(2,1);
        JButtonNuevo b9 = new JButtonNuevo(2,2);
        // escuchador para los botones
        Gato gato = new Gato();
        ListenerGato escuchadorBotones = new ListenerGato(gato);
        b1.addActionListener(escuchadorBotones);
        b2.addActionListener(escuchadorBotones);
        b3.addActionListener(escuchadorBotones);
        b4.addActionListener(escuchadorBotones);
        b5.addActionListener(escuchadorBotones);
        b6.addActionListener(escuchadorBotones);
        b7.addActionListener(escuchadorBotones);
        b8.addActionListener(escuchadorBotones);
        b9.addActionListener(escuchadorBotones);
        
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
