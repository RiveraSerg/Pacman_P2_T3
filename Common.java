import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class common here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Common extends Item
{
    public Common()
    {
        super(10);
        setImage("images/point.png"); 
        GreenfootImage myImage = getImage();
        myImage.scale(42,42);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
