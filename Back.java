import greenfoot.*;

/**
clase que nos permite regresar al menu de inicio
 * 
ulises gomez
7/12/15
 */
public class Back extends Boton
{
    /**
     * Act - hace lo que Back quiere hacer. Este método se llama "cuando quiera" o whenever
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
            w=new Inicio();
            Greenfoot.setWorld(w);
        } 
    } 
}
