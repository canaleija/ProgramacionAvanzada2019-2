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
        // manipular la imagen 
        imagen = ImageManager.convertirGrises(imagen);
        JFramePersonal frame = new JFramePersonal(imagen);
        System.out.println();
    }
    
}
