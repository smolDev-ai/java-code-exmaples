package inheritencechallenge;

public class SalariedEmployee extends Employee
{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hiredate, double annualSalary, boolean isRetired)
    {
        super(name, birthdate, hiredate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        double payCheck = (annualSalary / 12) / 2;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return adjustedPay;
    }

    public void retire()
    {
        terminate("01/22/2023");
        this.isRetired = true;
    }
}
