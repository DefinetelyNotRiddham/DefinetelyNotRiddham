import java.util.HashMap;
public class hashmap
{
    public static void main(String args[])
    {
        HashMap<Integer,String> a = new HashMap<Integer,String>();
        a.put(0,"pizza");
        a.put(1,"burger");
        a.put(2,"French Fries");
        System.out.println(a);
        a.replace(2,"Pav Bhaji");
        System.out.println(a);
        System.out.println(a.get(1));
        String n = a.remove(2);
        System.out.println(n);
        System.out.println(a);
    }
}