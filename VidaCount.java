import greenfoot.*;
/**
clase que muestra la vida del protagonista la cual se ve reflejada en la parte superior derecha
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class VidaCount extends Actor
{
    private GreenfootImage v0=new GreenfootImage("vida0.png");
    private GreenfootImage v1=new GreenfootImage("vida1.png");
    private GreenfootImage v2=new GreenfootImage("vida2.png");
    private GreenfootImage v3=new GreenfootImage("vida3.png");
    private int cont;
    /**
     * Act - hace lo que VidaCount quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public VidaCount()
    {
       cont=3;
       setImage(v1);
    }
    
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
    } 
    //disminuye
    public void dis()
    {
        cont--;
        switch(cont)
        {
            case 2:
                setImage(v2);
            break;
            case 1:
                setImage(v3);
            break;
            case 0:
                setImage(v0);
            break;
        }
    }
}
