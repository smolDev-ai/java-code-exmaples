package hashmap;

import java.util.ArrayList;  // ArrayList needed for sorting requires this import
import java.util.Comparator; // When we sort, we use Comparator which requires this import
import java.util.HashMap;    // HashMap requires this import
import java.util.List;       // List needed for sorting requires this import
import java.util.Map;        // Map requires this import

public class Main 
{
    public static void main(String[] args) 
    {
        // Declare a Map called cities with
        // keys being Strings, values being Integers
        // and initialize it as a HashMap with keys as Strings values as Integers
        // The String, Integer type for initialization, the one on the right of the equals sign
        // can be inferred from the String, Integer for the declaration, the one on the left.
        // So instead of saying
        // Map<String, Integer> cities = new HashMap<String, Integer>();
        // we can say
        Map<String, Integer> cities = new HashMap<>();
        
        // put new key, value pairs into the HashMap
        cities.put("Lehi", 62712);
        cities.put("Seattle", 724745);
        cities.put("San Francisco", 884363);
        cities.put("Austin", 1000000);
        cities.put("Denver",  619968);
        cities.put("Raleigh", 464758);
        cities.put("New York City", 8623000);

        // putting a key that already exists in the HashMap causes the value associated
        // with that key to be replaced with the new sent value!
        cities.put("Austin", 950715);

        // Displaying the HashMap. Note that putting the \n at the start of our string to display
        // says to first display a blank line and then display our text. So the following is the same as
        // System.out.println();
        // System.out.prtinln("*** The HashMap ***")
        System.out.println("\n*** The HashMap ***");
        System.out.println(cities);

        // Determine if the HashMap contains a certain key use containsKey()
        System.out.println("\nHashMap contains Raleigh as a key: " + cities.containsKey("Raleigh"));
        // Determine if the HashMap contains a certain value use containsValue()
        System.out.println("HashMap contains the value 1000000: " + cities.containsValue(1000000));

        // Since HashMaps do not have a fixed size, we must calculate its size using the method size();
        System.out.println("\nSize of the HashMap is " + cities.size());

        // Remove the item from the HashMap based off of a key
        // use remove();
        cities.remove("Seattle");
        cities.remove("Portland"); // Since Portland is not a key, does nothing

        System.out.println("\nHashMap with one Removed");

        // Using a For Each loop, print the key, value pairs in the HashMap
        // We are looping through the entries, elements, in the HashMaps
        // These Entries are part of a set called entrySet
        // Each entry is composed of a key and a value, in our case a String and an Integer
        // HashMap.Entry can determine what key and value data types it needs from the HashMap
        // we are looping through
        for(HashMap.Entry mapElm : cities.entrySet())
        {
            // print() says do not start the next line on a new line
            // so no return at the end of this print statement.
            System.out.print("Key is " + mapElm.getKey());
            System.out.println("   Value is " + mapElm.getValue());
        }

        // Sorting a HashMap directly is not possible.
        // First we must put the data into an ArrayList and then sort the ArrayList
        // We also have to decide whether we want the HashMap sorted by key or by value
        // Let's sort by key first
        // HashMap.Entry can determine the key and value data types from the HashMap we are converting to the ArrayList
        // the Constructor for an ArrayList can take a set as a parameter!
        List<HashMap.Entry> myList = new ArrayList<>(cities.entrySet());

        // To sort by the keys, use the ArrayList sort method which takes a method
        // Comparator.comparing, which takes argument of what to sort!
        myList.sort(Comparator.comparing(item -> item.getKey().toString()));

        System.out.println("\nSorted by Key");
        System.out.println(myList);

        // To sort by the value, use the ArrayList sort method which takes a method
        // Comparator.comparing, which takes arguments of what to sort and
        // the optional argument saying to sort in descending order!
        myList.sort(Comparator.comparing(item -> (int) item.getValue(), Comparator.reverseOrder()));

        System.out.println("\nSort by Value");
        System.out.println(myList);

        // To clear the HashMap use clear()
        // Java would automatically free up the memory allotted to the HashMap when the HashMap goes out of scope,
        // so at the end of this method.
        myList.clear();
        System.out.println("\nThe HashMap Cleared");
        System.out.println(myList);

    }    
}
