import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class PezAzul extends Pez
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random ran = new Random();
    boolean isMovingUp;
    int tasaDeGiro;
    
    public PezAzul()
    {
        factor=1/8f;
        velocidad=1f;
        tasaDeGiro=125;
        isMovingUp=true;
        Imagen = new GreenfootImage("fish-30828_1280.png");
        ScaleBy(factor);
        setImage(Imagen);
    }
    
    public void act()
    {
        UpdatePosition();
    }
    
    public void UpdatePosition()
    {
        if (ran.nextInt(tasaDeGiro)==66)
        {
            ChangeDirection();
        }
        if (IsAtBottomEdge() || IsAtTopEdge())
        {
            ChangeDirection();
        }
        
        if (isMovingUp)
        {
            BetterMove(0, (int)(-2*velocidad));
        }
        else
        {
            BetterMove(0, (int)(2*velocidad));
        }
    }
    
    public void ChangeDirection()
    {
        isMovingUp=!isMovingUp;
    }
}

