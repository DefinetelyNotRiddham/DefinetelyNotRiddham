import java.util.Scanner;
public class height{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter base of the triangle:");
        double a = sc.nextDouble();
        System.out.println("Please enter other two sides of the triangle:");
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double h = A*2/b;
        System.out.println("Height of your triangle is:\t"+h);
        sc.close();
    }
}