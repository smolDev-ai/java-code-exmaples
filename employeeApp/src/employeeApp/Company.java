package employeeApp;

import java.text.DecimalFormat;


// This class is not be best practice
public class Company 
{
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");
    // these fields can be accessed by anyone
    // which is bad practice
    public static int maxId = 0;
    public int id;
    public String name;
    public int debt;
    
    public Company(String name, int debt) 
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString()
    {
        String rtnStr = "Company Name: " + name + " has " + df.format(debt) + " in debt";
        return rtnStr;
    }
}
