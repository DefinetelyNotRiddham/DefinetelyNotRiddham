
class Interface{
    public static void main(int l,int b)
    {
        polygon r1 = (x,y) -> {System.out.println(l*b);};
        r1.GetArea(5,6);
    }
}
interface polygon{
    void GetArea(int l,int b);
}
