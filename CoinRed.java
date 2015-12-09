import greenfoot.*;
import java.util.*;

/**
clase importante ya que es utilizada por el actor para pasar de nivel
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class CoinRed extends Actor
{
    private List<Contador> cont2;
    
    /**
     * Act - hace lo que Coin quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        if(this.isTouching(Juan.class)==true)
        {
            World w=getWorld();
            
            cont2=w.getObjectsAt(100, 15,Contador.class);
            ((Contador)cont2.get(0)).add(2);
            
            w.removeObject(this);
            
        }
    }    
}