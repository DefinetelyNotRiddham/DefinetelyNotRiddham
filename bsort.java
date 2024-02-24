import java.util.*;
public class bsort{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers to sort");
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0;j<x;j++){
            for(int k=1;k<(x-j);k++){
                if(a[k]<a[k-1]){
                    a[k]+=a[k-1];
                    a[k-1]=a[k]-a[k-1];
                    a[k]-=a[k-1];
                }
            }
        }
        for(int c:a){
            System.out.print(c + " ");
        }
        sc.close();
    }
}