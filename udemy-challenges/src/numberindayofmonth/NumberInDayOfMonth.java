package numberindayofmonth;

public class NumberInDayOfMonth
{
    /*
        Write a method isLeapYear with a parameter of type int named year.

        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

        If the parameter is not in that range return false.

        Otherwise, if it is in the valid range, calculate if the year is a leap year and return
        true if it is, otherwise return false.

        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

        NOTE:  The solution to the Leap Year coding exercise earlier in the course created the
        isLeapYear method. You can use that solution if you wish.

        Write another method getDaysInMonth with two parameters month and year. Both of type int.

        If parameter month is < 1 or > 12 return -1.

        If parameter year is < 1 or > 9999 then return -1.

        This method needs to return the number of days in the month. Be careful about leap years they
        have 29 days in month 2 (February).

        You should check if the year is a leap year using the method isLeapYear described above.
     */

    public static boolean isLeapYear(int year)
    {

        if(year < 1 || year > 9999)
        {
            return false;
        }

        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                return year % 400 == 0;
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year)
    {
        if(year < 0 || year > 9999)
        {
            return -1;
        }

        return switch(month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

//        switch(month)
//        {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                return 31;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                return 30;
//            case 2:
//                return isLeapYear(year) ? 29 : 28;
//            default:
//                return -1;
//        }
    }

    public static void main(String[] args)
    {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));


        System.out.println();
        System.out.println("*** Days of Months ***");
        System.out.println(getDaysInMonth(1, 2020)); // 31
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1




    }
}
