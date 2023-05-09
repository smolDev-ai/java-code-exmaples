package methodoverloadchallenge;

public class MethodOverload
{
    /*
        Write two methods with the name convertToCentimeters.
        The first method should have one parameter with a type of int which represents
        the total height of something in inches.

        Do the calculation to convert to centimeters method should return a double.

        The second method has two parameters one of type int that represents feet,
        and another that represents the remaining inches. This method will convert the
        feet to inches and then convert the inches to centimeters.

        inches to centimeters = 1 inch = 2.54cm
        feet = 12inches

     */

    public static double convertToCentimeters(int inches)
    {
        return (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches)
    {
        return (feet * 12 + inches) * 2.54;
    }

    public static void main(String[] args)
    {
        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(5, 8));
    }
}
