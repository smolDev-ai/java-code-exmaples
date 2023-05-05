package hashset;

import java.util.ArrayList;   // ArrayList needed for sorting requires this import
import java.util.HashSet;     // HashSet requires this import
import java.util.Iterator;    // Iterator needing for looping through the HashSet requires this import
import java.util.List;        // List needed for sorting requires this import
import java.util.Set;         // Set requires this import
import java.util.Collections; // needed to sort the ArrayList


public class Main {
    public static void main(String[] args) {
        // Declare a Set called H with String elements
        // and initialize it as a HashSet with String elements.
        // The String element type for initialization, the one on the right of the equals sign
        // can be inferred from the String element type for the declaration, the one on the left.
        // So instead of saying
        // Set<String> h = new HashSet<String>();
        // we say
        Set<String> h = new HashSet<>();

         // Add elements to HashSet using add()
        h.add("Lehi");
        h.add("Seattle");
        h.add("San Francisco");
        h.add("Austin");
        h.add("Denver");
        h.add("Raleigh");
        h.add("New York City");
        h.add("Austin"); // trying to add a duplicate just gets ignored

         // Displaying the HashSet. Note that putting the \n at the start of our string to display
        // says to first display a blank line and then display our text. So the following is the same as
        // System.out.println();
        // System.out.prtinln("*** The HashSet ***")
        System.out.println("\n*** The HashSet ***");
        System.out.println(h);

        // Determine if the HashSet contains a certain value use the contains()
        System.out.println("\nHashSet contains Raleigh or not: " + h.contains("Raleigh"));

        // Since HashSets do not have a fixed size, we must calculate its size using the method size();
        System.out.println("\nSize of the HastSet: " + h.size());

          // Remove items from a HashSet remove()
        // The items is not in the HashSet, the remove gets ignored
        h.remove("Seattle");
        h.remove("Portland");
        System.out.println("\nHashSet with one Removed");

        // Print iterating over the HashSet. This allows you to interact with each element
        // in the HashSet. Here we just print it but you could do other statements as well!
        // Notice the Iterator we create contains the same element type as the HashSet
        // DO NOT change the HashSet during the loop. This can cause issues!
        Iterator<String> i = h.iterator();
        // while there is still another element
        while (i.hasNext())
        {
            // Read the next available element in the HashSet and advance the loop one element
            // Since temp is being declare in the body of this while loop, temp is only in scope
            // during the execution of the body of the while loop. Each time the while loop
            // executes the body, temp has be recreated
            String temp = i.next();
            System.out.println(temp);
        }

        // To sort a HashSet, first convert it to an ArrayList and then sort the ArrayList.
        // This does not change the actual HashSet
        // The ArrayList constructor can take a parameter of type set!
        List<String> hlist = new ArrayList<>(h);

        System.out.println("\nThe Sorted HashSet");
        Collections.sort(hlist);
        System.out.println(hlist);

        // To clear the HashSet use clear()
        // Java would automatically free up the memory allotted to the HashSet when the HashSet goes out of scope,
        // so at the end of this method.
        h.clear();
        System.out.println("\nThe HashSet Cleared");
        System.out.println(h);

    }    
}
