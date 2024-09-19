// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(560, 560, 1);
        showText("You lost the game!", 250, 260);
        showTextWithRedFont("You Lost", 180, 200);
    }

    /**
     * 
     */
    public void showTextWithRedFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(60);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
