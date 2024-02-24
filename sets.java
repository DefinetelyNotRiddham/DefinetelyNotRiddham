import java.util.HashSet;
public class sets
{
    static HashSet<Integer> x = new HashSet<Integer>();
    static HashSet<Integer> y = new HashSet<Integer>();
    public static void union()
    {
        x.add(69);
        x.add(420);
        x.add(80085);
        System.out.println(x);
        y.add(69);
        y.add(420);
        y.add(69420);
        System.out.println(y);
        x.addAll(y);
        System.out.println(x);
    }
    public static void intersection()
    {
        x.add(69);
        x.add(420);
        x.add(80085);
        System.out.println(x);
        y.add(69);
        y.add(420);
        y.add(69420);
        System.out.println(y);
        x.retainAll(y);
        System.out.println(x);
         
    }
    public static void difference()
    {
        x.add(69);
        x.add(420);
        x.add(80085);
        System.out.println(x);
        y.add(69);
        y.add(420);
        y.add(69420);
        System.out.println(y);
        x.removeAll(y);
        System.out.println(x);
         
    }
    public static void subset()
    {
        x.add(69);
        x.add(420);
        x.add(80085);
        y.add(69);
        System.out.println(x);
        y.add(420);
        y.add(80085);
        y.add(69420);
        System.out.println(y);
        System.out.println(y.containsAll(x));
    }
}