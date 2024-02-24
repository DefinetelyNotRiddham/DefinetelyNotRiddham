import javax.swing.*;
public class t{
    public static void m(String message,String title){
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.PLAIN_MESSAGE);
    }
    public static void o(String message,String title){
        JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_CANCEL_OPTION);
    }
    public static void i(String message, String title){
        JOptionPane.showInputDialog(null,message,title,JOptionPane.QUESTION_MESSAGE);
    }
}