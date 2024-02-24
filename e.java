import java.util.*;

public class e{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rate to which you ant to approximate euler's number from 0 to 2^31");
        double x = sc.nextInt();
        double e = 1+(1/x);
        double d = Math.pow(e,x);
        System.out.println(d);
        sc.close();
    }
}