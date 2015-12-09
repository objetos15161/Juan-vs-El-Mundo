import greenfoot.*;

/**
subclase de clase jefeenemigo el jefe final
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Malo extends JefeEnemigo
{
    private GreenfootImage Malo1= new GreenfootImage("vegano1.gif");
    private GreenfootImage Malo2= new GreenfootImage("vegano2.gif");
    private GreenfootImage Malo3= new GreenfootImage("vegano3.gif");
    private GreenfootImage Malo4= new GreenfootImage("vegano5.gif");
    private boolean bandMoveR;
    int contador;
    public Malo()
    {
        setImage(Malo1);
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
                setImage(Malo2);
                bandMoveR = true;
                Greenfoot.delay(5);
            }
            else if(bandMoveR == true)
            {
                setImage(Malo3);
                bandMoveR = false;
                Greenfoot.delay(5);
            }
            
            contador=0;
            move(2);
           
        }
        else 
        contador++;
         move(3);
         setImage(Malo4);
}
}
