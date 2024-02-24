import javax.swing.*;
import java.awt.*;
public class GUI{
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(420,420);
        f.setTitle("Stuff");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.getContentPane().setBackground(new Color(123,50,250));
        
    }
}