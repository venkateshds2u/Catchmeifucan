/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player  
{
    // instance variables - replace the example below with your own
    private static Player instance = null;

    private String name;
    private int totalScore;

    private Player(String n)
    {
        name=n;
    }

    public static Player getInstance(String n) {
        if(instance == null) {
            instance = new Player(n);
        }

        return instance;
    }

    public int getScore()
    {
        // put your code here
        return totalScore;
    }

    public String getName()
    {
        return name;
    }

    public void addToScore(int score){
        totalScore+=score;
    }
}