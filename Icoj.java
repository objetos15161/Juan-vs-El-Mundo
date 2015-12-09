import greenfoot.*;

/**
es la clase que da inicio al juego y de la forma de que interactuan los objetos de las distintas clases
 * 
ulises gomez
7/12/15
 */
public class Icoj extends Boton
{
    /**
     * Act - hace lo que Icoj quiere hacer. Este método se llama "cuando quiera" o whenever
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
            
            w=new Escenario1();
            Greenfoot.setWorld(w);
        } 
    }   
}
