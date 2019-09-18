import java.util.Scanner;
import java.util.Random;

public class classwork5part5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("We are going to play guess my number. ");
        System.out.println("Put in a number from 1-100. This will be the range of numbers. ");
        double xyz = scan.nextDouble();
        
        double number = (int)(Math.random()*xyz);
        
        System.out.println("Guess: ");
        double answer = scan.nextDouble();
        
        
        if (answer == number)
        {
            System.out.println("Yes, you got it");
        }
        else if (answer != number)
        {
            System.out.println("You are wrong. Guess again.");
      
        }
        else 
        {
            System.out.println("I do not understand. Try again.");
        }
        
        
        

    }
}
