/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import gatogui.GatoGUI;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameSaludo extends JFrame{
    private JButton btn1;
    private JButton btn2;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lbl1;
    private JLabel lbl2;

    public JFrameSaludo() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
       this.lbl1 = new JLabel("Nombre");
       this.lbl2 = new JLabel("Apellido");
       this.txt1 = new JTextField();
       this.txt2 = new JTextField();
       this.btn1 = new JButton("Español");
       this.btn2 = new JButton("Inglés");
       
       Escuchador escuchador =  new Escuchador(this);
       this.btn1.addActionListener(escuchador);
       this.btn2.addActionListener(escuchador);
       // seteo el layout
       setLayout(new GridLayout(2,3));
       add(this.getLbl1());
       add(this.getTxt1());
       add(this.getBtn1());
       add(this.getLbl2());
       add(this.getTxt2());
       add(this.getBtn2());
       setSize(500,100);
       setVisible(true);
    }
    
     public static void main(String[] args) {

        JFrameSaludo aux= new JFrameSaludo();
     
    }

    /**
     * @return the btn1
     */
    public JButton getBtn1() {
        return btn1;
    }

    /**
     * @return the btn2
     */
    public JButton getBtn2() {
        return btn2;
    }

    /**
     * @return the txt1
     */
    public JTextField getTxt1() {
        return txt1;
    }

    /**
     * @return the txt2
     */
    public JTextField getTxt2() {
        return txt2;
    }

    /**
     * @return the lbl1
     */
    public JLabel getLbl1() {
        return lbl1;
    }

    /**
     * @return the lbl2
     */
    public JLabel getLbl2() {
        return lbl2;
    }
}
