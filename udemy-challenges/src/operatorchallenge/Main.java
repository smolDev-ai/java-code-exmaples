package operatorchallenge;

public class Main
{
    public static void main(String[] args) 
    {

        // STEP 1: create a double with the value of 20.00
        // STEP 2: create another double with the value 80.00
        // STEP 3: add both numbers then multiply by 100.00
        // STEP 4: use the remainder (modulo) operator to figure out what the
        // remainder between step 3's answer and 40.00 is.
        // STEP 5: create a boolean that is true if step 4 is 0 or false
        // if it's not 0
        // STEP 6: output the boolean to see what the result is
        // STEP 7: write an if/then that displays the message "got some 
        // remainder" if the boolean in step 5 is false

        double num1 = 20.00;
        double num2 = 80.00;
        double num3 = (num1 + num2) * 100.00;
        
        System.out.println();
        System.out.println("\n*** 20.00 + 80.00 * 100.00 = " + num3 + " ***");

        double modnum = num3 % 40.00;
        
        System.out.println();
        System.out.println("\n*** " + num3 + " % 40.00 = " + modnum + " ***");
        
        boolean noRemainder = modnum == 0.0 ? true : false;
        
        System.out.println();
        System.out.println("\n*** Remainder does not exist: " + noRemainder + " ***");

        if(!noRemainder)
        {
            System.out.println("got some remainder");
        }

        
        
    }
}