import greenfoot.*;

/**
 *muestra los creditos
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class FondoAutor extends World
{

    /**
     * Constructor para objetos de clase FondoAutor.
     * 
     */
    public FondoAutor()
    {    
        // Crea un nuevo mundo de 700x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(700, 400, 1);
        
        Back b=new Back();//Crea Boton de regreso
   
        addObject(b,600,300);
    }
}
