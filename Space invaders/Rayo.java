import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rayo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rayo extends Actor
{
    /**
     * Act - do whatever the Rayo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Rayo()
    {
        
        GreenfootImage planchaImagen = new GreenfootImage("rayo.png");
        int nuevaAltura = planchaImagen.getHeight()*1/8;
        int nuevaAnchura = planchaImagen.getWidth()*1/8;
        planchaImagen.scale(nuevaAnchura, nuevaAltura);
        setImage(planchaImagen);        
    }
    
        public void act()
        {
            // Add your action code here.
        
        }
}
