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
public class MedioTransporte {
   private String nombre;
   private String medio;
   private int capacidad;
   private double velMax;
   private int modelo;

    public MedioTransporte() {
        this.nombre = "";
        this.medio = "";
        this.velMax = 0;
        this.capacidad = 0;
        this.modelo = 0;
    }

    public MedioTransporte(String nombre, String medio, int capacidad, double velMax, int modelo) {
        this.nombre = nombre;
        this.medio = medio;
        this.capacidad = capacidad;
        this.velMax = velMax;
        this.modelo = modelo;
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
     * @return the medio
     */
    public String getMedio() {
        return medio;
    }

    /**
     * @param medio the medio to set
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the velMax
     */
    public double getVelMax() {
        return velMax;
    }

    /**
     * @param velMax the velMax to set
     */
    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

   
   
   
}
