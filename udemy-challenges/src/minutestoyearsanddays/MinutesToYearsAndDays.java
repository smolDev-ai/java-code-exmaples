package minutestoyearsanddays;

public class MinutesToYearsAndDays
{
    /*
    Write a method printYearsAndDays with parameter of type long named minutes.

    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

    If the parameter is less than 0, print text "Invalid Value".

    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

    XX represents the original value minutes.
    YY represents the calculated years.
    ZZ represents the calculated days.

    Use the remainder operator

    1 hour = 60 minutes

    1 day = 24 hours

    1 year = 365 days

    */

    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + ((minutes / 60) / 24) / 365 + " y and " + ((minutes / 60) / 24) % 365 + " d");
        }
    }

    public static void main(String[] args)
    {
        printYearsAndDays(561600);
    }
}
