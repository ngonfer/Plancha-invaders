import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Pez()
    {
        GreenfootImage planchaImagen = new GreenfootImage("fish-30828_1280.png");
        int nuevaAltura = planchaImagen.getHeight()*1/8;
        int nuevaAnchura = planchaImagen.getWidth()*1/8;
        planchaImagen.scale(nuevaAnchura, nuevaAltura);
        setImage(planchaImagen);
    }
    
    public void act()
    { 
        if (Greenfoot.isKeyDown(""))
        {
            
        }
    }
}
