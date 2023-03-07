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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pacman player = new Pacman();
        addObject(player,100,100);
        addObject(new Wall(),265,100);
        addObject(new Wall(),233,100);
        addObject(new Wall(),201,100);
        addObject(new Wall(),265,132);
        addObject(new Wall(),265,164);
        addObject(new Wall(),297,164);
        addObject(new Wall(),329,164);
        addObject(new Wall(),361,164);
        addObject(new Wall(),393,164);
        addObject(new Wall(),425,164);
        addObject(new Wall(),457,164);
        addObject(new Wall(),457,132);
        addObject(new Wall(),457,100);
        addObject(new Wall(),457,68);
        addObject(new Wall(),457,36);
        addObject(new Wall(),457,4);
        addObject(new Apple(),382,100);
        addObject(new Common(),400,300);
        addObject(new Cherry(),500,90);
        addObject(new Ghost(),75,324);
        addObject(new Ghost(),495,50);
    }
}
