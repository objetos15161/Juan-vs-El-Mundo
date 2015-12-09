import greenfoot.*;

/**
una subclase de la clase enemigo enemigo con caracteristicas de moviemiento lento y poca resistencia
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Rex extends Enemigo

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
    //constuctor de la clase rex
    public Rex()
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
//moviemiento de la clase que le permite interactuar con el mundo
    public void mover()
    {
        int aleatorio = Greenfoot.getRandomNumber(4);
        if(contador == 10)
        {
            if(aleatorio == 1)
               {
                   turn(45);
                  
                }
            
            contador=0;
        }
        else 
        {
            if(bandMoveR == false)
            {
                setImage(Rex1);
                bandMoveR = true;
                //Greenfoot.delay(5);
            }
            else if(bandMoveR== true)
            {
                setImage(Rex2);
                bandMoveR = false;
                //Greenfoot.delay(5);
            }
        
          
            contador++;
            move(2);
        
        }
    }
}

