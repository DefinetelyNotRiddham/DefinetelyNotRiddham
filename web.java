
import java.awt.Desktop;
import java.net.URI;
public class web
{
    public static void main(String[] args) 
    {
        try 
        {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(""));
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}