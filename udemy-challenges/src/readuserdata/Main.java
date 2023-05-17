package readuserdata;

import java.util.Scanner;

public class Main
{

    /*
        Read 5 valid numbers from a user and add them together
        If numbers are not valid integers, print "Invalid number"

     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while(i < 5)
        {
            i++;
            System.out.print("Enter Number #" + i + ": ");
            String nextNumber = scanner.nextLine();
            try {
                sum += Integer.parseInt(nextNumber);
            } catch(NumberFormatException badData)
            {
                System.out.println("Invalid number");
                i -= 1;
            }
        }

        System.out.println(sum);
    }

}

