import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pez extends ActorExtension
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pez()
    {
        Imagen = new GreenfootImage("fish-30828_1280.png");
        ScaleBy(1/8f);
        setImage(Imagen);
    }
    
    public void act()
    { 
        if (Greenfoot.isKeyDown(""))
        {
            
        }
    }
}
