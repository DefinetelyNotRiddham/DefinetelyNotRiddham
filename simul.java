import java.util.*;
public class simul{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coefficients of your first equation in standard from");
        System.out.println("Eg. 3x+2y+1=0 enter 3,2 and 1 seperately");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        System.out.println("Please enter the coefficients of your second equation in standard from");
        System.out.println("Eg. 3x+2y+1=0 enter 3,2 and 1 seperately");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double x = ((b1*c2)-(b2*c1))/((a1*b2)-(b1*a2));
        double y = ((c1*a2)-(c2*a1))/((a1*b2)-(b1*a2));
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);
        sc.close();
    }
}