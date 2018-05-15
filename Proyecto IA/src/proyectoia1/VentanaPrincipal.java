package proyectoia1;


import java.awt.Container;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame implements Constantes{
	
    
    public VentanaPrincipal(){
    super(TITULO_APP);
    this.setSize(ANCHO_VENTANA, ALTO_VENTANA);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Lienzo l = new Lienzo();
    Container cp = this.getContentPane();
    cp.add(l);
    }
}