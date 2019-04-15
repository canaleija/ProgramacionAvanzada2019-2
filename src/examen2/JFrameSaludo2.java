/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameSaludo2 extends JFrame{
    private JButton btn1;
    private JButton btn2;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lbl1;
    private JLabel lbl2;

    public JFrameSaludo2() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
       this.lbl1 = new JLabel("Nombre");
       this.lbl2 = new JLabel("Apellido");
       this.txt1 = new JTextField();
       this.txt2 = new JTextField();
       this.btn1 = new JButton("Español");
       this.btn2 = new JButton("Inglés");
       
        ActionListener escuchador = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              JButton btn =(JButton) e.getSource();
              if(btn.equals(btn1)){
              
                  JOptionPane.showMessageDialog(null,"Hola "+txt1.getText()+" "+txt2.getText());
              } else{
                  JOptionPane.showMessageDialog(null,"Hello "+txt1.getText()+" "+txt2.getText());
              }
           }
       };
       this.btn1.addActionListener(escuchador);
       this.btn2.addActionListener(escuchador);
       // seteo el layout
       setLayout(new GridLayout(2,3));
       add(this.lbl1);
       add(this.txt1);
       add(this.btn1);
       add(this.lbl2);
       add(this.txt2);
       add(this.btn2);
       setSize(500,100);
       setVisible(true);
    }
    
     public static void main(String[] args) {

        JFrameSaludo2 aux= new JFrameSaludo2();
     
    }
}
