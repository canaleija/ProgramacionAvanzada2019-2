/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Roberto Cruz Leija
 */
public class PracticaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche("Pointer");
        Coche coche2 = new Coche("vocho",new Llanta(), new Llanta(),new Llanta(), new Llanta());
        Coche coche3 = new Coche("silverado",new Llanta(225,85,22), new Llanta(225,85,22),new Llanta(225,85,22),new Llanta(225,85,22));
        
        coche3.setCapacidad(10);
        coche3.setMedio("terrestre");
        coche3.setModelo(2019);
        coche3.setVelMax(230);
        coche3.setNombre("Tahoe");
        System.out.println();
    }
    
}
