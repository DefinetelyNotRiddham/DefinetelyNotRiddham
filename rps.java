import java.util.Scanner;
public class rps{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int a = sc.nextInt();
        System.out.println("Instruction:");
        System.out.println("Enter 1 for rock");
        System.out.println("Enter 2 for paper");
        System.out.println("Enter 3 for scissors");
        System.out.println("Do not enter number beyond 3");
        int pscore = 0,cscore = 0,w=0,d=0,l=0,g=0;
        for(int i = 1;i<=a;i++){
            int x = sc.nextInt();
            switch(x){
                case 1:
                System.out.println("You chose rock, the most durable and resistant element");
                break;
                case 2:
                System.out.println("You chose paper, delicate but dangerous");
                break;
                case 3:
                System.out.println("You chose scissors, sharp, sleek but not strong");
                break;
                default:
                System.out.println("Invalid choice");
                a++;g++;
                continue;
            }
            double y = 3*(Math.random());
            long Y = Math.round(y);
            int z = (int) Y;
        
            switch(z){
                case 1:
                System.out.println("I choose rock, the most durable and resistant element");
                break;
                case 2:
                System.out.println("I choose paper, delicate but dangerous");
                break;
                case 3:
                System.out.println("I choose scissors, sharp, sleek but not strong");
                break;
            }
            if (z==3&&x==1||z==1&&x==2||z==2&&x==3){
                System.out.println("You win!!!!");
                pscore+=2;
                w++;
            }
            else if(Y==x){
                System.out.println("It's a draw");
                ++pscore;
                ++cscore;
                d++;
            }
            else{
                System.out.println("Better luck next time, you lost:(");
                cscore+=2;
                l++;
            }
        }
        System.out.println();
        if(pscore>cscore){
            System.out.println("You won the game!!!!");
        }
        else if(pscore == cscore){
            System.out.println("It's a tie");
        }
        else{
            System.out.println("You lost the game:'( , better luck next time");
        }
        a-=g;
        double wp = (w/(double)a)*100;
        double dp = (d/(double)a)*100;
        double lp = (l/(double)a)*100;
        System.out.println("Win rate: "+wp+"%");
        System.out.println("Draw rate: "+dp+"%");
        System.out.println("Lose rate: "+lp+"%");
        System.out.println(g);
        sc.close();
    }
}