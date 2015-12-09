import greenfoot.*;

/**
subclase de clase jefe enemigo 
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Jefe1 extends JefeEnemigo
{
    /**
     * Act - hace lo que Gemelos quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage Jefe1= new GreenfootImage("jgideon1.gif");
    private GreenfootImage Jefe2= new GreenfootImage("jgideon2.gif");
    private GreenfootImage Jefe3= new GreenfootImage("jgideon3.gif");
    private GreenfootImage Jefe4= new GreenfootImage("jgideon4.gif");
    private boolean bandMoveR;
    int contador;
    public Jefe1()
    {
        setImage(Jefe1);
        bandMoveR = false;
      
     
        
        
        int contador=0;   
    }
    
    public void act() 
    
    {
        // Agrega tus códigos de acción aquí.
        mover();
        
    }    

public void mover()
{
          int aleatorio = Greenfoot.getRandomNumber(3);
        if(contador == 10)
        {
            if(aleatorio == 1)
                turn(45);
                if(bandMoveR == false)
            {
                setImage(Jefe2);
                bandMoveR = true;
                Greenfoot.delay(5);
            }
            else if(bandMoveR == true)
            {
                setImage(Jefe4);
                bandMoveR = false;
                Greenfoot.delay(5);
            }
            //if(aleatorio==2)
             //|   turn(-45);
            contador=0;
            move(2);
           
        }
        else 
        contador++;
         move(3);
         setImage(Jefe3);
}
}