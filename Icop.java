import greenfoot.*;

/**
muestra los puntos
 * 
ulises gomez
7/12/15
 */
public class Icop extends Boton
{
    /**
     * Act - hace lo que Icop quiere hacer. Este método se llama "cuando quiera" o whenever
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

            w=new FondoPuntaje();
            Greenfoot.setWorld(w);
        } 
    }    
}
