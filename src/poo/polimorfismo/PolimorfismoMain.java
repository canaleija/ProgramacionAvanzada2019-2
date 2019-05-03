/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.polimorfismo;

import poo.polimorfismo.animales.Animal;
import poo.polimorfismo.animales.Gato;
import poo.polimorfismo.animales.Perro;

/**
 *
 * @author Roberto Cruz Leija
 */
public class PolimorfismoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Animal benito = new Gato();
         funcion((Gato) benito);
         
         Animal[] casaMartin = new Animal[2];
         casaMartin[0]= new Gato();
         casaMartin[1]= new Perro();
         
         Gato benito2 =  (Gato)casaMartin[0];
         benito2.maullar();
    }
    
    public static void funcion(Gato aux){
        
    }
    
}
