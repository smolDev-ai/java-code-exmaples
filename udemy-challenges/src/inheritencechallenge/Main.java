package inheritencechallenge;

public class Main
{

    public static void main(String[] args) {
        SalariedEmployee jenn = new SalariedEmployee("Jenn", "05/23/1993", "02/22/2020", 90_000, false);
        System.out.println(jenn);
        System.out.println("Age = " + jenn.getAge());
        System.out.println("Pay = " + jenn.collectPay());
        jenn.retire();
        System.out.println(jenn.endDate);
        System.out.println("Pay or Pension = " + jenn.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "02/22/1992", "03/03/2020", 57.40);
        System.out.println(mary);
        System.out.println(mary.getAge());
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());


    }
}
