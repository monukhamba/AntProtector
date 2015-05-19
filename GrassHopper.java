import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrassHopper extends Actor
{
    private boolean selected;
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       /* PaintWorld world = (PaintWorld)getWorld();

        UserData[] users = world.getTrackedUsers();
        for (UserData user : users)
        { 
            
        }*/
        
        move
        (2);
        List <AntCreator> listOfAntObjects = getWorld().getObjects(AntCreator.class);
        List <GrassHopper> listOfGrassHopperObjects = getWorld().getObjects(GrassHopper.class);
        int len_ant = listOfAntObjects.size();
        int len_gh = listOfGrassHopperObjects.size();
        if (len_ant > 0 )
        {
           AntCreator ant = listOfAntObjects.get(len_ant-1);
           int x = ant.getX();
           int y = ant.getY();
           turnTowards(x , y);
           move(2);
           enterGame();
          
            
        }
        else {
           
        remGh();
                }
        
        }
        
       
    
    
    public void remGh()
    {
       List <AntCreator> listOfAntObjects = getWorld().getObjects(AntCreator.class);
        List <GrassHopper> listOfGrassHopperObjects = getWorld().getObjects(GrassHopper.class);
        int len_ant = listOfAntObjects.size();
        int len_gh = listOfGrassHopperObjects.size();
     
              if(len_gh>0 && len_ant==0){
                 if (atWorldEdge()) {
            getWorld().removeObject(this);
        } 
        }}
        
             public boolean atWorldEdge()
    {
        if(getX() < 10|| getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
             return false;
            }
   
    public void enterGame()  
    {  
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) {  
            int clicked = info.getButton();  
            if(Greenfoot.mouseClicked(this) && clicked==1) {  
                World world = getWorld();
                world.removeObject(this);
                world.addObject(new GrassHopper(),596,37);
               // getWorld().removeObject(this);
                
                  
            }  
        } 
}}
