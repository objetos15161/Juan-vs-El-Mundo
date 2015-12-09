import greenfoot.*;

/**
otra subclase de la calse enemigo lso gemelos son enemigos rapidos con moviemiento aleatorio que hace dificil predecir a donde se van a dirigir
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Gemelos extends Enemigo
{
    /**
     * Act - hace lo que Gemelos quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage Gemelos1= new GreenfootImage("gemelos1.gif");
    private GreenfootImage Gemelos2= new GreenfootImage("gemelos2.gif");
    private boolean bandMoveR;
    int contador;
    public Gemelos()
    {
        setImage(Gemelos1);
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
int aleatorio = Greenfoot.getRandomNumber(4);
int aleatorio2 = Greenfoot.getRandomNumber(2);
        if(contador == 10)
        {
            if(aleatorio == 1)
               {
                   
                  if(bandMoveR == false)
            {
                setImage(Gemelos1);
                bandMoveR = true;
                Greenfoot.delay(5);
            }
            else if(bandMoveR== true)
            {
                setImage(Gemelos2);
                bandMoveR = false;
                Greenfoot.delay(5);
            }
            turn(-37);
                }
                else
               
            
            contador=0;
        }
        else 
        {
         
            contador++;
            move(5);
        
        }
    
    }
}