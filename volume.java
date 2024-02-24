import java.util.Scanner;

public class volume{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter what shape's volume you want:");
        System.out.println("Enter 1 for Cube");
        System.out.println("Enter 2 for Cuboid");
        System.out.println("Enter 3 for Cylider");
        System.out.println("Enter 4 for Sphere");
        System.out.println("Enter 5 for Hemisphere");
        System.out.println("enter 6 for Cone");
        int x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("Please enter the Side of your cube:");
            double y = sc.nextDouble();
            double a = Math.pow(y,3);
            double b = 6*y*y;
            double c = 4*y*y;
            System.out.println("Volume of your cube is " + a + " units cubed");
            System.out.println("Total surface area of your cube is " + b + " units squared");
            System.out.println("Lateral surface area of your cube is " + c + " units squared");
            break;
            case 2:
            System.out.println("Please enter the length, breadth and height of your cuboid respectively:");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            a = l*w*h;
            b = 2*(l*w + w*h + h*l);
            c = 2*h*(l+w);
            System.out.println("Volume of your cuboid is " + a + " units cubed");
            System.out.println("Total surface area of your cuboid is " + b + " units squared");
            System.out.println("Lateral surface area of your cuboid is " + c + " units squared");
            break;
            case 3:
            System.out.println("please enter the height and radius of your cylinder respectively:");
            double r = sc.nextDouble();
            h = sc.nextInt();
            a = Math.PI*r*r*h;
            b = 2*Math.PI*r*(h+r);
            c = 2*Math.PI*r*h;
            System.out.println("Volume of your cylinder is " + a + " units cubed");
            System.out.println("Total surface area of your cylinder is " + b + " units squared");
            System.out.println("Lateral surface area of your cylinder is " + c + " units squared");
            break;
            case 4:
            System.out.println("Please enter the radius of your sphere:");
            r = sc.nextDouble();
            a = (4/3)*Math.PI*r*r;
            b = 4*Math.PI*r*r;
            c = 4*Math.PI*r*r;
            System.out.println("Volume of your sphere is " + a + " units cubed");
            System.out.println("Total surface area of your sphere is " + b + " units squared");
            System.out.println("Lateral surface area of your sphere is " + c + " units squared");
            break;
            case 5:
            System.out.println("Please enter the radius of your hemisphere:");
            r = sc.nextDouble();
            a = (2/3)*Math.PI*r*r;
            b = 3*Math.PI*r*r;
            c = 2*Math.PI*r*r;
            System.out.println("Volume of your hemisphere is " + a + " units cubed");
            System.out.println("Total surface area of your hemisphere is " + b + " units squared");
            System.out.println("Lateral surface area of your hemisphere is " + c + " units squared");
            break;
            case 6:
            System.out.println("please enter the height and radius of your cylinder respectively:");
            r = sc.nextDouble();
            h = sc.nextInt();
            double hyp = Math.sqrt(r*r + h*h);
            a = Math.PI*r*r*h/3;
            b = 2*Math.PI*r*(hyp+r);
            c = 2*Math.PI*r*hyp;
            System.out.println("Volume of your cone is " + a + " units cubed");
            System.out.println("Total surface area of your cone is " + b + " units squared");
            System.out.println("Lateral surface area of your cone is " + c + " units squared");
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
}