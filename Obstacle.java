import greenfoot.*;

public class Obstacle extends Actor
{
    private boolean isalive = true;
    
    public void act()
    {
        move();
    }

    private void move()
    {
        setLocation(getX() - 2, getY()); 
        
        if (getX() < 0)
        {
            getWorld().removeObject(this);
        }
    }
}
