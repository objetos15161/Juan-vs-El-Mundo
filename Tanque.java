import greenfoot.*;

/**
jefe del nivel2 muy grande y dificil de evitar
 * 
 * @Ulises Gomez) 
 * @7/12/15)
 */
public class Tanque extends JefeEnemigo
{
    int contador;
    public Tanque()
    {
        int contador=0;   
    }

    /**
     * Act - hace lo que Enemigo1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
        mover();
    }    

    public void mover()
    {

        if(contador==10)
        {
            int aleatorio=Greenfoot.getRandomNumber(3);
            if(aleatorio==1)
                turn(45);
           
            contador=0;

        }
        else
            contador ++;
        move(5);
    }
}

