import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SinglePlayerButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SinglePlayerButton extends GameMenuComponents
{   
    /**
     * Act - do whatever the SinglePlayerButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
        }
        
        moveInAnimation();
    }

    public void moveInAnimation(){
        if(getX() < 600){
            move(20);
        }
    }
}
