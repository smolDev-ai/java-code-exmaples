package whilechallenge;

public class WhileChallenge
{
    /*
           STEP 1: Create a method named isEvenNumber that takes a parameter of type int
           STEP 2: Return true from the method if the number is even, false if it's not
           STEP 3: Use a while loop to test a range of numbers from 5 to 20, but printing out
           only the even numbers determined by the isEvenNumber method

           *** Second part of the challenge ***

           STEP 1: Add functionality for the while loop to keep
           track of how many even and odd numbers it found
           STEP 2: Once it finds 5 even numbers
           exit the loop
           STEP 3: display total number of odd and even numbers found

     */

    public static boolean isEvenNumber(int number)
    {
        return number % 2 == 0;
    }

    public static void main(String[] args)
    {
        int range = 4;
        int oddNums = 0;
        int evenNums = 0;
        while(evenNums == 5 || range <= 20)
        {
            range++;
            if(!isEvenNumber(range))
            {
                oddNums++;
                continue;
            }

            evenNums++;
            System.out.println(range + " is even");
        }

        System.out.println("Total Even Numbers: " + evenNums);
        System.out.println("Total Odd Numbers: " + oddNums);
    }
}
