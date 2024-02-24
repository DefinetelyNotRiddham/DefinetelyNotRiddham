
public class time
{
    public static void main(double seconds)
    {
        double days, hours, minutes, second;
        days = (seconds - (seconds%86400))/86400;
        hours = (seconds - (seconds%3600))/3600 - days*24;
        minutes = (seconds - (seconds%60))/60 - hours*60 - days*24*60;
        second = seconds%60;
        System.out.println("The time is " + days + " days " + hours + " hours " + minutes + " minutes " + second + " seconds");
    }
}