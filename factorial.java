public class factorial{
    public static int main(int num){
        int n = num;
        while(n>1){
            n--;
            num*=n;
        }
        return num;
    }
}