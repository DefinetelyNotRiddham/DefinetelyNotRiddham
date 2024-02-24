import java.util.*;
public class selectsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount of numbers you want to sort");
        int x = sc.nextInt();
        int[] a = new int[x];
        System.out.println("Please enter your numbers");
        for(int i = 0;i<x;i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0;j<x;j++){
            for(int k=1;k<x;k++){
                if(a[j]<a[k]){
                    a[k]+=a[j];
                    a[j]=a[k]-a[j];
                    a[k]-=a[j];
                }
            }
        }
        int y = a[0];
        for(int i = 0;i<(x-1);i++){
            a[i]=a[i+1];
        }
        a[x-1]=y;
        for(int t:a){
            System.out.print(t + " ");
        }
        sc.close();
    }
}