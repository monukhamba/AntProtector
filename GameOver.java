import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends KinectWorld
{
    public Score scoreboard = new Score();
    public GameOver(int score) //<-- Here's the error
    {    
       //super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        //GameOverText gameovertext = new GameOverText();
        //addObject(gameovertext, 300, 100);
        //Back back = new Back();
        //addObject(back, 307, 360);
        Play playagain = new Play();
        addObject(playagain, 307, 200);
       
        addObject(scoreboard, 29, 15);
        scoreboard.update();
    }
}


