/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import programacionavanzada2019.pkg2.Fecha;

/**
 *
 * @author CRUZLEIJA
 */
public class Servidor {
    
    private int puerto;
    private ServerSocket servidorSockets;
    private DataInputStream in;
    private Socket socket;

    public Servidor(int puerto) {
        try {
            this.puerto = puerto;
            servidorSockets = new ServerSocket(puerto);
                      
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void comenzar(){
     // generar un ciclo con flag 
     System.out.println("Esperando cliente...");
     while(true){
         try {
             this.socket = servidorSockets.accept();
             this.in = new DataInputStream(socket.getInputStream());
             System.out.println("IP: "+this.socket.getInetAddress());
             System.out.println("PUERTO: "+this.socket.getPort());
             System.out.println("Mensaje: "+this.in.readUTF());
             
         } catch (IOException ex) {
             Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }
    }

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Servidor aux = new Servidor(9107);
        aux.comenzar();
    }
   
    
    
}
