import greenfoot.*;

public class Ant extends Obstacle
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        super.act();
        moveAnt();
    }

    private void move()
    {
        setLocation(getX() - 2, getY());
        
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }

    private void moveAnt()
    {
    
    }
}
