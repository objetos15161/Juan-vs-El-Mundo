import greenfoot.*;

/**
 * Basicamente muestra la puntuacion de los jugadores
 * 
 * ulises gomez
 * 7712715
 */
public class FondoPuntaje extends World
{

    /**
     * Construye las caracteristicas Iniciales del Mundo
     * 
     * @param music musica de la clase GreenfootSound
     */
    public FondoPuntaje()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       // super(700, 600, 1); 
        super(700, 400, 1);
        
        
        ScoreBoard score=new ScoreBoard(700,600);
        addObject(score, 400, 343);
        Back b=new Back();//Crea Boton de regreso
   
        addObject(b,600,300);
    }
        public void actualizaRecord()
    {
        if (UserInfo.isStorageAvailable()) 
        {
           UserInfo myInfo = UserInfo.getMyInfo();
           
               
               myInfo.store();  
           }
        }
}

