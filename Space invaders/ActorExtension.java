import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActorExtension here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActorExtension extends Actor
{
    /**
     * Act - do whatever the ActorExtension wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage Imagen;
    
    protected void BetterMove(int x, int y)
    {
        setLocation(getX()+x, getY()+y); 
    }

    protected void ScaleBy(float factor)
    {
        int nuevaAltura = (int)((float)Imagen.getHeight()*factor);
        int nuevaAnchura = (int)((float)Imagen.getWidth()*factor);
        Imagen.scale(nuevaAnchura, nuevaAltura);
    }
}
