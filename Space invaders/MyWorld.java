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
    public static Counter contador = new Counter("Puntuacion: ");
    public static int score;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int)(640*1.35), (int)(480*1.4), 1);
        contador.setValue(0);    
        GreenfootImage Imagen = new GreenfootImage("oceano.jpg");
        int nuevaAltura = (int)((float)Imagen.getHeight()*1.35);
        int nuevaAnchura = (int)((float)Imagen.getWidth()*1.35);
        Imagen.scale(nuevaAnchura, nuevaAltura);
        setBackground(Imagen);
        score=0;
        addObject(new Plancha(), 100, 240);
        addObject(contador, 400, 40);
        addObject(Pez.PezRojo(), 600, 100);
        addObject(Pez.PezAzul(), 500, 100);
    }
}