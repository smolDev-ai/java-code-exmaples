package secondsandminutes;

public class SecondsAndMinutes
{

    // one minute = 60
    // one hour = 60
    public static String getDurationString(int seconds)
    {
        if(seconds < 0)
        {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int leftover = seconds % 60;


        return getDurationString(minutes, leftover);


    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 && seconds < 0 || seconds > 59)
        {
            return "Invalid Values";
        }

        int hours = minutes / 60;
        int calcminutes = minutes % 60;
        int leftover = seconds % 60;

        return hours +  "h " + calcminutes + "m " + leftover + "s";


    }

    public static void main(String[] args)
    {
        System.out.println(getDurationString(20462));
    }
}
