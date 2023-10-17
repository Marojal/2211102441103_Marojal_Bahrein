import greenfoot.*;

public class MyWorld extends World
{
    private static final int MAX_ROCKETS = 2;
    private static final int MAX_ANTS = 2;
    private static final int MAX_BUGS = 2;

    public MyWorld()
    {    
        super(800, 400, 1); 
        addObject(new FlappyBird(), 100, getHeight() / 2);
        prepare();
    }

    public void act()
    {
        int rocketCount = getObjects(Rocket.class).size();
        int antCount = getObjects(Ant.class).size();
        int bugsCount = getObjects(Bugs.class).size();

        if (Greenfoot.getRandomNumber(100) < 2 && rocketCount < MAX_ROCKETS)
        {
            addObject(new Rocket(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }

        if (Greenfoot.getRandomNumber(100) < 2 && antCount < MAX_ANTS)
        {
            addObject(new Ant(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.getRandomNumber(100) < 2 && bugsCount < MAX_BUGS)
        {
            addObject(new Bugs(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    private void prepare()
    {
    }
}
