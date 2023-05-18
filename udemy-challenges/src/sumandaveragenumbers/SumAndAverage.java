package sumandaveragenumbers;

import java.util.Scanner;

public class SumAndAverage
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long avg = 0;
        while(true)
        {
            String num = scanner.nextLine();
            try
            {
                sum += Integer.parseInt(num);
                count++;
                avg = Math.round((double) sum / count);
            } catch(NumberFormatException nfe)
            {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        inputThenPrintSumAndAverage();
    }
}
