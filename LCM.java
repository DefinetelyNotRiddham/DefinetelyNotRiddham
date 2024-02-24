import java.util.*;

public class LCM{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 1;i<=x||i<=y;i++){
            if (x%i == 0 && y%i==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}