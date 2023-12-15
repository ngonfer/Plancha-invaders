import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    public Rayo()
    {
        factor = 1/32f;
        Imagen = new GreenfootImage("image.png");
        ScaleBy(factor);
        setImage(Imagen);
    }
    
        public void act()
        {
            // Add your action code here.
        
        }
}
