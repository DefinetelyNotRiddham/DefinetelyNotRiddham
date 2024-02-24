import java.util.LinkedList;
import java.util.Collections;
public class linclist
{
    public static void main(String args[])
    {
        LinkedList<String> gg = new LinkedList<String>();
        gg.add("Java");
        gg.add("C++");
        gg.add("Python");
        for (String g : gg)
        {
            System.out.println(g);
        }
        gg.remove(2);
        gg.offer("C#");
        gg.poll();
        System.out.println();
        for (String g : gg)
        {
            System.out.println(g);
        }
        Collections.reverse(gg);
        System.out.println();
        for (String g : gg)
        {
            System.out.println(g);
        }
    }
}