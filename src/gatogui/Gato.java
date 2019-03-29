/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Gato {
    
    private int matriz[][];
    private int movimientos[];
    private int jugada;

    public Gato() {
        this.matriz = new int[3][3];
        // 1 para el azul y 2 para el rojo 
        this.movimientos = new int[]{1,2,1,2,1,2,1,2,1};
        this.jugada = -1;
    }
    
    public void agregarJugada(int r, int c){
    // aumentamos la jugada 
        this.jugada++;
    // agregamos la jugada a la matriz
    this.matriz[r][c]=this.movimientos[this.jugada];
    // verificar si alguien gana
    boolean ganador = verificarJugadas();
    }

    private boolean verificarJugadas() {
        // TODO logica para ver si ganaron
        return false;
    }
    
    
    
}
