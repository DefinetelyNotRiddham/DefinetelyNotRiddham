
import java.util.Scanner;
public class baseconv
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        sc.close();
    }
}