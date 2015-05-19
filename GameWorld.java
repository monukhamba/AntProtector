import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class PaintingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends KinectWorld
{
    private int timer = 3600;
    long initialTime = System.currentTimeMillis();  
    //scroll
    
    private static final GreenfootImage bgImage = 
                            new GreenfootImage("F:/chan/chan/202 chand/AntProtector/images/backnew.jpg");
   
   
  

    
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;

    private long leftHandUp;
    private Label leftHandWarning;
  
       
    public GameWorld()
    {    
       
       
       
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);

        final int width = getWidth();
        final int height = getHeight();
             
        setBackground(bgImage);

        addObject(new Instructions(), width/2, height/2);
        addObject(new Thumbnail(), width - THUMBNAIL_WIDTH/2, height - THUMBNAIL_HEIGHT/2);
        addObject(new GrassHopper(), 596, 37);
        addObject (new Score(), 0, 370); 
        Label instr = new Label("Use your right hand to paint, raise left hand to clear.", 20);
        addObject(instr, instr.getImage().getWidth() / 2, getBackground().getHeight() - (instr.getImage().getHeight() / 2));

        prepare();
             
    }

    public void act()
    {
        super.act();
        
        AntCreator ac1 = new BlackAntCreator();
        AntCreator ac2 = new RedAntCreator();
        if (timer>0)
        {
            timer--;
            if(timer == 0) 
            {
                List remObj = getObjects(Actor.class);
                if (remObj!=null)
                {
                    for (Object objects : remObj)
                    removeObject( ( Actor ) objects );
                    addObject(new AntHill(),314,438);
                   // addObject(new BlackAntCreator(),289,428);
                    //addObject(new BlackAntCreator(),240,448);
                   // addObject(new RedAntCreator(),238,463);
                    addObject(new Message("YOU WIN!!!"),520,172);
                }
                Greenfoot.stop();
            }
        }
        
        if (!isConnected())
            return;
       
       

        UserData[] us = getTrackedUsers();
        getBackground().setColor(java.awt.Color.WHITE);
        getBackground().fill();

        boolean anyLeftHandUp = false;

        /* for (UserData u: us)
        {
        //Draws their stick figure:
        u.drawStickFigure(getBackground(), 60);

        anyLeftHandUp = anyLeftHandUp || (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY());
        }*/

        // This is extra code used to warn the user if any of them is keeping their
        // left hand in the air, which effectively prevents any painting because
        // the brush will be cleared every frame:        
        if (anyLeftHandUp)
        {
            if (leftHandUp == -1)
            {
                leftHandUp = System.currentTimeMillis();
            }
            else
            {
                if (System.currentTimeMillis() - leftHandUp > 5000 && leftHandWarning == null)
                {
                    leftHandWarning = new Label("Put your left hand down to stop clearing the screen.", 40);
                    addObject(leftHandWarning, getWidth() / 2, getHeight() / 2);
                }
            }
        }
        else
        {
            leftHandUp = -1;
            if (leftHandWarning != null)
            {
                removeObject(leftHandWarning);
                leftHandWarning = null;
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        AntCreator ant = new BlackAntCreator();
        addObject(ant, 130, 468);
        AntCreator ant1 = new BlackAntCreator();
        addObject(ant1, 70, 467);
        AntCreator ant3 = new RedAntCreator();
        addObject(ant3, 21, 463);
      
    }
  
}
