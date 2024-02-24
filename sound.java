import javax.sound.sampled.*;
import java.io.File;
import java.util.*;
public class sound{
    public static void main(String s) throws LineUnavailableException, java.io.IOException, UnsupportedAudioFileException {
        Scanner sc = new Scanner(System.in);
        File file = new File(s);
        AudioInputStream au = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(au);
        clip.start();
        String r = sc.next();
        clip.close();
        sc.close();
        System.out.println(r);
    }
}