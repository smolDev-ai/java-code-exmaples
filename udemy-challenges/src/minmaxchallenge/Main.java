package minmaxchallenge;

import java.util.Scanner;

public class Main
{
    /*
        endless loop that:
        - Prompts user for a number, or a character to quit
        - validates if the user entered a number or a letter
        - if data entered is not a number, exit the loop
        - keep track of the minimum number entered
        - keep track of the maximum number entered
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        while(true)
        {
            System.out.println("Enter a number: ");
            String number = scanner.nextLine();
            try
            {
                int num = Integer.parseInt(number);
                if(min == 0 && max == 0)
                {
                    min = num;
                    max = num;
                } else if(num > max)
                {
                    max = num;
                } else if(num < max && num < min)
                {
                    min = num;
                }

                System.out.println("Min: " + min + " Max: " + max);
            } catch(NumberFormatException nfe)
            {
                System.out.println("You did not enter a number");
                break;
            }
        }
    }
}
