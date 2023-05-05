package transport;

abstract class AbstractVehicle 
{
    protected int fuel;

    public AbstractVehicle()
    {
        fuel = 1;
    }

    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    abstract String getPath();

    abstract String getName();


    // leaving it default lets the child dictate the accessor
    // dislike having two methods with the same name personally
    void move()
    {
        fuel--;
    }

    void move(int steps)
    {
        fuel -= steps;
    }

    int getFuelLevel()
    {
        return fuel;
    }

    void addFuel(int num)
    {
        fuel += num;
    }

}
