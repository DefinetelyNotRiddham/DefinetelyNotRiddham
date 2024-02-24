import java.util.Scanner;
public class centerpyr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of rows you want to show");
        int x = sc.nextInt();
        int y = x;
        for(int i = 1;i<=x;i++){
            for(int j=1;j<=y;j++){
                System.out.print(" ");
            }
            y--;
            for(int k=1;k<=(x-y);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}