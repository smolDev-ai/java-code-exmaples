package sum3and5;

public class Main
{
    public static void main(String[] args)
    {
        int totalsum = 0;
        int count = 0;
        for(int i = 1; count < 5 && i <= 1000; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " is dividable by 3 and by 5");
                totalsum += i;
                count++;
            }
        }

        System.out.println("total sum: " + totalsum);
    }
}
