import javax.swing.JOptionPane;
public class DontRun{
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,"Hmm, so you did open this.","Hahaha",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Now you will face the consequences","Hahaha",JOptionPane.PLAIN_MESSAGE);
        while(true){
            JOptionPane.showMessageDialog(null,"Your computer is currently being attacked, good luck escaping this😈","Hahaha",JOptionPane.WARNING_MESSAGE);
        }
    }
}
// JOptionPane.showMessageDialog(null,message,title,text format);
