package whilechallenge;

public class WhileChallenge
{
    /*
           STEP 1: Create a method named isEvenNumber that takes a parameter of type int
           STEP 2: Return true from the method if the number is even, false if it's not
           STEP 3: Use a while loop to test a range of numbers from 5 to 20, but printing out
           only the even numbers determined by the isEvenNumber method

     */

    public static boolean isEvenNumber(int number)
    {
        return number % 2 == 0;
    }

    public static void main(String[] args)
    {
        int range = 5;
        while(range <= 20)
        {
            if(isEvenNumber(range))
            {
                System.out.println(range + " is even");
            }

            range++;
        }
    }
}
