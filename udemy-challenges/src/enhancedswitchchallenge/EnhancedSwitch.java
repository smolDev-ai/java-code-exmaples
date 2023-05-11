package enhancedswitchchallenge;

public class EnhancedSwitch
{

    public static void printDayOfTheWeek(int day)
    {
        String dayOfTheWeek = switch(day)
        {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("The day of the week is: " + dayOfTheWeek);
        System.out.println("The day passed was: " + day);
    }

    public static void printWeekDay(int day)
    {
        String dayOfTheWeek;
        if(day == 0)
        {
            dayOfTheWeek = "Sunday";
        } else if(day == 1)
        {
            dayOfTheWeek = "Monday";
        } else if(day == 2)
        {
            dayOfTheWeek = "Tuesday";
        } else if(day == 3)
        {
            dayOfTheWeek = "Wednesday";
        } else if(day == 4)
        {
            dayOfTheWeek = "Thursday";
        } else if(day == 5)
        {
            dayOfTheWeek = "Friday";
        } else if(day == 6)
        {
            dayOfTheWeek = "Saturday";
        } else
        {
            dayOfTheWeek = "Invalid Day";
        }
        ;
        System.out.println("The day of the week is: " + dayOfTheWeek);
        System.out.println("The day passed was: " + day);

    }
    public static void main(String[] args)
    {
         /*
            STEP 1: Create a method called PrintDayOfWeek that takes an int parameter called day, but
            doesn't return any values
            STEP 2: Use the enhanced switch statement to return the name of the day based on
            the parameter passed to the switch statement so that 0 returns Sunday, 1 returns Monday,
            and so on any number not between 0 and 6 should return "Invalid Day"
            STEP 3: Use the enhanced switch statement as an expression returning the result to a string
            named dayOfTheWeek
            Step 4: Print both the day variable and the dayOfTheWeek variable
            STEP 5: Call this method in the main method with the numbers 0-7
            BONUS: Create a new method called printWeekDay that uses an if/else chain instead of
            a switch statement

          */

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        System.out.println();
        System.out.println("*** IF Statement version ***");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }
}
