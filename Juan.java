import greenfoot.*;
import java.util.*;

/**
Clase Juan la clase mas importante ya que en ella interactuan los demas objetos el funcionamiento principal del jeugo
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Juan extends Actor
{
    //variables
    private GreenfootImage juan1= new GreenfootImage("juan2.gif");
    private GreenfootImage juan2= new GreenfootImage("juan3.gif");
    private GreenfootImage juan3= new GreenfootImage("juan2.gif");
    private GreenfootImage juan4= new GreenfootImage("juan3.gif");
    private GreenfootImage juan5= new GreenfootImage("juanGolpe.gif");
    private GreenfootImage juan6= new GreenfootImage("juanGolpe1.gif");
    private GreenfootImage juan7= new GreenfootImage("juanGolpe.gif");
    private GreenfootImage juan8= new GreenfootImage("juanGolpe1.gif");
    private boolean b;
    private boolean bandMove;
    private boolean banderachida;
    private int bandera=0;
    private boolean bandMoveGol;
    private boolean bandinit;
    private int y;
    private int x;
    private int a;
    private int z;
    int golpe;
    int banderamal;
    int banderaroja;
    int cuentamucho;
    int next;
    int otra;
    private List<VidaCount> vid;
    private SimpleTimer timeFail;
    private boolean daño;
    private List<Contador> cont;
     private List<Contador> cont2;
     private List<Contador> cont3;
//constructor
    public Juan()
    {
        setImage(juan3);
        b=true;
        banderaroja=0;
        bandMove = false;
        juan3.mirrorHorizontally();
        juan4.mirrorHorizontally();
        juan7.mirrorHorizontally();
        juan8.mirrorHorizontally();
        bandinit=true;
        timeFail=new SimpleTimer();
        daño=true;
        banderachida=false;
        banderamal=0;
        cuentamucho=0;
        golpe=0;
        otra=0;
        next=0;
    }

    /** Act - hace lo que Juan quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el etorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
        if(bandinit == true)
        {
            y=getY();
            x=getX();
            a=getY();
            z=getX();
            bandinit=false;
            World w=getWorld();
            cont=w.getObjects(Contador.class);
            World wx=getWorld();
            cont2=wx.getObjects(Contador.class);
            World wy=getWorld();
            cont3=wy.getObjects(Contador.class);
        }
        //metodos para reducir la vida de juan
        if(isTouching(RexV.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
             removeTouching(RexV.class);
            if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=8000)
                {
                    daño=true;
                }
            }
        } 
         if(isTouching(Rex.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
             removeTouching(Rex.class);
            if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=5000)
                {
                    daño=true;
                }
            }
        } 
        if(isTouching(Gemelos.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
             removeTouching(Gemelos.class);
            
             if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=8000)
                {
                    daño=true;
                }
            }
            
            
        } 
        if(isTouching(Gideon.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
             removeTouching(Gideon.class);
            
             if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=10000)
                {
                    daño=true;
                }
            }
            
            
        } 
        if(isTouching(Malo.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
            {
                cuentamucho++;
            }
            if (cuentamucho==45)
            {
            removeTouching(Malo.class);
            next=3;
            
        }
             
            
             if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=1000)
                {
                    daño=true;
                }
            }
            
            
        } 
        if(isTouching(Patineta.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
             removeTouching(Patineta.class);
            
             if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=3000)
                {
                    daño=true;
                }
            }
            
            
        } 
        if(isTouching(Jefe1.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
            {
                cuentamucho++;
            }
            if (cuentamucho==45)
            {
            removeTouching(Jefe1.class);
            next=1;
            
        }
            if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=9000)
                {
                    daño=true;
                }
            }
            otra=1;
        } 
        if(isTouching(Tanque.class)==true)
        {
            if(Greenfoot.isKeyDown("space")==true)
            {
                cuentamucho++;
            }
            if (cuentamucho==45)
            {
            removeTouching(Jefe1.class);
            next=2;
            
        }
            if(daño==true)
            {
                World w=getWorld();
                vid=w.getObjects(VidaCount.class);
                ((VidaCount)vid.get(0)).dis();
                daño=false;
                timeFail.mark();
                banderamal++;
            }
            else
            {
                if(timeFail.millisElapsed()>=10000)
                {
                    daño=true;
                }
            }
            otra=1;
        } 
        
       // if(((Contador)cont.get(0)).getValue()==13)
       if( banderamal==3)
       {
            World w10=getWorld();
            w10=new FondoGameover();
            Greenfoot.setWorld(w10);
            
            
        }
        if(next==1)
        {
            World w5=getWorld();
            w5=new Escenario2();
            Greenfoot.setWorld(w5);
        }
        if(next==2)
        {
            World w20=getWorld();
            w20=new Escenario3();
            Greenfoot.setWorld(w20);
        }
        if(next==3)
        {
            World w99=getWorld();
            w99=new Ganador();
            Greenfoot.setWorld(w99);
        }
        if(((Contador)cont.get(0)).getValue()==24)
        {
            
           
            
           
           
            World w3=getWorld();
            w3=new EscenarioJefe2();
            Greenfoot.setWorld(w3);
        
       }
       if(((Contador)cont2.get(0)).getValue()==11)
        {
            
            World w100=getWorld();
            w100=new EscenarioJefe();
            Greenfoot.setWorld(w100);
            
         }
        if(((Contador)cont2.get(0)).getValue()==21)
        {
            
            World w1000=getWorld();
            w1000=new EscenarioJefe3();
            Greenfoot.setWorld(w1000);
            
         }
         
        
        
        try
        {
          if(isTouching(Muro.class)==false)
          { 
          mover();
          }
          else
          {
              x=x-1;
              y=y+2;
              
             
              setLocation(x,y);
              
          }
      
      }
        catch(Exception e)
        {

        }
    
    }
//moviento de juan
    public void mover()
    { 
      if(Greenfoot.isKeyDown("W")==true)
        { 
            setRotation(90);
            if(bandMove == false)
            {
                setImage(juan3);
                bandMove = true;
                Greenfoot.delay(5);
            }
            else if(bandMove == true)
            {
                setImage(juan4);
                bandMove = false;
                Greenfoot.delay(5);
            }
            y-=10;
            bandera=2;
         }
        if (Greenfoot.isKeyDown("S")==true)
        {
            setRotation(90);
            if(bandMove == false)
            {
                setImage(juan1);
                bandMove = true;
                Greenfoot.delay(5);
            }
            else if(bandMove == true)
            {
                setImage(juan2);
                bandMove = false;
                Greenfoot.delay(5);
            }
            y+=10;
            bandera=1;
            
        }
        if (Greenfoot.isKeyDown("A")==true)
        {
            setRotation(0);
            if(bandMove == false)
            {
                setImage(juan3);
                bandMove = true;
                Greenfoot.delay(5);
            }
            else if(bandMove == true)
            {
                setImage(juan4);
                bandMove = false;
                Greenfoot.delay(5);
            }
           
            x-=20;
            bandera=2;
           
        }
        if (Greenfoot.isKeyDown("D")==true)
        {
            setRotation(0);
            if(bandMove == false)
            {
                setImage(juan1);
                bandMove = true;
                Greenfoot.delay(5);
            }
            else if(bandMove == true)
            {
                setImage(juan2);
                bandMove = false;
                Greenfoot.delay(5);
            }
            x+=20;
            bandera=1;
         }
        setLocation(x,y); 
        //ACCION DE GOLPER
         if(Greenfoot.isKeyDown("space")==true)
         {
            golpe=1;
             if(bandera==1)
             {
             if(bandMoveGol == false)
            {
                setImage(juan5);
                bandMoveGol = true;
                Greenfoot.delay(5);
            }
            else if(bandMoveGol == true)
            {
                setImage(juan6);
                bandMoveGol = false;
                Greenfoot.delay(5);
            }
        }
         if(bandera==2)
             {
             if(bandMoveGol == false)
            {
                setImage(juan7);
                bandMoveGol = true;
                Greenfoot.delay(5);
            }
            else if(bandMoveGol == true)
            {
                setImage(juan8);
                bandMoveGol = false;
                Greenfoot.delay(5);
            }
        }        
         
        }
}
}

