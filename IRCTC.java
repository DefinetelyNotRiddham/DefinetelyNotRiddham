import java.util.Scanner;
public class IRCTC{
    public static Scanner sc = new Scanner(System.in);
    public static String name;
    public static char coach;
    public static String number;
    public static int amount;
    public static String coch;
    public static void accept(){
        System.out.println("Enter your Name: ");
        name = sc.next();
        System.out.println("Enter your Coach type: ");
        System.out.println("if First AC, enter F,enter S for Second AC,T for Third AC, N for Sleeper class");
        coach = sc.next().charAt(0);
        System.out.println("Enter your Phone number: ");
        number = sc.next();
        System.out.println("Enter your Basic Amount: ");
        amount = sc.nextInt();
    }
    public static void update(){
        switch(coach){
            case 'f':case'F':
            amount += 700;
            coch = "First AC";
            break;
            case 's':case'S':
            amount += 500;
            coch = "Second AC";
            break;
            case 't': case'T':
            amount+=250;
            coch = "Third AC";
            break;
            case'n':case'N':
            amount+=0;
            coch = "Sleeper Class";
            break;
            default:
            System.out.println("Invalid charcter");
        }
    }
    public static void display(){
        System.out.println("\n\n");
        System.out.println("Welcome to IRCTC Railways");
        System.out.println("*************************");
        System.out.println("Name of passenger: " + name);
        System.out.println("Coach of Passenger: " + coch);
        System.out.println("Mobile number of Passenger: " + number);
        System.out.println("Price of Joruney: " + amount + " Rupees");
        System.out.println("*****************************");
        System.out.println("We wish you a Happy Journey !");
    }
    public static void main(String args[]){
        IRCTC.accept();
        IRCTC.update();
        IRCTC.display();
    }
}