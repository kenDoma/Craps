
/**
 * Plays a craps until the player chooses to exit
 *
 * @author Dom
 * @version 02-08-21
 */
import java.util.Scanner;
public class Craps
{
    /*
     * determines if you won based on the 2 rolls, the round number, and the point
     * @param out1
     * @param out2
     * @param round
     * @param point
     */
    public static int winOrLose(int out1, int out2, int round, int point)
    {
        System.out.println("Your first roll was " + out1);
        System.out.println("Your second roll was " + out2);
        int sum = out1+out2;
        System.out.println("Your total roll was " + sum);
        if (round == 1) //tests if this is the first set of rolls
        {
            if (sum == 7 || sum == 11)
            {
                System.out.println("YOU WON!!!");
                return 1; //return 1 in win
            }
            
            else if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("You lost!");
                return 2; //return 2 if lost
            }
            
            else
            {
                return 0; //return 3 if won
            }
        }
        else //determines if you won on your 2nd+ won based on the point
        {
            System.out.println("The point is " + point);
            if (sum == point)
            {
                System.out.println("YOU WON!!!");
                return 1;
            }
            
            else if (sum == 7)
            {
                System.out.println("You lost!");
                return 2;
            }
            
            else
            {
                return 0;
            }
        }
    }
    /*
     * actions of playing the game
     * rolls 2 dice and enters those values in winOrLose
     */
    public static void playGame()
    {
        int rollNumber = 1;
        Scanner in  = new Scanner(System.in);
        System.out.println("Press <Enter> to roll 2 dice");
        String cont = in.nextLine();
        Die die1 = new Die();
        Die die2 = new Die();
        die1.rollDie();
        die2.rollDie();
        int out1 = die1.getRoll();
        int out2 = die2.getRoll();
        int sum = out1 + out2;
        int winner = winOrLose(out1,out2,rollNumber, sum);
        while (winner == 0)
        {
            rollNumber++; //counts whether or not it's the first roll
            System.out.println();
            System.out.println("Press <Enter> to roll 2 dice");
            cont = in.nextLine(); //buffer
            die1.rollDie();
            die2.rollDie();
            out1 = die1.getRoll(); //gets the rolls of 2 dice
            out2 = die2.getRoll();
            winner = winOrLose(out1,out2,rollNumber,sum);
        }
    }
    /*
     * Play the game within a loop
     */
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("--CRAPS--");
        System.out.println("Would you like to play craps (y/n)? ");
        String dec = in.nextLine();
        while (dec.equals("y")) //while playing the game
        {
            playGame();
            System.out.println();
            System.out.println("Would you like to play again (y/n)? ");
            dec = in.nextLine();
        }
    }

}
