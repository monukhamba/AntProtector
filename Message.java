import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Message(String text)
    {
        GreenfootImage gi= new greenfoot.GreenfootImage(text.length()*20,30);
        Color fontColor = Color.RED;
        
        gi.setColor(fontColor);
        
        gi.drawString(text,2,20);
        setImage(gi);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
