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
    
    float factor;
    float velocidad;
    
    public Plancha()
    {
        velocidad=1f;
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
    }
    
    public boolean IsAtTopEdge()
    {
                
        return getY()<Imagen.getHeight()*factor+25;
        
    }
    
    public boolean IsAtBottomEdge()
    {
        return getY()>480-(Imagen.getHeight()*factor-25);
    }
}