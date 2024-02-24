import java.util.Scanner;
public class motion{
    public static void laws(){
        
    }
    public static void mot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 for Final Velocity(v)");
        System.out.println("Please enter 2 for Initial Velocity(u)");
        System.out.println("Please enter 3 for Displacement(S)");
        System.out.println("Please enter 4 for Acceleration(a)");
        System.out.println("Please enter your choice");
        int x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("Please enter Acceleration");
            int a = sc.nextInt();
            System.out.println("Please enter time");
            int t =sc.nextInt();
            System.out.println("Please enter Intitial velocity");
            int u = sc.nextInt();
            int v = u + a*t;
            System.out.println("Final velocity is " + v);
            break;
            case 2:
            System.out.println("Please enter Acceleration");
            a = sc.nextInt();
            System.out.println("Please enter time");
            t =sc.nextInt();
            System.out.println("Please enter Final velocity");
            v = sc.nextInt();
            u = v -(a*t);
            System.out.println("Initial velocity is "+u);
            break;
            case 3:
            System.out.println("Please enter Acceleration");
             a = sc.nextInt();
            System.out.println("Please enter time");
             t =sc.nextInt();
            System.out.println("Please enter Intitial velocity");
             u = sc.nextInt();
            int S = u*t + (a*t*t)/2;
            System.out.println("Displacement is "+S);
            break;
            case 4:
            System.out.println("Please enter time");
             t =sc.nextInt();
            System.out.println("Please enter Intitial velocity");
             u = sc.nextInt();
            System.out.println("Please enter Final velocity");
            v = sc.nextInt();
            a = (v-u)/t;
            System.out.println("Acceleration is "+a);
            break;
            default:
            System.out.println("Invalid choice, reenter by reopening program");
        }
        sc.close();
    }
}