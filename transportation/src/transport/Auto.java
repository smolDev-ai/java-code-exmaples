package transport;

public class Auto extends AbstractVehicle 
{
    private String model;
    private int year;

    public Auto(int fuel, String model, int year)
    {
        super(fuel);
        this.model = model;
        this.year = year;
    }
    
    // this is technically a different constructor because we start with a string
    // public Auto(String model, int fuel, int year)
    // {

    // }

    @Override
    public String getPath()
    {
        return "Road";
    }

    @Override
    public String getName()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int newYear)
    {
        this.year = newYear;
    }

    @Override
    public String toString()
    {
        return "Auto: " + model + " year: " + year + " fuel: " + fuel;
    }

}
