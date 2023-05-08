package decimalcomparator;

public class DecimalComparator
{
    /*


    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

    The method should return boolean, and it needs to return true if two double numbers are
    the same up to three decimal places. Otherwise, return false.

     */

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        int a1 = (int) num1;
        int a2 = (int) num2;

        return a1 == a2;
    }

    public static void main(String[] args)
    {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
    }
}
