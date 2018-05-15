/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia1;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;


public class Celda extends JComponent implements Constantes {
    
public int x;
public int y;
public String Tipo = "V";
public Image Jugador;
public Image Vacio;
public Image Enemigo;
public Image Pared;
public Image Recompensa;
public Image ImgActual;

    public Celda(int x , int y /*String Tipo =""*/){
        this.x = x;
        this.y = y;
        Jugador = new ImageIcon(getClass().getResource(IMAGEN_JUGADOR)).getImage();
        Vacio = new ImageIcon(getClass().getResource(IMAGEN_VACIO)).getImage();
        Enemigo = new ImageIcon(getClass().getResource(IMAGEN_ENEMIGO)).getImage();
        Pared = new ImageIcon(getClass().getResource(IMAGEN_PARED)).getImage();
        Recompensa = new ImageIcon(getClass().getResource(IMAGEN_RECOMPENSA)).getImage();
        
        this.ImgActual = Vacio;
    }
    
    public void cambiarTipo(String Tipo) {
    	this.Tipo = Tipo;
        switch(Tipo){
            case TIPO_JUGADOR : this.ImgActual = this.Jugador; break;
            case TIPO_VACIO : this.ImgActual = this.Vacio; break;
            case TIPO_ENEMIGO : this.ImgActual = this.Enemigo; break;
            case TIPO_PARED : this.ImgActual = this.Pared; break;
            case TIPO_RECOMPENSA : this.ImgActual = this.Recompensa; break;
        }
    }
    
    public String obtenerTipo() {
    return	this.Tipo; 
    }
    
    @Override
    public void paintComponent(Graphics g){

    g.drawImage(Vacio, this.x, this.y, TAMAÑO_CELDA, TAMAÑO_CELDA, this);
    g.drawImage(ImgActual, this.x, this.y, TAMAÑO_CELDA, TAMAÑO_CELDA, this);
    }
    
}