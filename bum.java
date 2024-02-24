public class bum {
    public static void main(String[] args) {
        int s=0,p=1,j;
        for(int i=1;i<=90000;i++){
            for(j=1;j<i;j++){
                if(i%j==0){
                    s+=j;
                    p*=j;
                }
            }
            if(s==p)
            System.out.println(j);
        }
    }
}