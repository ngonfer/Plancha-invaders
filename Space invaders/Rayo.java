import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Rayo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rayo extends ActorExtension
{
    /**
     * Act - do whatever the Rayo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random ran = new Random();
    
    public Rayo()
    {
        velocidad=4f;
        factor = 1/32f;
        Imagen = new GreenfootImage("image.png");
        ScaleBy(factor);
        setImage(Imagen);
    }
    
    public void act()
    {
        // Add your action code here.
        SerDisparado();
    }
        
    public void SerDisparado()
    {
                
        BetterMove((int)(2*velocidad),0);
            
        Actor actor = getOneIntersectingObject(Actor.class);
        if (actor != null) 
        {
            getWorld().removeObject(actor);
            int X = ran.nextInt(450,700);
            MyWorld.contador.add(1);
            MyWorld.score++;
            if (ran.nextInt(2)==1)
            {
                getWorld().addObject(Pez.PezAzul(),X,300);
            }
            else
            {
                getWorld().addObject(Pez.PezRojo(), X, 100);
            }
            
            if (MyWorld.score==30)
            {
                Greenfoot.setWorld(new WinScreen());
            }
            getWorld().removeObject(this);
            
            Random ran = new Random();
            
            return;
        }
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}