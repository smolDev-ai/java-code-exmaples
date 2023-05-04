package abstraction;

public class Pig extends Animal 
{
    // Pig must give the implementation for animalSound
    // the rest of the methods can be used directly
    @Override 
    void animalSound()
    {
        System.out.println("Oink Oink");
    }
}
