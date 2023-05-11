package primenumberchallenge;

public class Main
{

    public static boolean isPrime(int num)
    {
        if(num <= 2)
        {
            return num == 2;
        }

        for(int divisor = 2; divisor <= num / 2; divisor++)
        {
            if(num % divisor == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
//        System.out.println("0 is " + (isPrime(0) ? "prime" : "not prime"));
//        System.out.println("1 is " + (isPrime(1) ? "prime" : "not prime"));
//        System.out.println("2 is " + (isPrime(2) ? "prime" : "not prime"));
//        System.out.println("3 is " + (isPrime(3) ? "prime" : "not prime"));
//        System.out.println("8 is " + (isPrime(8) ? "prime" : "not prime"));
//        System.out.println("17 is " + (isPrime(17) ? "prime" : "not prime"));

        int primeCounter = 0;
        for(int i = 7; i <= 1000; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " is prime");
                primeCounter++;
                if(primeCounter == 5)
                {
                    break;
                }
            }
        }
    }
}
