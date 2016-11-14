import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private Counter actCounter;
    private int timer = 3600;
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 600, 1); 
         prepare();
         actCounter = new Counter("Hours Left: ");
        addObject(actCounter, 900, 20); 
    }
    public void act(){
        if(timer > 0){
            timer--;
        }
        else{
            Greenfoot.stop();
        }
        System.out.println("Your Score:" + timer);
    }
    public void bumpCounter()
    {
        actCounter.change();
    }

    public void prepare()
    {
        
        House[] houses = new House[20];
        houses[0]= new House();
        houses[1]= new House();
        houses[2]= new House();
        houses[3]= new House();
        houses[4]= new House();
        houses[5]= new House();
        houses[6]= new House();
        houses[7]= new House();
        houses[8]= new House();
        houses[9]= new House();
        houses[10]= new House();
        houses[11]= new House();
        houses[12]= new House();
        
        
        Tree[] trees = new Tree[10];

        trees[0]= new PineTree();
        trees[1]= new PineTree();
        trees[2]= new RimuTree();
        trees[3]= new PineTree();
        trees[4]= new PineTree();
        trees[5]= new PineTree();
        trees[6]= new PineTree();
        trees[7]= new FigTree();
        trees[8]= new FigTree();
        trees[9]= new FigTree();
    
    
    }
}
