import java.util.*;

public class pascal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter how many rows you want for your triangle:");
        int s = sc.nextInt();
        int a = s;
        for(int j=1;j<=a;j++){
            System.out.print(" ");
        }
        System.out.print(" 1\n");
        for(int i = 1;i<=s;i++){
            for(int j=1;j<=a;j++){
                System.out.print(" ");
            }
            a--;int y = i,z;
            System.out.print("1 ");
            
            for(int k=1,l=0;k<=y;k++,l++){
                z= y/factorial.main(k);
                System.out.print(z+" ");
                y*=(i-(l+1));
            }
            System.out.println();
        }
        sc.close();
    }
}