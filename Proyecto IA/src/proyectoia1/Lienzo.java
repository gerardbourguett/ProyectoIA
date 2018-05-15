package proyectoia1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


@SuppressWarnings("serial")
public class Lienzo extends Canvas implements KeyListener {
    public Escenario escenario;
    
    public Lienzo(){
    	this.setFocusable(true);
    	escenario = new Escenario();
         this.setBackground(Color.cyan);
         this.addKeyListener(this);
    }
   @Override
    public void paint(Graphics g){  
    escenario.paintComponent(g);
   }
	@Override
	public void keyPressed(KeyEvent e) {
	escenario.moverJugador(e);
	repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}     
}