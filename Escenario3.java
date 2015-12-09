import greenfoot.*;

/**
 * Muestra el escenario3 uno el cual es el mas dicil de pasar con sus objetos monedas enemigos y actor .
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Escenario3 extends World
{

    /**
     * Constructor para objetos de clase Escenario3.
     * 
     */
    public Contador contador1;
    public Escenario3()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(700, 400, 1); 
         
        Juan j= new Juan();
        addObject(j,350,200);
        contador1 = new Contador("JUAN: ");
        addObject(contador1, 100, 15);
        //monedas x,y
        azul c=new azul();
        addObject(c,100,100);
        azul c2=new azul();
        addObject(c2,150,100);
        azul c3=new azul();
        addObject(c3,200,100);
        
         azul c4=new azul();
        addObject(c4,100,250);
         azul c5=new azul();
        addObject(c5,100,300);
        
        azul c6=new azul();
        addObject(c6,100,350);
        
        azul c7=new azul();
        addObject(c7,500,350);
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
        
         Rex e2=new Rex();
        addObject(e2,475,100);
         RexV v1=new RexV();
        addObject(v1,175,300);
  
            Patineta p3=new Patineta();
        addObject(p3,100,200);
            Patineta p4=new Patineta();
        addObject(p4,600,200);
         Rex r3= new Rex();
        addObject(r3,10,200);
        Rex r4= new Rex();
        addObject(r4,10,250);
        Rex r5= new Rex();
        addObject(r5,650,50);
        Rex r6= new Rex();
        addObject(r6,650,100);
        VidaCount vid=new VidaCount();
        addObject(vid,604,42);
        Gideon h= new Gideon();
        addObject(h,123,300);
        
    }
     public void aumentarContCan()
    {
        contador1.add(1);
    }
    
    public Escenario3 getEscenario()
    {
        return this;
    }

}
