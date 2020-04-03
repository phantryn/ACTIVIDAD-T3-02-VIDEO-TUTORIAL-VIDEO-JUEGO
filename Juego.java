

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Juego extends JPanel   {
    
    
 
    Personaje personaje1 = new Personaje(this);
    Obstaculo obstaculo1 = new Obstaculo(this);
    Nube nube = new Nube(this);
    
    public boolean juegoFinalizado=false;
    public int puntos = 0;
    public Juego()  {
        addKeyListener(new KeyListener()    {
            

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
              personaje1.KeyPressed(e);  
            }
             } );
        setFocusable(true);     
        }

    void mover()    {
        personaje1.mover();
        obstaculo1.mover();
        nube.mover();
    }
         
   
         @Override
         public void paintComponent(Graphics g)   {
             
             super.paintComponent(g);
             Graphics2D g2 = (Graphics2D) g;
             g2.setPaint(Color.WHITE);
             dibujarPuntuaje(g2);
             dibujar(g2);
         }  
         
         
         public void dibujar (Graphics2D g) {
             
             g.setColor(Color.BLUE);
             nube.paint(g);
             
             g.setColor(Color.RED);
             personaje1.paint(g);
             
             g.setColor(Color.BLACK);
             obstaculo1.paint(g);
             mover();
             }
         public void dibujarPuntuaje(Graphics2D g)  {
             Graphics2D g1 =g, g2 =g;
             Font score = new Font("Bodoni MT Black",Font.BOLD, 25);
             g.setFont(score);
             g.setColor(Color.BLACK);
             g1.drawString("Puntuaje: "+puntos, 510, 30);
             
             if(juegoFinalizado)
             {
             
             g2.setColor(Color.red);
             g2.drawString("¡¡¡ GAME OVER !!!", ((float) getBounds().getCenterX() /2)+140, 70);
             } 
         }
             public void finJuego() {
                 juegoFinalizado=true;
                 
    
}

    
}







   