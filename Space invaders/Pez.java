import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

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
    
    boolean isMovingUp;
    int tasaDeGiro;
    
    public Pez(float factor, float velocidad, int tasaDeGiro, String Image)
    {
        this.factor=factor;
        this.velocidad=velocidad;
        this.tasaDeGiro=tasaDeGiro;
        isMovingUp=true;
        Imagen = new GreenfootImage(Image);
        ScaleBy(factor);
        setImage(Imagen);
    }
    
    public void act()
    {
          UpdatePosition();
    }
    
    public void UpdatePosition()
    {
        Random ran = new Random();
        if (ran.nextInt(tasaDeGiro)==15)
        {
            ChangeDirection();
        }
        
        if (IsAtBottomEdge() || IsAtTopEdge())
            {
                ChangeDirection();
            }
        
        if (isMovingUp)
            {
                BetterMove(0, (int)(2*velocidad));
            }
        else
            {
                BetterMove(0, (int)(-2*velocidad));
            }
    }
    
    public void ChangeDirection()
    {
        isMovingUp=!isMovingUp;
    }
    
    public static Pez PezAzul()
    {
        Random ran = new Random();
        return new Pez(1/8f,ran.nextFloat(3f,4f),40,"fish-30828_1280.png");
    }
    
    public static Pez PezRojo()
    {
        Random ran = new Random();
        return new Pez(1/4f,ran.nextFloat(2f,3f),50,"fish-3410329_640.png");
    }
    
    
}