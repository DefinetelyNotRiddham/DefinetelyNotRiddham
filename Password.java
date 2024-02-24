import java.util.Scanner;
public class Password{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        char[] ch = new char[t.length()];
        int ws=0;
        int d = 0;
        int uc = 0;
        int Sc = 0;
        for(int i = 0;i<t.length();i++){
            ch[i] = t.charAt(i);
        }
        if(t.length()<8) {
            System.out.println("Your password should contain at least 8 characters");
        }
        for(char c: ch){
            if(Character.isUpperCase(c)){ 
                ++uc;
            }
            else if(Character.isWhitespace(c)){
                ++ws;
            }
            else if((Character.isDigit(c))){
                ++d;
            }
            else if(Character.isLowerCase(c)){
            }
            else if(!(Character.isDigit(c)&&Character.isLetter(c))) {
                ++Sc;
            }
        }
        if(uc==0){
            System.out.println("Please include Uppercase Letters in your Password");
        }
        else if(ws>0){
            System.out.println("Please replace spaces with underscores or dots");
        }
        else if(d==0){
            System.out.println("Please add Numbers in your password");
        }
        else if(Sc==0){
            System.out.println("Please include Special Characters in your Password");
        }
        else {
            System.out.println("You have made a valid password");
        }
        sc.close();
    }
}       