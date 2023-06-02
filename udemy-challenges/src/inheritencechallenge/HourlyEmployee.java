package inheritencechallenge;

public class HourlyEmployee extends Employee
{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyPayRate) {
        super(name, birthdate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay()
    {
        return collectPay() * 2;
    }
}
