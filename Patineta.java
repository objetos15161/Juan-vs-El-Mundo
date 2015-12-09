import greenfoot.*;

/**
una clase hija de clase enemigo este enemigo es el mas rapido y de mayor resistencia
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Patineta extends Enemigo
{
     private GreenfootImage Patineta1= new GreenfootImage("patineta1.gif");
    private GreenfootImage Patineta2= new GreenfootImage("patineta2.gif");
    //private GreenfootImage Rex3= new GreenfootImage("Rex1.gif");// izquierda
   // private GreenfootImage Rex4= new GreenfootImage("Rex2.gif");//izquierda
    private boolean bandMoveR;
     private int b;
    private int a;
    int contador;
     int banderap;
     
    int cuenta;
    public Patineta()
    {
        setImage(Patineta1);
        bandMoveR = false;
        //Rex3.mirrorHorizontally();
        //Rex4.mirrorHorizontally();
    
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
        int aleatorio = Greenfoot.getRandomNumber(2);
        if(contador == 10)
        {
            if(aleatorio == 1)
                turn(45);
            //if(aleatorio==2)
             //|   turn(-45);
            contador=0;
            
        }
        else 
    {
        contador++;
        if(bandMoveR == false)
            {
                setImage(Patineta1);
                bandMoveR = true;
               // Greenfoot.delay(5);
            }
            else if(bandMoveR== true)
            {
                setImage(Patineta2);
                bandMoveR = false;
                //Greenfoot.delay(5);
            }
        move(10);
    }   
            
}   
       
        
    }
    
    



