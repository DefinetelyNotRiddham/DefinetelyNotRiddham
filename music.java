import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.swing.*;

public class music {
    public static void main(String args[]) throws LineUnavailableException, java.io.IOException, UnsupportedAudioFileException {
        String[] options = {"Pop","Rap","Phonk"};
        int x = JOptionPane.showOptionDialog(null,"Which Category of Music would you like to listen", "Music", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch(x){
            case 0:
            String[] musica = {"Closer(3$)","One Kiss(2$)"};
            int y = JOptionPane.showOptionDialog(null,"Which song would you like to listen to?", "Pop Music Category", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, musica, musica[0]);
            if(y==0){
                String s = JOptionPane.showInputDialog(null, "To purchase the song Closer, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("a.wav");
            }
            else{
                String s = JOptionPane.showInputDialog(null, "To purchase the song One Kiss, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("b.wav");
            }
            break;
            case 1:
            String[] musicb = {"Rap God(3$)","Godzilla(2$)"};
            y = JOptionPane.showOptionDialog(null,"Which song would you like to listen to?", "Rap Music Category", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, musicb, musicb[0]);
            if(y==0){
                String s = JOptionPane.showInputDialog(null, "To purchase the song Rap God, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("c.wav");
            }
            else{
                String s = JOptionPane.showInputDialog(null, "To purchase the song Godzilla, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("d.wav");
            }
            break;
            case 2:
            String[] musicc = {"Rave(3$)","Worth Nothing(2$)"};
            y = JOptionPane.showOptionDialog(null,"Which song would you like to listen to?", "Phonk Music Category", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, musicc, musicc[0]);
            if(y==0){
                String s = JOptionPane.showInputDialog(null, "To purchase the song Rave, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("f.wav");
            }
            else{
                String s = JOptionPane.showInputDialog(null, "To purchase the song Scopin, please enter your credit card number without spaces:","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Congratulations, your payment is successful","Purchase",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "enjoy your music","Purchase",JOptionPane.INFORMATION_MESSAGE);
                d("e.wav");
            }
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid genre","Purchase",JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Thank you for choosing our music store","Thanks!",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void d(String s) throws LineUnavailableException, java.io.IOException, UnsupportedAudioFileException {
        Scanner sc = new Scanner(System.in);
        File f = new File(s);
        AudioInputStream au = AudioSystem.getAudioInputStream(f);
        Clip c = AudioSystem.getClip();
        c.open(au);
        c.start();
        String r = sc.next();
        c.close();
        sc.close();
        System.out.println(r);
    }
}