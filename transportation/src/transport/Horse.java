package transport;

// you can also do public class Horse extends AbstractVehicle implements Animal, Vehicle
public class Horse implements Animal, Vehicle 
{
    private int fuel = 0;
    private String name;
    
    public Horse(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void move()
    {
        fuel--;
    }

    @Override
    public void eat(int item)
    {
        fuel += item;
    }
    
    @Override
    public String speak()
    {
        return "Neigh";
    }
    
    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public int getFuelLevel()
    {
        return fuel;
    }

    @Override
    public void addFuel(int amount)
    {
        eat(amount);
    }    
}
