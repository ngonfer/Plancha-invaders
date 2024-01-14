import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoadingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadingScreen extends World
{
    /**
     * Constructor for objects of class LoadingScreen.
     * 
     */
    public LoadingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int)(640*1.35), (int)(480*1.4), 1);
        GreenfootImage image = new GreenfootImage("istockphoto-847794500-1024x1024(2).jpg");
        image.scale(864, 672);
        Label label1 = new Label("Consigue 30 puntos para ganar",40);
        Label label2 = new Label("W para ir hacia arriba",40);
        Label label3 = new Label("S para ir hacia abajo",40);
        Label label4 = new Label("Espacio para disparar",40);
        addObject(label1, 240, 100);
        addObject(label2, 240, 200);
        addObject(label3, 240, 300);
        addObject(label4, 240, 400);
        setBackground(image);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
