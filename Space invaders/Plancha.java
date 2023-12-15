import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plancha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plancha extends Actor
{
    /**
     * Act - do whatever the Plancha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Plancha()
    {
        GreenfootImage planchaImagen = new GreenfootImage("iron-158742_1280.png");
        int nuevaAltura = planchaImagen.getHeight()*1/8;
        int nuevaAnchura = planchaImagen.getWidth()*1/8;
        planchaImagen.scale(nuevaAnchura, nuevaAltura);
        planchaImagen.mirrorHorizontally();
        setImage(planchaImagen);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
