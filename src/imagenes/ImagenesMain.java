/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ImagenesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image imagen = ImageManager.openImage();
        JFramePersonal frame = new JFramePersonal(imagen);
        // manipular la imagen 
       
        double histogramaR [] = new double[256];
        double histogramaG [] = new double[256];
        double histogramaB [] = new double[256];
        
        BufferedImage bi = ImageManager.toBufferedImage(imagen);
        
        // recorremos la imagen
         for(int x=0;x<bi.getWidth();x++)
             for(int y=0; y <bi.getHeight();y++){
             Color color = new Color(bi.getRGB(x, y));
              histogramaR[color.getRed()]++;
              histogramaG[color.getGreen()]++;
              histogramaB[color.getBlue()]++;
             }
         
         Grafica g1 = new Grafica("Tonos","Frecuencias","Histograma de frecuencias");
         g1.agregarSerie("rojos", histogramaR);
         g1.agregarSerie("verdes", histogramaG);
         g1.agregarSerie("azules", histogramaB);
         g1.crearYmostrarGrafica();
        System.out.println();
    }
    
}
