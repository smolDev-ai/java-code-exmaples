package speedconverter;

public class SpeedConverter
{

    /*
        1. Write a method called toMilesPerHour that has 1 parameter of type double with
        the name kilometersPerHour. This method needs to return the rounded value of the
        calculation of type long.

        If the parameter kilometersPerHour is less than 0,
        the method toMilesPerHour needs to return -1 to indicate an invalid value.

        Otherwise, if it is positive, calculate the value of miles per hour,
        round it and return it. For conversion and rounding, check the notes in the text below.

        2. Write another method called printConversion with 1 parameter of type double with the
        name kilometersPerHour.

        This method should not return anything (void) and it needs to calculate
        milesPerHour from the kilometersPerHour parameter.

        Then it needs to print a message in the format "XX km/h = YY mi/h".

        XX represents the original value kilometersPerHour.
       YY represents the rounded milesPerHour from the kilometersPerHour parameter.

       If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

         */
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else
        {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }


    }

    public static void main(String[] args)
    {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
