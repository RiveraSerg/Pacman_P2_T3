import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Item
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Apple()
    {
        super(30);
        setImage("images/manzana.png"); 
        GreenfootImage myImage = getImage();
        myImage.scale(36,36);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
