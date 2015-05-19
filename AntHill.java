import greenfoot.*; 
import java.util.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AntHill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AntHill extends Actor
{ 
    /**
     * Act - do whatever the AntHill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    
    public void act() 
    {   stop();
           
        // Add your action code here.
    }    
    
    public void stop(){
    AntCreator ant = (AntCreator)this.getOneIntersectingObject(AntCreator.class);
       World world = getWorld();
    
        
        if(ant!=null){
                world.removeObject(ant);
                world.addObject(new Message("Game Over!!!  You Win"),520,172);
               // Greenfoot.setWorld(new GameOver(scoreboard.update()));
        }
      
    }
}
