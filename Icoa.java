import greenfoot.*;

/**
clase que permite mostrar la ayuda del juego
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Icoa extends Boton
{
    /**
     * Act - hace lo que Icoa quiere hacer. Este método se llama "cuando quiera" o whenever
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
            w=new FondoAutor();
            Greenfoot.setWorld(w);
        } 
    }   
}
 

