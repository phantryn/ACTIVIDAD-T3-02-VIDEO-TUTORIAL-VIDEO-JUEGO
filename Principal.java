


//Swing es una biblioteca de interfaces gráficas de usuario (GUI) para Java. 
//● Viene incluida con el entorno de desarrollo de Java (JDK). 
//● Extiende a otra librería gráfica más antigua llamada AWT. 
//● Paquetes: ● javax.swing ● java.awt ● 




import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Principal {
    
    public static void main (String[]args)  {   
              
        //creacion de una ventana con el nombre de nuestro juego
        JFrame ventana = new JFrame("Jumping Rectangle");
       
  
        Juego juego = new Juego ();
        // damos valores como 
        ventana.add(juego);
        // colocamos tamanio a la ventana (ancho, alto
        ventana.setSize(1300,400);
        // centramos la ventana en la pantalla
        ventana.setLocation(70,200);
        // hacemos que la ventana no sea redimiensionable
        ventana.setResizable (false );
        //hacemos vidible a la ventana//
        ventana.setVisible(true);
        // hacemos que cuando se cierra la ventana termina todo proceso
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //utilizamos un while que nos servira para estar creando los graficos del formulario
        while ( !juego.juegoFinalizado)     {
            juego.repaint();
            try {
                //creacion del hilo que nos servira para dar pequeñas pausas cuando se vallan creando los graficos del formulario
                Thread.sleep(3);
        //Si una tarea quiere despertar otra, le manda una interrupciónotra.interrupt();

 

//Si la otra tarea está activa, lo único que pasa es que se marca el flag de interrupción.

//Pero si la otra tarea está bloqueada esperando a que ocurra algo, en lugar de marcar el flag, se le lanza una InterruptedException.
//El efecto es que la tarea se despierta y sabe que es porque la ha interrumpido otra.

//Si no hacemos nada, la interrupción se limita a despertar a la tarea.        
            } catch (InterruptedException ex)   {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        //repaint() le dice a java que esa ventana/panel necesita repintado. Java lo repinta más adelante, cuando tiene
        //el hilo de repintado libre.Todo el codigo que se ejecute como consecuendia de un evento de teclado en este caso
       //(pulsar un boton) se ejecuta en el hilo de repintado. Hasta que no se termine de ejecutar el codigo, 
       //java no podrá repintar nada.
        juego.repaint();
        }
     
        
           
}   
