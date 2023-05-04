package employeeApp;

/* 
 * Employees
 *      Companies
 *      Health Plan
 */

public class Main 
{
    private static void workWithData() {
        System.out.println("Welcome to Java!");

        Healthplan h1 = new Healthplan("My Healthplan One");
        Healthplan h2 = new Healthplan("My Second Healthplan");

        Company c1 = new Company("My Company", 1_000_000_000);
        Company c2 = new Company("My Second Company", 2_000);

        Employee emp1 = new Employee("Kyle", "Johnson", 90_000, false, c1.id, h2.getId());
        Employee emp2 = new Employee("Steve", "Greene", 40_000, true, c2.id, h1.getId());

        System.out.println(c1);  // initially object in memory
        emp1.setSalary(emp1.getSalary() + 10_000);
        System.out.println(emp1.getFname() + " has a salary of " + emp1.getSalary());
    }

    public static void main(String[] args) 
    {
        workWithData();
    }
}