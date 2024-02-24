import java.util.Scanner;
public class longdiv
{
    public static void main()
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("This is a program for long division");
        System.out.println("If you want nearest greater square from a number, enter NGS");
        System.out.println("If you want nearest smaller square from a number, enter NSS");
        System.out.println("If you want the root of a number, enter sqrt");
        System.out.println("Enter your choice please:");
        String abc = t.nextLine();
        switch (abc)
        {
            case "NGS":
            System.out.println("Please enter your number");
            int x = t.nextInt();
            int y = x;
            while ((Math.sqrt(x)%1) != 0)
            {
                x += 1;
                if ((Math.sqrt(x)%1) == 0)
                {
                    break;
                }
            }
            System.out.println( y + " needs to be added with " + (x-y) + " to be a perfect square");
            break;
            
            case "NSS":
            System.out.println("Please enter your number");
            int z = t.nextInt();
            int w = z;
            while ((Math.sqrt(z)%1) != 0)
            {
                z -= 1;
                if ((Math.sqrt(z)%1) == 0)
                {
                    break;
                }
            }
            System.out.println((w-z) + "Needs to be subtracted from " + w + " To get a perfect square");
            break;
            
            case "sqrt":
            System.out.println("Please enter your number:");
            int u = t.nextInt();
            System.out.println("Square root of " + u + " Is " + Math.sqrt(u));
            break;
            default :
            System.out.println("Invalid choice");
        }
        t.close();
    }
}