import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Item
{
    public Cherry()
    {
        super(50);
        setImage("images/Cherry.png"); 
        GreenfootImage myImage = getImage();
        myImage.scale(32,32);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
