package dogs;

public class Dog 
{
    // class field
    public static String bark = "Woof";
    
    // fields
    private String breed;
    private int age;
    private String color;
    
    // default constructor
    public Dog()
    {
    }
    
    // constructor with a limited initial state
    public Dog(String color)
    {
        this.breed = "mutt";
        this.age = 1;
        this.color = color;
    }
    
    // constructor with initial state
    public Dog(String breed, int age, String color)
    {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Reads State. Accessors (getters)
    public String getBreed()
    {
        return breed;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Change State. Mutators (setters)
    public void setBreed (String breed)
    {
        this.breed = breed;
    }
    
    public void setAge (int age)
    {
        this.age = age;
    }
    
    public void setColor (String color)
    {
        this.color = color;
    }
    
    // Other methods
    public void sleep (int minutes)
    {
        System.out.println("ZZZ " + minutes);
    }    
}
