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
        
        Persona juanita = new Alumno(22,"Juanita",50,1.65,"Femenino","2019-2345", new Carrera(), new Escuela("UPIIZ","ENRIQUE SEGOVIANO","492313" ), 6);
        juanita.saludar();
        
        System.out.println();
    }
    
}
