import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackAntCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackAntCreator extends AntCreator
{
    /**
     * Act - do whatever the BlackAntCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public Ant createAnt() 
    {
       return new BlackAnt();
        // Add your action code here.
    }    
}
