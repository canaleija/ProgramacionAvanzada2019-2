/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Roberto Cruz Leija
 */
public class PooMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno juan = new Alumno(17,"Juan Alberto","20192345M","Mecatronica",new Escuela("UPIIZ","Cerro gato","92-2-34-56"),5);
        
        System.out.println("Hola mundo");
    }
    
}
