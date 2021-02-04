
/**
 * Creates a dice which can be rolled and returned
 */
public class Die
{
    private int dieRoll;
    
    /*
     * Initialize the die roll
     */
    public Die()
    {
        dieRoll = 0;
    }
    /*
     * sets the die value to a randum number between 1 and 6
     */
    public void rollDie()
    {
        dieRoll = (int) (Math.random()*6+1);
    }
    /*
     * @return dieRoll
     */
    public int getRoll()
    {
        return dieRoll;
    }
}
