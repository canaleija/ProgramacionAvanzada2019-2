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
public class Llanta {
    private int altura;
    private int anchura;
    private int rin;
    
    // defecto
    public Llanta(){
        altura = 0;
        anchura = 0;
        rin = 0;
    }
    // recibe los valores
    public Llanta (int altura, int anchura, int rin){
        this.altura = altura;
        this.anchura = anchura;
        this.rin = rin;
    }
    public int getAltura(){
        return altura;
    }
    public int getAnchura(){
        return anchura;
    }
    public int getRin(){
        return rin;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
     public void setAnchura(int anchura){
        this.anchura = anchura;
    }
    public void setRin(int rin){
        this.rin = rin;
    }
    
}
