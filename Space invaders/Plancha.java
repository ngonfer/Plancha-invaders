import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plancha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plancha extends ActorExtension
{
    /**
     * Act - do whatever the Plancha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    SimpleTimer timer = new SimpleTimer();
    
    public Plancha()
    {
        velocidad=1.5f;
        factor = 1/8f;
        Imagen = new GreenfootImage("iron-158742_1280.png");
        Imagen.mirrorHorizontally();
        ScaleBy(factor);
        setImage(Imagen);
    }
    
    public void act()
    {
        // Add your action code here.
        UpdatePosition();
    }
    
    public void UpdatePosition()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            if (!IsAtTopEdge())
            {
                BetterMove(0, (int)(-2*velocidad));
            }
        }
        if (Greenfoot.isKeyDown("s"))
        {
            if (!IsAtBottomEdge())
            {
                BetterMove(0, (int)(2*velocidad));
            }
        }
        if (Greenfoot.isKeyDown("space"))
        {
            if (timer.millisElapsed() > 500 && Greenfoot.isKeyDown("space"))
            {
                Shoot();
                timer.mark();
            }
        }
    }
    
    public void Shoot()
    {
        getWorld().addObject(new Rayo(), getX()+100, getY());
    }
}