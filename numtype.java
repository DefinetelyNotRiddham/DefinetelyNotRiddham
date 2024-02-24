public class numtype{
    public static boolean armstrong(int x){
        int a = x;
        int y = 0;
        String m = Integer.toString(x);
        int n = m.length();
        for (int i =1;i <=n;i++){
            int ius = x%10;
            y += (int)Math.pow(ius,n);
            x = (x - (x%10))/10;
        }
        return (y == a);
    }
    public static boolean purrfec(int y){
        int z = 0;
        for (int i = 1;i<=y;i++){
            if (y%i == 0)
            {
                z+=i;
            }
            else
            {
                z += 0;
            }
        }
        z /= 2;
        return (z == y);
    }
    public static boolean niven(int num){
        int x = 0;
        int n = num;
        do{
             num = (num - num%10) / 10;
            x += num%10;
        }
        while (num != 0);
        return (n%x == 0);
    }
    public static boolean spynum(int a){
        int s = 0, p = 1;
        while (a > 10){
            s+=a%10;
            p*=a%10;
            a/=10;
        }
        s += a%10;
        return (s == p);
    }
    public static boolean palindrome(int mum){
        int n = mum;
        double ius = 0;
        do{
            ius = (ius*10) + mum%10;
            mum = (mum - mum%10)/10;
        }while (mum != 0);
        return (ius == n);
    }
    public static boolean krishnamurthy(int x){
        int a = x;
        int y=0;
        while(x>0){
            y+= factorial.main(x%10);
            x/=10;
        }
        ++y;
        return (a==y);
    }
    public static boolean Automorphic(int x){
        return ((x%100)*(x%100) == x);
    }
    public static boolean buzz(int x){
        return (x%10 == 7||x%10 == 7);
    }
    public static boolean amicable(int x,int y){
        int a = 0,b=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                a+=i;
            }
        }
        for(int j=1;j<y;j++){
            if(y%j==0){
                b+=j;
            }
        }
        return ((a==y)&&(b==x));
    }
    public static boolean coprime(int num1, int num2){
        while(num1!=num2){
             if(num1>num2)
             num1-=num2;
             else
             num2-=num1;
        }
        return num1==1;
    }
}