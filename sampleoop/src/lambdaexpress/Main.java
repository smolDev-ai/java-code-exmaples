package lambdaexpress;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static List<Integer> filterOdds(List<Integer> myList, CheckNumber tester)
    {
        // when we call this, myList becomes numbers from the main method
        // tester becomes the lambda expression num -> ((num % 2) == 0
        // where num is some element in the ArrayList
        List<Integer> filteredList = new ArrayList<>();

        for(Integer n : myList)
        {
            // if the lambda expression returns true, add that element to the new ArrayList
            if(tester.test(n))
            {
                filteredList.add(n);
            }
        }

        return filteredList;
    }
    
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        
        // populate an ArrayList with numbers 0 - 6
        for(int i = 0; i < 7; i++)
        {
            numbers.add(i);
        }

        // Create a new ArrayList from the output of the function 
        // filterOdds with parameters our populated ArrayList
        // lambda expression that looks to see if the ArrayList 
        // element is divisible by 2
        List<Integer> toPrintList = filterOdds(numbers, num -> (num % 2 == 0));
        toPrintList.forEach(n -> System.out.println(n));
    }
}
