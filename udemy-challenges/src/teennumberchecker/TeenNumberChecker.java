package teennumberchecker;

public class TeenNumberChecker
{
    /*


    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

    Write a method named hasTeen with 3 parameters of type int.

    The method should return boolean and it needs to return true if one of the
    parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    Write another method named isTeen with 1 parameter of type int.

    The method should return boolean, and it needs to return true if the parameter
    is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

     */

    public static boolean hasTeen(int num1, int num2, int num3)
    {
        int[] numbers = {num1, num2, num3};
        boolean check = false;

        for (int elem : numbers)
        {
            if (isTeen(elem)) {
                check = true;
                break;
            }
        }

        return check;
    }

    public static boolean isTeen(int num)
    {
        return num >= 13 && num <= 19;
    }

    public static void main(String[] args)
    {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println(isTeen(9)); // false
        System.out.println(isTeen(13)); // true
    }


}
