

/**
 *
 * @author Lenovo
 */

import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

public class Obstaculo {
    
    //variable tamaño del personaje
    int ancho_obstaculo = 40;
    int alto_obstaculo = 70;
    //variable coordenadas iniciales donde se ubica el objeto
    int x_inicial = 1300;
    int y_inicial =280;
    //cordenadas para manipular al objeto
    int x_auxiliar= -2;
    //objeto de clase juego
    
    private Juego juego;
    public Obstaculo (Juego juego)  {
        this.juego= juego;
       }

    
    
    void mover(){
        if (x_inicial<=-100)
        {
            juego.puntos++;
            x_inicial=1300;
        }else
        {
            if (colision())
            {
                juego.finJuego();
            }else   {
                x_inicial = x_inicial + x_auxiliar;
            }
        }
            
    }
    private boolean colision()  {
        return juego.personaje1.getBounds().intersects(getBounds());
    }

   public void paint(Graphics2D g){ 
       g.fillRect(x_inicial, y_inicial, ancho_obstaculo, alto_obstaculo);
   }
   
    public Rectangle getBounds()   {
        return new Rectangle(x_inicial, y_inicial, ancho_obstaculo, alto_obstaculo);
    }
}

    
