package basetypes;

public class Main 
{
    public static void main(String args[]) 
    {
        // create some numbers to work with
        int a = 2;
        int b = 1;
        double ba = 11.5;

        // manipulate those numbers and output results
        // arithmetic includes (+, -, *, /)
        // the result of arithmetic on a double and an 
        // integer results in a double
        double result = ba / a;
        System.out.println(result); // displays 5.75

        // the results of arithmetic on an integer and
        // an integer results in an integer
        System.out.println(b + a); // displays 3

        // integer (/) integer results in an integer -
        // the whole number part of the answer it
        // truncates the decimal
        System.out.println(b / a); // displays 0

        // The %, modular, mod operation - returns the remainder of doing division
        // normally the % is just used on positive integers
        System.out.println(b % a); // displays 1
        // Strings
        String sa = "Lambda";
        String sb = "School";
        // yes you can add Strings!}

        String ans = sa + sb;
        System.out.println(ans); // displays LambdaSchool

        // Java also handles compound and increment operators
        a += b; // same as a = a + b
        System.out.println(a); // displays 3
        b++; // same as b = b + 1
        System.out.println(b); // displays 2


    }
}