
public class numtable
{
    public static void main(String args[])
    {
        int i = 0, j = 1;
        do
        {
            System.out.print((++i*j) + "\t");
            if (i == 10)
            {
                i -= 10;
                j += 1;
                System.out.println();
            }
            if (j == 11)
            {
                break;
            }
        }
        while (j <= 10);
    }
}