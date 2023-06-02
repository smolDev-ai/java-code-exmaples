package inheritencechallenge;

public class Worker
{
    private String name;
    private String BirthDate;
    protected String endDate;

    public Worker(String name, String birthDate)
    {
        this.name = name;
        this.BirthDate = birthDate;
    }

    public int getAge()
    {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(BirthDate.substring(6));

        return currentYear - birthYear;
    }

    public double collectPay()
    {
        return 0.0;
    }


    public void terminate(String endDate)
    {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

}
