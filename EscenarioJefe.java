import greenfoot.*;

/**
 * El escenarioJfe uno el cual es el mas sencillo de pasar con sus objetos jefe  .
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class EscenarioJefe extends World
{

    /**
     * Constructor para objetos de clase EscenarioJefe.
     * 
     */
    public Contador contador1;
    public EscenarioJefe()
    {    
        // Crea un nuevo mundo de 700x400 celdas con un tamaño de celda de 1x1 pixeles.
        
        super(700,400, 1); 
        Juan j= new Juan();
        addObject(j,350,200);
         VidaCount vid=new VidaCount();
        addObject(vid,604,42);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
     
        Jefe1 j1= new Jefe1();
        addObject(j1,10,50);
        Rex r1= new Rex();
        addObject(r1,10,100);
        Rex r2= new Rex();
        addObject(r2,10,150);
        Rex r3= new Rex();
        addObject(r3,10,200);
        Rex r4= new Rex();
        addObject(r4,10,250);
        Rex r5= new Rex();
        addObject(r5,650,50);
        Rex r6= new Rex();
        addObject(r6,650,100);
        Rex r7= new Rex();
        addObject(r7,650,150);
        Rex r8= new Rex();
        addObject(r8,650,200);
        Rex r9= new Rex();
        addObject(r9,650,250);
        
    }
    public void aumentarContCan()
    {
        contador1.add(1);
    }
    
    public EscenarioJefe getEscenario()
    {
        return this;
    }
}
