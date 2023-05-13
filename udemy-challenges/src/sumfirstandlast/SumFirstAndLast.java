package sumfirstandlast;

public class SumFirstAndLast
{

    public static int sumFirstAndLastDigit(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit;
        int num = number;
        while(num > 9)
        {
            num /= 10;
        }
        firstDigit = num;


        return lastDigit + firstDigit;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(0)); // 0
        System.out.println(sumFirstAndLastDigit(5)); // 10
        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }
}
