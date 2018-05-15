package proyectoia1;

import java.awt.Color;


public interface Constantes {
    
    public final String TITULO_APP = ("The Legend of Celda");
    
    
    
    public final int TAMAÑO_CELDA= 30;
    
    
    public final int NUMERO_CELDAS_ANCHO = 20;
    public final int NUMERO_CELDAS_ALTO = 20;
    
    public final int ANCHO_VENTANA= (NUMERO_CELDAS_ANCHO * TAMAÑO_CELDA)+20;
    public final int ALTO_VENTANA = (NUMERO_CELDAS_ALTO * TAMAÑO_CELDA)+45;
    
    public final Color COLOR_VACIO = Color.WHITE;
    public final Color COLOR_JUGADOR = Color.BLUE;
    public final Color COLOR_ESCENARIO = Color.RED;
    
    public final String TIPO_JUGADOR = "J";
    public final String TIPO_VACIO = "V";
    public final String TIPO_ENEMIGO = "E";
    public final String TIPO_PARED = "P";
    public final String TIPO_RECOMPENSA = "R";
    
    public final String IMAGEN_JUGADOR = "../res/jugador.png";
    public final String IMAGEN_VACIO = "../res/vacio.png";
    public final String IMAGEN_ENEMIGO = "../res/enemigo.png";
    public final String IMAGEN_PARED = "../res/pared.png";
    public final String IMAGEN_RECOMPENSA = "../res/recompensa.png";
    
    
}