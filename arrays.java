
public class arrays
{
    public static void main(String args[])
    {
        int[][] n = {{1,2,3,4},{5,6,7,8}};
        int[] m = {1,2,3,4};
        for (int i:m)
        {
            System.out.println(i);
        }
        for(int i[]:n){
            for(int j:i){
                System.out.println(j);
            }
        }
    }
} 