import java.util.*;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=0,b=0;
        for(int c:nums1){
            a++;
        }
        for(int d:nums2){
            b++;
        }
        int[] ar = new int[a+b];
        for(int i=0;i<a;i++){
           ar[i]=nums1[i];
        }
        for(int j = a;j<(a+b);j++){
            ar[j]=nums2[j-a];
        }
        Arrays.sort(ar);
        for(int B:ar){
            System.out.println(B);
        }
        double d = (a+b);
        d/=2;
        if(d%2!=0){
            return ar[(int)d];
        }
        else{
            int de=(int)d;
            int e = de-1;
            System.out.println(ar[de]+ar[e]);
            double x = (ar[de]+ar[e])/2;
            x+=0.5;
            System.out.println(x);
            return x;
        }
    }
}