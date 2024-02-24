
import java.util.ArrayList;
public class dk
{
    public static void main(String args[])
    {
        ArrayList<Character> y = new ArrayList<Character>();
        y.add('n');
        y.add('i');
        y.add('g');
        y.add('g');
        y.add('a');
        for (int i = 0;i<y.size();i++)
        {
            System.out.print(y.get(i));
        }
        y.set(4,'e');
        y.add('r');
        System.out.println();
        for (int j = 0;j<y.size();j++)
        {
            System.out.print(y.get(j));
        }
    }
}