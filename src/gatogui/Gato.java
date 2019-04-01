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
    boolean ganador = verificarJugadas(this.movimientos[this.jugada]);
    if (ganador){
    System.out.println("Gano "+this.movimientos[this.jugada]);
    } else {
     System.out.println("No Gano "+this.movimientos[this.jugada]);
    
    }
    }

    public boolean verificarJugadas(int turno) {
       int sim = 0; 
       // renglones 
       for(int r=0;r<3;r++){
              sim = 0;
              for(int c=0;c<3;c++){
              if (this.matriz[r][c]==0){
              break;
              }else{
               // es 1 o 2
               if (this.matriz[r][c]!=turno){
               break;
               } else{
               // es igua al turno
               sim++;
               }
              }
            }
              if (sim==3) return true;
       }
       
        // columnas 
       for(int r=0;r<3;r++){
              sim = 0;
              for(int c=0;c<3;c++){
              if (this.matriz[c][r]==0){
              break;
              }else{
               // es 1 o 2
               if (this.matriz[c][r]!=turno){
               break;
               } else{
               // es igua al turno
               sim++;
               }
              }
            }
              if (sim==3) return true;
       }
       
       // verificacion por diagonales
       
       sim = 0;
       
       for (int x=0; x<3;x++){
           
           if (this.matriz[x][x]==0){
              break;
              }else{
               // es 1 o 2
               if (this.matriz[x][x]!=turno){
               break;
               } else{
               // es igua al turno
               sim++;
               }
            }
       
       }
        if (sim==3) return true;
       // la otra digonal 
       sim = 0;
       int j = 0;
       for (int x=2; x>=0;x--){
           
           if (this.matriz[x][j]==0){
              break;
              }else{
               // es 1 o 2
               if (this.matriz[x][j]!=turno){
               break;
               } else{
               // es igua al turno
               sim++;
               }
            }
           j++;
       }
        if (sim==3) return true;
        
        
       
        return false;
    }
    
    
    
}
