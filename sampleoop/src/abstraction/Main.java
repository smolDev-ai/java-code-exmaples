package abstraction;

public class Main 
{
    public static void main(String[] args) 
    {
        Pig myPig = new Pig(); // create a pig object
        myPig.animalSound();   // use the animalSound method from the abstract class defined in Pig
        myPig.sleep(); // use the sleep method from the abstract class
        System.out.println("Weight " + myPig.getWeight()); // use the getWeight method from the abstract class!
    }
}
