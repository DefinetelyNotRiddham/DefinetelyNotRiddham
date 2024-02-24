import java.util.Scanner;
public class marks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Science or Commerce Marks");
        System.out.println("If Commerce, put same Marks in the 3 inputs");
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter Social Science Marks");
        double h = sc.nextDouble();
        double g = sc.nextDouble();
        System.out.println("Enter English Marks");
        double l = sc.nextDouble();
        double L = sc.nextDouble();
        System.out.println("Enter Hindi or Marathi marks");
        double hm = sc.nextDouble();
        System.out.println("Enter Maths or EVS marks");
        double me = sc.nextDouble();
        System.out.println("Enter Group III Marks");
        double g3 = sc.nextDouble();
        double avg1 = (p+c+b)/3;
        double avg2 = (h+g)/2;
        double avg3 = (l+L)/2;
        double avgt = avg1+avg2+avg3+g3+me+hm;
        double per = (p+c+b+h+g+l+L+hm+me+g3)/2;
        System.out.println("Your average is " + avgt);
        System.out.println("Your percentage is " + per);
        sc.close();
        }
        }