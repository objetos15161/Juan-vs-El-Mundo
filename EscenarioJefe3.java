import greenfoot.*;

/**
 *El ultimo nivel que contiene el jefe mas poderoso.
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class EscenarioJefe3 extends World
{

    /**
     * Constructor para objetos de clase EscenarioJefe3.
     * 
     */
    public Contador contador1;
    public EscenarioJefe3()
    {    
        // Crea un nuevo mundo de 700x400 celdas con un tamaño de celda de 1x1 pixeles.
       
        super(700,400, 1); 
        Juan j= new Juan();
        addObject(j,350,200);
         VidaCount vid=new VidaCount();
        addObject(vid,604,42);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
        
        Malo pa= new Malo();
        addObject(pa,10,50);
    }
//aumenta contador
public void aumentarContCan()
    {
        contador1.add(1);
    }
    //obtiene escenario
    
    public EscenarioJefe3 getEscenario()
    {
        return this;
    }
}