import java.util.*;

public class HCF{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = Math.min(x,y);i>=x||i>=y;i++){
            if (i%x == 0 && i%y == 0){
                System.out.println(i);
                break;
            }
        }   
        sc.close();
    }
}