/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CRUZLEIJA
 */
public class Cliente {
    
    public void conectar(){
        try {
            String msj = JOptionPane.showInputDialog("Ingrese el mensaje");
            Socket socket = new Socket("10.1.140.52",9107);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(msj);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.conectar();
    }
         
    
}
