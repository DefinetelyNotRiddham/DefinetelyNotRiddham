
import java.util.Scanner;
public class interest
{
    public static void comp(){
        Scanner sc = new Scanner(System.in);
        double p= sc.nextDouble(),y = sc.nextDouble(),r = sc.nextDouble();
        double A = p*Math.pow((100+r)/100,y);
        System.out.println("The amount is " + A);
        sc.close();
    }
}