import java.util.Scanner;

public class colats{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number for the collatz conjecture");
        int x = sc.nextInt(),i;
        sc.close();
        for(i = 0;(x!=4);i++){
            if(x%2==0)
            x/=2;
            else
            x = (3*x)+1;
        }
        System.out.println(i);
    }
}