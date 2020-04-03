//Clase Graphics y sus métodos. Java proporciona la clase Graphics, que permite dibujar elipses, cuadrados, líneas,
//mostrar texto y también tiene muchos otros métodos de dibujo. ...
//La clase Graphics proporciona el entorno de trabajo para cualquier operación gráfica que se realice dentro del AWT.

import java.awt.Graphics2D;
//nosotros lo utilizamos para crear 3 circulos para poder crear una nube dentro del juego
public class Nube {
    //variable tamaño de la nube//
    int diametro = 20;
    int diametro2 = 40;
    //coordenadas iniciales donde se ubica el personaje
    int x = 1300;
    int y = 70;
    
    private Juego juego;
    public Nube(Juego juego)    {
        this.juego=juego;
    } 
    //coordenas de movimiento de la nube
    public void mover() {
        x = x - 1;
        if(x==-50)
        {
            x=1300;
            
        }
    }
    //Permite pintar en la pantalla.El objeto Graphics controla el contexto de graficos
    public void paint(Graphics2D g)     {
        g.fillOval(x, y, diametro, diametro);
        g.fillOval(x+15, y-15, diametro2, diametro2);
        g.fillOval(x+50, y, diametro, diametro);
    }
    
}
