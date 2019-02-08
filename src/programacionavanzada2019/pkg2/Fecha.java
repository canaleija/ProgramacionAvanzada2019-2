/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzada2019.pkg2;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Fecha {
    int dia;
    int mes;
    int anyo;
    
    Fecha(){
     dia = 0;
     mes = 0;
     anyo= 0;
    }
    // metodo constructor
    Fecha(int d,int m, int a){
     dia = d;
     mes = m;
     anyo=a;
    }
    Fecha(Fecha f){
    dia = f.dia;
    mes = f.mes;
    anyo = f.anyo;
               
    }
}
