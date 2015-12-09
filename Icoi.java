import greenfoot.*;

/**
subclase de clase boton muestra las instrucciones del juego
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Icoi extends Boton
{
    /**
     * Act - hace lo que Icoi quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private World m2;
    
    public void act() 
    {
       
        cambiaMundo(m2);
    }  
    
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {

            w=new FondoAyuda();
            Greenfoot.setWorld(w);
        } 
    }     
}
