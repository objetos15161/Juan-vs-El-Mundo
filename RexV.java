import greenfoot.*;

/**
una suclase de clase enemigo igual que rex es un enemigo con atribuos distintos que lo hace un poco mas rapido que rex1
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class RexV extends Enemigo

{
    private GreenfootImage Rex1= new GreenfootImage("Rex1.gif");
    private GreenfootImage Rex2= new GreenfootImage("Rex2.gif");
    private GreenfootImage Rex3= new GreenfootImage("Rex1.gif");// izquierda
    private GreenfootImage Rex4= new GreenfootImage("Rex2.gif");//izquierda
    private boolean bandMoveR;
     private int b;
    private int a;
    int contador;
     int banderap;
     
    int cuenta;
    public RexV()
    {
        setImage(Rex1);
        bandMoveR = false;
        Rex3.mirrorHorizontally();
        Rex4.mirrorHorizontally();
    
        int banderap=1;
         cuenta=0;
        int contador=0;   
    }

    /**
     * Act - hace lo que Enemigo1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
        a=getY();
        b=getX();
        
        
            try
            {
          if(isTouching(Juan.class)==false)
          { 
          mover();
          }
        }
          catch(Exception p)
        {

        }
        
}   

    public void mover()
    {
        int aleatorio = Greenfoot.getRandomNumber(4);
        if(contador == 10)
        {
            if(aleatorio == 1)
               {
                   turn(12);
                  if(bandMoveR == false)
            {
                setImage(Rex3);
                bandMoveR = true;
               // Greenfoot.delay(5);
            }
            else if(bandMoveR== true)
            {
                setImage(Rex4);
                bandMoveR = false;
                //Greenfoot.delay(5);
            }
        
                }
            
            contador=0;
        }
        else 
        {
          
            contador++;
            move(-2);
        
        }
    }
}

