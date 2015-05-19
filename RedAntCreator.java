import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedAntCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedAntCreator extends AntCreator
{
    /**
     * Act - do whatever the RedAntCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RedAntCreator(){
    GreenfootImage image = getImage(); 
       image.scale(image.getWidth() - 60, image.getHeight() - 60);
     setImage(image); 
    }
    public Ant createAnt() 
    {
      return  new RedAnt();

     
    }   
}
