/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

import javax.swing.JButton;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JButtonNuevo extends JButton{
    private int r;
    private int c;
    public JButtonNuevo(int r, int c) {
        this.r = r;
        this.c = c;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }
    
    
    
}
