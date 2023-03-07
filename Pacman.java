import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
   private static final int COUNT_DOWN_START_VALUE = 10;
    private int mouthDelay = COUNT_DOWN_START_VALUE;
    
    private static final int OFFSET = 5;
    
    private static final int DIRECTION_RIGHT = 0;
    private static final int DIRECTION_LEFT = 1;
    private static final int DIRECTION_UP = 2;
    private static final int DIRECTION_DOWN = 3;
    
    
    private String [][]images;
    private int imageIndex;
    private int direction = DIRECTION_RIGHT;
    
    private int score;
    
    private int x;
    private int y;      
    
    public Pacman()
    {
        prepareImage();
        
        setImage(images[DIRECTION_RIGHT][0]);
        GreenfootImage myImage = getImage();
        myImage.scale(64,64);
    }
    
    public void act()
    {
        scoreHud();
        
        checkScore();
        
        movePacman();
        
        handleKeys();
        
        animations();
        
        stopAtWalls();
    }
    
    public void stopAtWalls()
    {
        if(getOneIntersectingObject(Wall.class)!=null)
        {
            setLocation(x,y);
        }
        else
        {
            x = getX();
            y = getY();
        }
    }
    
    private void checkScore()
    {
        Item item = (Item)this.getOneIntersectingObject(Item.class);
        
        if(item != null){
            score += item.getPoints();
            this.getWorld().removeObject(item);
        }
    }
    
    private void scoreHud()
    {
        World world = getWorld();
        
        world.showText("Score: " + score, 515, 15);
    }
    
    private void prepareImage()
    {
        images = new String[4][];
        
       images[DIRECTION_RIGHT] = new String[]{
            "images/pacman-close.png",
            "images/pacman-open.png"
        };
        
        images[DIRECTION_LEFT] = new String[]{
            "images/pacman-close-left.png",
            "images/pacman-open-left.png"
        };
        
        images[DIRECTION_UP] = new String[]{
            "images/pacman-close-up.png",
            "images/pacman-open-up.png"
        };
        
        images[DIRECTION_DOWN] = new String[]{
            "images/pacman-close-down.png",
            "images/pacman-open-down.png"
        };
    }
    
    private void handleKeys()
    {
        if(Greenfoot.isKeyDown("left")){
            direction = DIRECTION_LEFT;
        }else if(Greenfoot.isKeyDown("right")){
            direction = DIRECTION_RIGHT;
        }else if(Greenfoot.isKeyDown("up")){
            direction = DIRECTION_UP;
        }else if(Greenfoot.isKeyDown("down")){
            direction = DIRECTION_DOWN;
        }
    }
    
    private void animations()
    {
      mouthDelay--;
        if(mouthDelay == 0){
           imageIndex = (imageIndex + 1) % images[direction].length;
           setImage(images[direction][imageIndex]);
           GreenfootImage myImage = getImage();
           myImage.scale(64,64);
           mouthDelay = COUNT_DOWN_START_VALUE;
        }  
    }
    
    private void movePacman()
    {
        switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                break;
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                break;
            case DIRECTION_UP:
                setLocation(getX(), getY() - OFFSET);
                break;
            case DIRECTION_DOWN:
                setLocation(getX(), getY() + OFFSET);
                break;
        }
    }
}
