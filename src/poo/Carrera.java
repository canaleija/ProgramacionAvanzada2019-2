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
public class Carrera {
    private String nombre;
    private int numAlumnos;
    private int numMaterias;
    
    public Carrera(){
        nombre = "";
        numAlumnos = 0;
        numMaterias = 0;
    }
    
    public Carrera(String nombre,int numAlumnos,int numMaterias)
{ 
    this.nombre=nombre;
    this.numAlumnos=numAlumnos;
    this.numMaterias=numMaterias;
    
    
}
    public Carrera(Carrera c){
        this.nombre=c.getNombre();
        this.numAlumnos=c.getNumAlumnos();
        this.numMaterias=c.getNumMaterias();
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numAlumnos
     */
    public int getNumAlumnos() {
        return numAlumnos;
    }

    /**
     * @param numAlumnos the numAlumnos to set
     */
    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    /**
     * @return the numMaterias
     */
    public int getNumMaterias() {
        return numMaterias;
    }

    /**
     * @param numMaterias the numMaterias to set
     */
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }
}
