import java.util.Scanner;
public class area{
    public static void main (String args[]){
        Scanner scnr = new Scanner(System.in);
        String y = scnr.next();
        switch(y){
            case "rectangle":
            int breadth = scnr.nextInt();
            int length = scnr.nextInt();
            System.out.println("Area of rectangle is " + length*breadth);
            System.out.println("Perimeter of rectangle is " +  2*(length + breadth));
            break;
            case "triangle":
            int base = scnr.nextInt();
            int height = scnr.nextInt();
            System.out.println("Area of triangle is " + base*height/2);
            System.out.println("Perimeter of triangle is " + base*3);
            break;
            case "square":
            int side = scnr.nextInt();
            System.out.println("Area of square is " + Math.pow(side,2));
            System.out.println("Perimeter of square is " + side*4);
            break;
            case "circle":
            int radius = scnr.nextInt();
            System.out.println("Area of circle is " + radius*radius*Math.PI);
            System.out.println("Perimeter of circle is " + Math.PI*radius);
            break;
            case "rhombus":
            int diagonal1 = scnr.nextInt();
            int diagonal2 = scnr.nextInt();
            System.out.println("Area of rhombus is " + diagonal1*diagonal2/2);
            System.out.println("Perimeter of rhombus is " + 2*(Math.sqrt((diagonal1*diagonal1) + (diagonal2*diagonal2))));
            break;            
            case "parallelogram":
            base = scnr.nextInt();
            height = scnr.nextInt();
            System.out.println("Area of parallelogram is " + base*height);
            break;
            case "polygon":
            int numofside = scnr.nextInt();
            int apothem = scnr.nextInt();
            side = scnr.nextInt();
            System.out.println("Area of polygon is " + numofside*apothem*side/2);
            System.out.println("Perimeter of polygon is " + side*numofside);
            break;
            default:
            System.out.println("Not avaliable:(");
        }
        scnr.close();
    }
}