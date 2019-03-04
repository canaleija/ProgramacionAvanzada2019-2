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
public class Coche extends MedioTransporte{
    
    public Llanta llanta1,llanta2,llanta3,llanta4;
    // constructor donde recibe el nombre
    public Coche (String nombre){
        System.out.println("Construyendo un coche "+nombre+".");
        super.setNombre(nombre);
       
    }
    public Coche(String nombre, Llanta l1, Llanta l2,Llanta l3,Llanta l4){
        super.setNombre(nombre);
        this.llanta1 = l1;
        this.llanta2 = l2;
        this.llanta3 = l3;
        this.llanta4 = l4;
        System.out.println("Construyendo un coche "+nombre+" con llantas asignadas");
    }
//    public String getNombre (){
//        return super.getNombre();
//    }
//    public void setNombre(String nombre){
//        super.setNombre(nombre);
//    }
}
