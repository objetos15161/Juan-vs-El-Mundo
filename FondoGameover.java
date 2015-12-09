import greenfoot.*;

/**
 *Indica el fin del juego
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class FondoGameover extends World
{

    /**
     * Constructor para objetos de clase FondoGameover.
     * 
     */
    public FondoGameover()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(700, 400, 1); 
        Back b=new Back();//Crea Boton de regreso
   
        addObject(b,600,300);
    }
}
