public class chance{
    public static void main(int x){
        int j;int amt1=0,amt2=0,amt3=0,amt4=0,amt5=0,amt6=0,amt7=0,amt8=0,amt9=0,amt10=0;
        for(int i=1;i<=x;i++){
            j =(int) Math.ceil(Math.random()*10);
            switch(j){
                case 1: ++amt1;break;
                case 2: ++amt2;break;
                case 3: ++amt3;break;
                case 4: ++amt4;break;
                case 5: ++amt5;break;
                case 6: ++amt6;break;
                case 7: ++amt7;break;
                case 8: ++amt8;break;
                case 9: ++amt9;break;
                case 10: ++amt10;break;
            }
        }
        System.out.println("Amount of 1's "+amt1 + "\n" +"Amount of 2's "+amt2 + "\n" +"Amount of 3's "+amt3 + "\n" +"Amount of 4's "+amt4 + "\n" +"Amount of 5's "+amt5 + "\n" +"Amount of 6's "+amt6 + "\n" +"Amount of 7's "+amt7 + "\n" +"Amount of 8's "+amt8 + "\n" +"Amount of 9's "+amt9 + "\n" +"Amount of 10's "+amt10 + "\n");
    }
}