package interfaces;

public class Main {
    public static void main(String[] args)
    {
        Pig myPig = new Pig(); // instantiate a pig object
        Dog myDog = new Dog(); // instantiate a dog object

        myPig.animalSound();
        myPig.sleep();
        // myPig.eat() pig does not know how to eat. Poor pig

        myDog.animalSound();
        myDog.sleep();
        myDog.eat();
    }
}
