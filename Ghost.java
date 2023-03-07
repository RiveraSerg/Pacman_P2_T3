import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Item
{
    private int offsetX = 5;
    private int offsetY = 5;
    
    public Ghost()
    {
        super(-15);
        setImage("images/Ghost.png"); 
        GreenfootImage myImage = getImage();
        myImage.scale(48,48);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if(isAtEdge()){
            offsetY *= -1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
        
        if(getOneIntersectingObject(Wall.class)!=null)
        {
            offsetX *= -1;
            offsetY *= -1;
        }
    }
}
