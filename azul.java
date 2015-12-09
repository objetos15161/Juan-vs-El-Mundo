import greenfoot.*;
import java.util.*;

/**
clase que permite pasar de nivel del ultimo para ser exactos
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class azul extends Actor
{
    private List<Contador> cont3;
    
    /**
     * Act - hace lo que Coin quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        if(this.isTouching(Juan.class)==true)
        {
            World w=getWorld();
            
            cont3=w.getObjectsAt(100, 15,Contador.class);
            ((Contador)cont3.get(0)).add(3);
            
            w.removeObject(this);
            
        }
    }    
}