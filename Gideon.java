import greenfoot.*;

/**
 * una clase utilizada poco, enemigo con atributo de rapidez
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Gideon extends Enemigo
{
      private GreenfootImage Gideon1= new GreenfootImage("gideon3.gif");
    private GreenfootImage Gideon2= new GreenfootImage("gideon4.gif");
    
    private boolean bandMoveR;
     private int b;
    private int a;
    int contador;
     int banderap;
     
    int cuenta;
    public Gideon()
    {
        setImage(Gideon2);
        bandMoveR = false;
        
    
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
                   turn(45);
                  if(bandMoveR == false)
            {
                setImage(Gideon1);
                bandMoveR = true;
                
            }
            else if(bandMoveR== true)
            {
                setImage(Gideon2);
                bandMoveR = false;
               
            }
        
                }
            
            contador=0;
        }
        else 
        {
          
            contador++;
            move(15);
        
        }
    }
}



