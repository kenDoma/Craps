
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static int winOrLose(int out1, int out2, int round, int point)
    {
        System.out.println("Your first roll was " + out1);
        System.out.println("Your second roll was " + out2);
        int sum = out1+out2;
        System.out.println("Your total roll was " + sum);
        if (round == 1)
        {
            if (sum == 7 || sum == 11)
            {
                System.out.println("YOU WON!!!");
                return 1;
            }
            
            else if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("You lost!");
                return 2;
            }
            
            else
            {
                return 0;
            }
        }
        else
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
    
    public static void playGame()
    {
        int rollNumber = 1;
        Scanner in  = new Scanner(System.in);
        System.out.println("Press <Enter to roll 2 dice>");
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
            rollNumber++;
            System.out.println("Press <Enter to roll 2 dice>");
            cont = in.nextLine();
            die1.rollDie();
            die2.rollDie();
            out1 = die1.getRoll();
            out2 = die2.getRoll();
            winner = winOrLose(out1,out2,rollNumber,sum);
        }
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
            System.out.println();
            System.out.println("Would you like to play again (y/n)? ");
            dec = in.nextLine();
        }
    }

}
