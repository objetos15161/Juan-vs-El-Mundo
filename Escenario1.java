import greenfoot.*;

/**
 * Muestra el escenario uno el cual es el mas sencillo de pasar con sus objetos monedas enemigos y actor .
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Escenario1 extends World
{

    /**
     * Constructor para objetos de clase Escenario1.
     * 
     */
    public Contador contador1;
    public Escenario1()
    {    
        // Crea un nuevo mundo de 700x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(700,400, 1); 
        Juan j= new Juan();
        addObject(j,350,200);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
        //monedas x,y
        Coin c=new Coin();
        addObject(c,100,100);
        Coin c2=new Coin();
        addObject(c2,150,100);
        Coin c3=new Coin();
        addObject(c3,200,100);
        
         Coin c4=new Coin();
        addObject(c4,100,250);
         Coin c5=new Coin();
        addObject(c5,100,300);
        
        Coin c6=new Coin();
        addObject(c6,100,350);
        
        Coin c7=new Coin();
        addObject(c7,500,350);
        Coin c8=new Coin();
        addObject(c8,550,350);
        Coin c9=new Coin();
        addObject(c9,600,350);
        
        Coin c10=new Coin();
        addObject(c10,600,200);
        Coin c11=new Coin();
        addObject(c11,600,150);
       
        Patineta p1=new Patineta();
        addObject(p1,420,200);
           
        
        
        
        
        
        
        
        
        
        VidaCount vid=new VidaCount();
        addObject(vid,604,42);
        //enemigos
        Rex e1=new Rex();
        addObject(e1,175,100);
         Rex e2=new Rex();
        addObject(e2,475,100);
         RexV v1=new RexV();
        addObject(v1,175,300);
        RexV v2=new RexV();
        addObject(v2,475,300);
        
        Gemelos g1=new Gemelos();
        addObject(g1,350,350);
        Gemelos g2=new Gemelos();
        addObject(g2,10,70);
         
        Muro m1=new Muro();
        addObject(m1,30,50);
        Muro m2=new Muro();
        addObject(m2,30,100);
        Muro m3=new Muro();
        addObject(m3,30,150);
        
        Muro m4=new Muro();
        addObject(m4,30,250);
        Muro m5=new Muro();
        addObject(m5,30,300);
        Muro m6=new Muro();
        addObject(m6,30,350);
        
        Muro m7=new Muro();
        addObject(m7,300,50);
        Muro m8=new Muro();
        addObject(m8,350,50);
        Muro m9=new Muro();
        addObject(m9,400,50);
        
        
        Muro m10=new Muro();
        addObject(m10,300,350);
        Muro m11=new Muro();
        addObject(m11,350,350);
        Muro m12=new Muro();
        addObject(m12,400,350);
        
        Muro m13=new Muro();
        addObject(m13,670,50);
        Muro m14=new Muro();
        addObject(m14,670,100);
        Muro m15=new Muro();
        addObject(m15,670,150);
        
        Muro m16=new Muro();
        addObject(m16,670,250);
        Muro m17=new Muro();
        addObject(m17,670,300);
        Muro m18=new Muro();
        addObject(m18,670,350);
        
        
        
        
        
       
     
    }
    //aumenta contador 
    public void aumentarContCan()
    {
        contador1.add(1);
    }
    //obtiene escenario
    public Escenario1 getEscenario()
    {
        return this;
    }

}
