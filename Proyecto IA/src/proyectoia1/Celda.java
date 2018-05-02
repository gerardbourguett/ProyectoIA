/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia1;

import java.awt.Graphics;
import javax.swing.JComponent;


public class Celda extends JComponent implements Constantes {
    
public int x;
public int y;
public String Tipo = "V";
    public Celda(int x , int y /*String Tipo =""*/){
        this.x = x;
        this.y = y;
    }
    public void cambiarTipo(String Tipo) {
    	this.Tipo = Tipo;
    }
    public String obtenerTipo() {
    return	this.Tipo; 
    }
@Override
    public void paintComponent(Graphics g){
		switch(this.Tipo) {
		case TIPO_VACIO: g.setColor(COLOR_VACIO); break;
		case TIPO_JUGADOR: g.setColor(COLOR_JUGADOR); break;
		case TIPO_ESCENARIO: g.setColor(COLOR_ESCENARIO); break;
		}
	
	g.fillRect(x, y, TAMAÑO_CELDA, TAMAÑO_CELDA);
    
    }
    
}
