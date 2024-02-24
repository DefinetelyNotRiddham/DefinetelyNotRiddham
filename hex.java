import java.util.Scanner;
public class hex{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.println("please enter the length of side of hexagon");
        int x = sc.nextInt(),y=x,z=x;
        for(int i = 1;i<=x;i++){
            for(int k =1;k<=z;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=y;j++){
                System.out.print("* ");
            }
            y++;z--;
            System.out.println();
        }
        x--;z+=2;y-=2;
        for(int i =1;i<=x;i++){
            for(int j  =1;j<=z;j++){
                System.out.print(" ");
            }
            z++;
            for(int k = 1;k<=y;k++){
                System.out.print("* ");
            }
            y--;
            System.out.println();
        }
        sc.close();
    }
}