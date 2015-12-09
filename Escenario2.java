import greenfoot.*;

/**
 * El segundo nivel del jeugo el cual contiene mas eneigos y monedas que el escenario1.
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Escenario2 extends World
{

    /**
     * Constructor para objetos de clase Escenario2.
     * 
     */
    public Contador contador1;
    
    public Escenario2()
    {    
        // Crea un nuevo mundo de 700x400 celdas con un tamaño de celda de 1x1 pixeles.
      super(700,400,1);
        Juan j= new Juan();
        addObject(j,350,200);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
        //monedas x,y
        CoinRed c=new CoinRed();
        addObject(c,100,100);
        CoinRed c2=new CoinRed();
        addObject(c2,150,100);
        CoinRed c3=new CoinRed();
        addObject(c3,200,100);
        
         CoinRed c4=new CoinRed();
        addObject(c4,340,100);
         CoinRed c5=new CoinRed();
        addObject(c5,340,300);
        
        CoinRed c6=new CoinRed();
        addObject(c6,100,350);
        
        CoinRed c7=new CoinRed();
        addObject(c7,500,350);
        CoinRed c8=new CoinRed();
        addObject(c8,550,350);
        CoinRed c9=new CoinRed();
        addObject(c9,600,350);
        
        CoinRed c10=new CoinRed();
        addObject(c10,600,200);
        CoinRed c11=new CoinRed();
        addObject(c11,410,100);
        CoinRed c12=new CoinRed();
        addObject(c12,410,300);
        
        
        
        
        
        
        
        
        
        
        
        
        VidaCount vid=new VidaCount();
        addObject(vid,604,42);
         Gideon h= new Gideon();
        addObject(h,123,300);
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
       
        Patineta p1=new Patineta();
        addObject(p1,380,200);
        Patineta p2=new Patineta();
        addObject(p2,380,400);
        Patineta p3=new Patineta();
        addObject(p3,100,200);
        
         
        
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
        
        
        
        
        
     
    }
    //aumenta contador
    public void aumentarContCan()
    {
        contador1.add(1);
    }
    //obtiene escenario
    public Escenario2 getEscenario()
    {
        return this;
    }

}
