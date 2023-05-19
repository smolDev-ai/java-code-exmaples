package objectorientedchallenge;

public class Account
{
    /*
        STEP 1: Create fields for the account:
            - account number
            - account balance
            - customer name
            - email
            - phone number
        STEP 2: Create getters/setters for all the fields
        STEP 3: Create two methods:
            - Add to balance
            - Remove from balance
        Customer cannot withdraw funds if it would make their balance
        negative.

        STEP 4: Create a CustomerChallenge class, with a Main method to test
        the account class.
        STEP 5: Print what the balance is after the methods are called


     */
    private long number;
    private double balance;
    private String customername;
    private String email;
    private String phonenumber;

    public long getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getCustomername()
    {
        return customername;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setNumber(long accountNumber)
    {
        number = accountNumber;
    }

    public void setBalance(double accountBalance)
    {
        balance = accountBalance;
    }

    public void setCustomername(String name)
    {
        customername = name;
    }

    public void setEmail(String cusemail)
    {
        email = cusemail;
    }

    public void setPhonenumber(String phone)
    {
        phonenumber = phone;
    }

    public double deposit(double amount)
    {
        return balance += amount;
    }

    public double withdraw(double amount)
    {
        if(balance - amount < 0)
        {
            return -1;
        }

        return balance -= amount;
    }
}
