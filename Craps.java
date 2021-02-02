
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void playGame()
    {
        
    }
    
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("--CRAPS--");
        System.out.println("Would you like to play craps (y/n)? ");
        String dec = in.nextLine();
        while (dec.equals("y"))
        {
            playGame();
            System.out.println("Would you like to play again (y/n)? ");
            dec = in.nextLine();
        }
    }

}
