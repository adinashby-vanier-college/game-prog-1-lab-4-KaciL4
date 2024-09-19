// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * 
     */
    public Lobster()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        addObject();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("gameOver.mp3");
        }
    }

    /**
     * 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }

    /**
     * 
     */
    public void addObject()
    {
        Actor Worm = getOneIntersectingObject(Worm.class);
        if (Worm != null) {
            World world = getWorld();
            int xLocation = Worm.getX();
            int yLocation = Worm.getY();
            Actor Lobster =  new  Lobster();
            world.removeObject(Worm);
            world.addObject(Lobster, xLocation, yLocation);
        }
    }
}
