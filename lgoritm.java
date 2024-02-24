import java.util.ArrayList;
import java.util.Collections;
public class lgoritm
{
    public static void main(String args[])
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(3);
        x.add(2);
        x.add(6);
        x.add(9);
        x.add(7);
        System.out.println(x);
        Collections.sort(x);
        System.out.println(x);
        Collections.shuffle(x);
        System.out.println(x);
        System.out.println(Collections.min(x));
        System.out.println(Collections.max(x));
        int y = Collections.binarySearch(x,3);
        System.out.println(y);
    }
}