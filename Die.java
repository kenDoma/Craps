
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int dieRoll;
    
    public Die()
    {
        dieRoll = 0;
    }
    
    public void rollDie()
    {
        dieRoll = (int) (Math.random()*6+1);
    }
    
    public int getRoll()
    {
        return dieRoll;
    }
}
