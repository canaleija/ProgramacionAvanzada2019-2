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
public class Alumno extends Persona {
    
   
    private String boleta;
    private Carrera carrera;
    private Escuela escuela;
    private int semestre;

    public Alumno(){
        super(); // ejecutando el constructor por defecto de la clase padre
    }
    
    public Alumno(int edad,String nombre,double peso,double altura,String genero,String boleta, Carrera carrera, Escuela escuela, int semestre) {
        super(edad,nombre,peso,altura,genero);
        this.boleta = boleta;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
    /**
     * @return the boleta
     */
    public String getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the escuela
     */
    public Escuela getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
