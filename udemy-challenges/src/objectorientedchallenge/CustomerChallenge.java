package objectorientedchallenge;

public class CustomerChallenge
{

    public static void main(String[] args)
    {
        Account account = new Account();
        account.setCustomername("Julia");
        account.setBalance(1000.00);
        account.setEmail("julia@julia.com");
        account.setPhonenumber("4341112323");
        account.setNumber(34224432);

        account.deposit(500.00);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(1200.00);
        System.out.println("Balance after withdraw: " + account.getBalance());


    }

}
