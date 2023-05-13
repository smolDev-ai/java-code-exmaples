package sumevendigits;

public class sumEvenDigits
{

    public static int getEvenDigitSum(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int sum = 0;
        int currentNum;
        for(int i = number; i != 0; i /= 10)
        {
            currentNum = i % 10;
            if(currentNum % 2 == 0)
            {
                sum += currentNum;
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

}
