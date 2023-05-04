package workingstrings;

// import is needed for converting doubles into something readable
import java.text.DecimalFormat;

public class Main 
{
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public static void main(String[] args) 
    {
        // Let's setup a string for work with
        // Our index then is
        // 111
        // 0123456789012
        String myStr = "Lambda School";
        
        // return the first character in the string myStr
        myStr.charAt(0);
        
        // notice that myStr has not changed!
        System.out.println(myStr); // displays Lambda School
        
        // now display the first character in the string myStr
        System.out.println(myStr.charAt(0)); // displays L
        
        // display the 5 character in myStr
        System.out.println(myStr.charAt(5)); // displays a
        
        // display the 100 character in myStr
        // System.out.println(myStr.charAt(100)); // we get a run time error saying 
        // index is out of bounds!
        // find the substring in myStr beginning at index 5 and ending at index 8
        String strResult = myStr.substring(5, 8);
        System.out.println(strResult); // displays a S

        // display the length of myStr
        System.out.println(myStr.length()); // displays 13
        
        // add your instructor's name to myStr
        strResult = myStr + "John";
        System.out.println(strResult); // displays Lambda SchoolJohn
        
        // return myStr in lowercase
        strResult = myStr.toLowerCase();
        System.out.println(strResult); // displays lambda school
        
        // return myStr in uppercase
        strResult = myStr.toUpperCase();
        System.out.println(strResult); // displays LAMBDA SCHOOL
        
        // When displaying, convert the given double to the format specified earlier when df was created.
        // the use of DecimalFormat in this way always us to display doubles the same way each time!
        double myDouble = 123134556.7890;
        strResult = df.format(myDouble);
        System.out.println(strResult); // displays $123,134,556.79
        
        myDouble = .3;
        strResult = df.format(myDouble);
        System.out.println(strResult); // displays $0.30    
        
    }
}