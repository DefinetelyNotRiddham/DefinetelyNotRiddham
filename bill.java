
public class bill
{
    public static void main(int ec)
    {
        int mc = 250;
        double fc = 3.25;
        double rc = (ec-100)*4.25;
        if (ec <= 100)
        System.out.println(1115*((ec*fc)+mc)/1000);
        else
        System.out.println(1115*(ec+(fc*100)+rc+mc)/1000);
    }
}
