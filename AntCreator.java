import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AntCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AntCreator extends Actor
{
    /**
     * Act - do whatever the AntCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public abstract Ant createAnt();
    long initialTime = System.currentTimeMillis(); 
   
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=1;
  
    public void act() 
    {   
        
        int x=0;
        GrassHopper grasshopper = (GrassHopper)this.getOneIntersectingObject(GrassHopper.class);
         
         move(1);      
         World world = getWorld();
         GreenfootImage bg1 = new GreenfootImage("Resized-DGIMQ.jpg");
         GreenfootImage bg2 = new GreenfootImage("Resized-LAQL8.jpg");
        if (atWorldEdge()) 
        {
            //world1.removeObject(this);
            List <AntCreator> listOfAntObjects = world.getObjects(AntCreator.class);
            int len_ant = listOfAntObjects.size();
            world.removeObjects(world.getObjects(AntCreator.class));
            if(count==1){
                world.setBackground(bg1);
                count--;
            }
                else{
                world.setBackground(bg2);
               
                }
            
            if(world.getBackground()==bg2){
            world.addObject(new AntHill(),314,438);
            
            //Greenfoot.stop();}
            
        
            }    
            if(len_ant>0)
            {
              
               
               for(int i=len_ant-1; i>=0; i--){
                world.addObject(listOfAntObjects.get(i),130+x,468);
                x=x+50;
               
                }
       
                    
              
            }
            
    
        } 
   
        if(grasshopper!=null )
        { 
            //getWorld().removeObject(grasshopper);
           // World world = getWorld();
            world.removeObject(this); 
            world.removeObject(grasshopper);
            
            List <AntCreator> listOfAntObjects = world.getObjects(AntCreator.class);
            int len_ant = listOfAntObjects.size();
            if (len_ant > 0 )
            {
                world.addObject(new GrassHopper(), 596, 37);    
            }
            else if(len_ant == 0)
            {
                /*
                world.addObject(new AntHill(),314,438);
                world.addObject(new Ant(),289,428);
                world.addObject(new Ant(),240,448);
                world.addObject(new Ant(),193,463);
                */
             
                world.addObject(new Message("Game Over!!! Sorry u lost"),520,172);
                Greenfoot.stop();
            }
           
        }
        
   /*   Actor gh;
      gh = getOneObjectAtOffset(0,0,GrassHopper.class);
      if (gh!=null)
      {
          World wld = getWorld();
          wld.removeObject(gh);
      } */
    }
    public boolean atWorldEdge()
    {
        if(getX() < 10|| getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
             return false;
            }
        }
 

        
        // Add your action code here.    

