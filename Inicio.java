import greenfoot.*;

/**
 * Muestra el escenario inicio que tiene el menu principal del jeugo.
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Inicio extends World
{

    /**
     * Constructor para objetos de clase Inicio.
     * 
     */
    public Inicio()//Es la Clase Costructora del Mundo inicio REPRODUCE SONIDO
    {    
        super(700, 400, 1);//Tamaño de la Pantalla
        // Greenfoot.playSound("where is my mind.mp3");
        
        //GreenfootSound music=new GreenfootSound("Piñaton.mp3");
        //music.playLoop();
        //music.setVolume(0);
        
        Boton b1;//Boton Juego
        Boton b2;//Boton Puntaje
        Boton b3;//Boton Autores
        Boton b4;//Boten Informacion
    
        b1=new Icoj();//Crea Boton de Jugar
        b2=new Icop();//Crea Boton de Puntaje
        b3=new Icoa();//Crea Boton de Autores
        b4=new Icoi();//Crea Boton de Informacion
   
        addObject(b1,90,300);//Agrega el Boton Jugar
        addObject(b2,260,300);//Agrega el Boton Puntaje
        addObject(b3,420,300);//Agrega el Boton Autores 
        addObject(b4,570,300);//Agrega el Boton Informacion
        
 
      
    }
}
