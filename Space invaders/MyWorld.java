import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int)(640*1.35), (int)(480*1.35), 1);
        GreenfootImage Imagen = new GreenfootImage("oceano.jpg");
        int nuevaAltura = (int)((float)Imagen.getHeight()*1.35);
        int nuevaAnchura = (int)((float)Imagen.getWidth()*1.35);
        Imagen.scale(nuevaAnchura, nuevaAltura);
        setBackground(Imagen);
    }
    
    public void started() {
        addObject(new Plancha(), 100, 240);
        addObject(new PezRojo(), 700, 100);
        addObject(new PezAzul(), 500, 100);
        addObject(new Rayo(), 100, 240);
    }
}
