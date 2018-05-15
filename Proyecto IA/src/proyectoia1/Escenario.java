package proyectoia1;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;


public class Escenario extends JComponent implements Constantes {
    public Celda[][] c;  
    public int filaJugador = 0;
    public int columnaJugador = 0;
    public Escenario(){
    c = new Celda[NUMERO_CELDAS_ALTO][NUMERO_CELDAS_ANCHO];
	for(int i=0; i<NUMERO_CELDAS_ALTO;i++) {
		for(int j=0; j<NUMERO_CELDAS_ANCHO; j++) {
		c[i][j] = new Celda(j*TAMAÑO_CELDA,i*TAMAÑO_CELDA);
			//c[i][j] = new Celda(i*ALTO_VENTANA,j*ANCHO_VENTANA);
			//if(filaJugador>Nu)
		}
	}
	c[this.filaJugador][this.columnaJugador].cambiarTipo(TIPO_JUGADOR);
        
	c[4][4].cambiarTipo(TIPO_ENEMIGO);
        c[6][2].cambiarTipo(TIPO_RECOMPENSA);
        c[3][7].cambiarTipo(TIPO_PARED);
			
         
     }
    
    @Override
    public void paintComponent(Graphics g){
       	//g.drawRect(x, y, ANCHO_VENTANA,ALTO_VENTANA);
    	for(int i=0; i<NUMERO_CELDAS_ALTO;i++) {
			for(int j=0; j<NUMERO_CELDAS_ANCHO; j++) {
			c[i][j].paintComponent(g);
			//repaint();
		}
	 }
    }
    public void moverJugador(KeyEvent e) {
    	switch(e.getKeyCode()) {
    	case KeyEvent.VK_RIGHT: this.moverJugadorDerecha(); break;
    	case KeyEvent.VK_LEFT: this.moverJugadorIsquierda(); break;
    	case KeyEvent.VK_DOWN: this.moverJugadorAbajo(); break;
    	case KeyEvent.VK_UP: this.moverJugadorArriba(); break;
    	}
    }
    public void moverJugadorDerecha() {
    	
    	String tipo = c[filaJugador][columnaJugador+1].obtenerTipo();
    	c[filaJugador][columnaJugador].cambiarTipo(tipo);
    	c[filaJugador][columnaJugador+1].cambiarTipo(TIPO_JUGADOR);
    	columnaJugador++;
    	
    	
    }
    public void moverJugadorIsquierda() {
    	String tipo = c[filaJugador][columnaJugador-1].obtenerTipo();
    	c[filaJugador][columnaJugador].cambiarTipo(tipo);
    	c[filaJugador][columnaJugador-1].cambiarTipo(TIPO_JUGADOR);
    	//c[this.columnaJugador][this.fillaJugador].cambiarTipo(Tipo);
    	//c[this.columnaJugador][this.fillaJugador-1].cambiarTipo(TIPO_JUGADOR);
    	columnaJugador--;
    	
    }
    public void moverJugadorAbajo() {
    	
    	String tipo = c[filaJugador+1][columnaJugador].obtenerTipo();
    	c[filaJugador][columnaJugador].cambiarTipo(tipo);
    	c[filaJugador+1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
    	filaJugador++;
    }
    public void moverJugadorArriba() {
    	
    	String tipo = c[filaJugador-1][columnaJugador].obtenerTipo();
    	c[filaJugador][columnaJugador].cambiarTipo(tipo);
    	c[filaJugador-1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
    	filaJugador--;
    }
}
