package transport;

public class HorseFromAbstractVehicle extends AbstractVehicle 
{
    private String name;
    
    public HorseFromAbstractVehicle(String name, int fuel)
    {
        super(fuel); // calls the parent, to set the fuel field.
        this.name = name;
    }

    public HorseFromAbstractVehicle(String name)
    {
        // this constructor will call the default constructor of the parent
        // so, fuel = 1
        this.name = name;
    }

    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Horse: " + name + " fuel: " + fuel;
    }

}
