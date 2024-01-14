import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoadingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class LoadingScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int)(640*1.35), (int)(480*1.4), 1);
        GreenfootImage image = new GreenfootImage("winner.png");
        image.scale(900, 600);
        setBackground(image);
    }
}
