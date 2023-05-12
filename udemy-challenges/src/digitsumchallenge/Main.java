package digitsumchallenge;

public class Main
{
    /*
           STEP 1: Write a method called sumDigits that takes a single parameter named number
           of type int that should return an int
           STEP 2: The method should only take a positive number, if a negative number is
           passed method should return -1
           STEP 3: Method should parse each digit from the number, and sum the digits up
           EX: 125 = 1 + 2 + 5 = 8
           if number is a single digit, return the number
     */

    public static int sumDigits(int number)
    {
        // number = 125:
        // number / 10 == 12 <- gets rid of the right most digit
        // number % 10 == 5

        if(number < 0)
        {
            return -1;
        }

        int sum = 0;

        for(int i = number; i >= 1; i /= 10)
        {
            // set i to the number
            // if i is greater than or equal to 1
            // in the loop: grab the right most digit and add it to sum
            // divide i by 10 to remove the digit we just dealt
            // with in the loop

            sum += i % 10;
        }

//         *** Instructor solution ***
//         while(number > 9)
//         {
//             sum += number % 10;
//             number /= 10;
//         }
//         sum += number;
        return sum;
    }


    public static void main(String[] args)
    {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(6));
        System.out.println(sumDigits(-20));
        System.out.println(sumDigits(125));
    }
}
