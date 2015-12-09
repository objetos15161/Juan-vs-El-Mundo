import greenfoot.*;
import java.util.*;

/**
clase importante ya que es utilizada por el actor para pasar de nivel usada en el escenario1
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Coin extends Actor
{
    private List<Contador> cont;
    
    /**
     * Act - hace lo que Coin quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        if(this.isTouching(Juan.class)==true)
        {
            World w=getWorld();
            
            cont=w.getObjectsAt(100, 15,Contador.class);
            ((Contador)cont.get(0)).add(1);
            
            w.removeObject(this);
            
        }
    }    
}
