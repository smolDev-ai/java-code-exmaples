package workingdates;
// we need to import two libraries
// java.util.* - to work with dates
// java.text.* - to format date output
import java.util.*;
import java.text.*;
public class Main
{
    // We create a format to use when displaying dates
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy hh:mm:ss a z Z");
    
    // We create a simplier format to use when creating dates from strings.
    private static SimpleDateFormat date2Format = new SimpleDateFormat("MMM dd yyyy hh:mm:ss");
    // We have added throws Exception to our normal method header
    // We are telling Java that a method inside our main method, in this case the parse method,
    // can "throw" an exception, can disrupt the normal flow of our code.
    // We are telling Java we know that can happen and that is okay with us!
    // The program does not compile without this addition
    // We often have to tell Java that we know something might happen and we are okay with it!
    public static void main(String args[]) throws Exception
    {
        // let's create a an object of type Date.
        // The default constructor for Date initializes the object to the current date and time.
        Date myDate = new Date();
        System.out.println(dateFormat.format(myDate));

        // let's set a date to a certain date. Notice we use the parse method to say how to parse, convert, a given string// If the parsing of the string fails, Java "throws" an exception. We tell Java we know this in the method's header.
        Date thisDate = date2Format.parse("MAR 14 3141 03:14:15");
        System.out.println(dateFormat.format(thisDate));

        // Now let's add to the date.
        // First create a Calendar object. The constructors for Calendar are protected in the library so we cannot use them// Instead we invoke the method getInstance to create a Calendar.
        Calendar c = Calendar.getInstance();
        // set the date of that calendar object to the date we are starting with
        c.setTime(thisDate);
        // now add 1 day to the calendar object
        c.add(Calendar.DATE, 1);
        // now convert that calendar object back to a date object
        thisDate = c.getTime();
        System.out.println(dateFormat.format(thisDate));
    }
}