import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Ganti: Additional Inheritance
public class Score extends Actor 
{
    String score=new String();
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    // Ganti: Called by The Subject to Notify Observers
    public void update()
    {
      /*  score="Your Score : " + GameWorld.countg*10;
       
        GreenfootImage img = new GreenfootImage(150,100);
        img.setColor( java.awt.Color.YELLOW) ;
        img.fill();
        img.setColor( java.awt.Color.BLACK ) ;
        img.drawString(score,0,50);
       
        
        Message m = new Message(score);
        m.setImage(img);
        this.getWorld().addObject(m,75,50);*/
        
        
    }
    
     // Ganti: Score Method(Optional Implementation)
     public void showScore()
    {
        
       // System.out.println("The current score is "+GameWorld.countg*10);
    }
}