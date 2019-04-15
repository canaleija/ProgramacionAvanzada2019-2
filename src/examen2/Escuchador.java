/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Escuchador implements ActionListener{

    private JFrameSaludo frame;

    public Escuchador(JFrameSaludo frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      JButton btn =(JButton) e.getSource();
              if(btn.equals(frame.getBtn1())){
              
                  JOptionPane.showMessageDialog(null,"Hola "+this.frame.getTxt1().getText()+" "+this.frame.getTxt2().getText());
              } else{
                  JOptionPane.showMessageDialog(null,"Hello "+this.frame.getTxt1().getText()+" "+this.frame.getTxt2().getText());
              }
    }
    
}
