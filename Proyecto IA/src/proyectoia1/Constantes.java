
package proyectoia1;

import java.awt.Color;


public interface Constantes {
    
    public final String TITULO_APP = ("The Legend of Celda");
    
    
    
    public final int TAMAÑO_CELDA= 30;
    
    
    public final int NUMERO_CELDAS_ANCHO = 10;
    public final int NUMERO_CELDAS_ALTO = 8;
    
    public final int ANCHO_VENTANA= (NUMERO_CELDAS_ANCHO * TAMAÑO_CELDA)+20;
    public final int ALTO_VENTANA = (NUMERO_CELDAS_ALTO * TAMAÑO_CELDA)+45;
    
    public final String TIPO_VACIO = "V";
    public final String TIPO_JUGADOR = "j";
    public final String TIPO_ESCENARIO = "e";
    
    public final Color COLOR_VACIO = Color.WHITE;
    public final Color COLOR_JUGADOR = Color.BLUE;
    public final Color COLOR_ESCENARIO = Color.RED;
    
    public final char JUGADOR = 'J';
    public final char CAMINO = 'V';
    public final char OBSTACULO = 'O';
    
}
