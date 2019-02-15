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
    private int dia;
    private int mes;
    private int anyo;
    
    public Fecha(){
     dia = 0;
     mes = 0;
     anyo= 0;
    }
    // metodo constructor
    public Fecha(int d,int m, int a){
     dia = d;
     mes = m;
     anyo=a;
    }
    public Fecha(Fecha f){
        dia = f.dia;
        mes = f.mes;
        anyo = f.anyo;
               
    }
    
    // definir e implmentar los metodos set
    public void setDia(int d){
        dia = d;
    }
    public void setMes(int m)
    { 
        mes=m;
    }
    // definir e implementar los metodos get
    public int getDia(){
        return dia;
    } 
     public int getMes()
     {
         return mes;
     }
    
}
