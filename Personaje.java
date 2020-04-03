

/**
 *
 * @author Lenovo
 */


//librerias utilizadas//
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Personaje {
    
   //Variable que delimitan el area del objeto
    int ancho_personaje = 110;
    int alto_personaje = 80;
  //coordenadas iniciales donde se ubica el personaje  
    int x_inicial = 50;
    int y_inicial =270;
   //coordenadas para manipular al personaje
    int x_auxiliar= 0;
    int y_auxiliar= 0;
    //objeto de clase juego
    private Juego juego;
    //variables que nos ayudan a saber si el personaje esta brincando o no
    boolean saltando=false;
    boolean sube=false;
    boolean bajar=false;
    
    public Personaje(Juego juego)    {
        this.juego=juego;
    }

    
    public void mover ()    {
        
        
        if(x_inicial + x_auxiliar >0 && x_inicial + x_auxiliar< juego.getWidth()- ancho_personaje)
            x_inicial=x_inicial + x_auxiliar;
        if(saltando)
        {
            if(y_inicial==270)// coor denadas cuando El personaje esta en el suelo
            {sube=true;
            y_auxiliar=-2;
            bajar=false; }
            if(y_inicial== 100)//Corrdenadas cuando El personaje al limite de salto
            {bajar=true;
            y_auxiliar=2;
            sube=false;
            }
            //si el personaje salta adquiere el valor de la y inicial que es 270 + auxiliar que es 0= 270
            if (sube)
            {
                y_inicial=y_inicial+y_auxiliar;
            }
            //si el personaje baja adquiere el valor de 
            if(bajar)
            {
                y_inicial=y_inicial+y_auxiliar;
                if(y_inicial==270)
                {
                    saltando=false;
                }
             
            }
        }
    }
    //Permite pintar en la pantalla.El objeto Graphics controla el contexto de graficos
    public void paint(Graphics2D g) {
        g.fillRect(x_inicial, y_inicial, ancho_personaje, alto_personaje);
        
    }  
    //evento del teclado//
    public void KeyPressed(KeyEvent e)  {
        // si precionamos la tecla spacio el personaje salta
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            saltando=true;
        }
    }
    public Rectangle getBounds()    {
        return new Rectangle(x_inicial+2, y_inicial+y_auxiliar, ancho_personaje, alto_personaje);
    }

   
}
        
    
    

 