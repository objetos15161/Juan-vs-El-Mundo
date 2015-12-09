import greenfoot.*;

/**
 * Muestra el escenarioJefe2 uno el cual es el nivel intermedio de pasar con sus objetos monedas enemigos y actor .
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class EscenarioJefe2 extends World
{

    /**
     * Constructor para objetos de clase EscenarioJefe2.
     * 
     */
public Contador contador1;
    public EscenarioJefe2()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        
        super(700,400, 1); 
        Juan j= new Juan();
        addObject(j,350,200);
         VidaCount vid=new VidaCount();
        addObject(vid,604,42);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
        //contador1 = new Contador("JUAN: ");
        //addObject(contador1, 100, 15);
        Tanque t= new Tanque();
        addObject(t,10,50);
         Patineta p1=new Patineta();
        addObject(p1,375,100);
            Patineta p2=new Patineta();
        addObject(p2,375,400);
            Patineta p3=new Patineta();
        addObject(p3,100,200);
            Patineta p4=new Patineta();
        addObject(p4,600,200);
           
        
    }
    public void aumentarContCan()
    {
        contador1.add(1);
    }
    
    public EscenarioJefe2 getEscenario()
    {
        return this;
    }
}

