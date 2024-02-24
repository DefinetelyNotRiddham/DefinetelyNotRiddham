
public class xepxn
{
    public static void main(String args[])
    {
        try
        {
            int m = 9/0;
            System.out.println(m);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error occured :/");
            System.out.println(e);
        }
    }
}