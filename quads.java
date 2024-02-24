import java.util.*;
public class quads{
    public static void root(double a, double b, double c){
        System.out.println("Your equation is: " + a + "x^2 + " + b + "x + " + c);
        double x = (b+Math.sqrt(b*b + 4*a*c))/2*a;
        double X = (b-Math.sqrt(b*b + 4*a*c))/2*a;
        System.out.println("Value of x in the following equation is " + x + " or " + X);
        System.out.println((b*b)-(4*a*c));
    }
    public static void factor(int a, int b, int c){
        int x,y;
        if(b>=0){
        x=1;y=b-x;}
        else{
        x=b+1;y=-1;}
        while(x*y!=a*c){
            x++;
            y--;
            if(x*y == a*c)
            break;
        }
        int l=Math.abs(x),m=Math.abs(y),p=Math.abs(a),s = Math.abs(c);
        while(l!=p){
            if(p>l)
            p-=l;
            else
            l-=p;
        }
        while(m!=s){
            if(s>m)
            s=s-m;
            else if(m>s)
            m-=s;
        }
        x/=l;a/=p;y/=m;c/=s;
        if(p==1&&a==1){
            if(y>0&&x>0)
            System.out.println("(x+" + m + ")(x+" + x + ")");
            else if(y<0&&x>0)
            System.out.println("(x-" + m + ")(x+" + x + ")");
            else if(y>0&&x<0)
            System.out.println("(x+" + m + ")(x" + x + ")");
            else if(y<0&&x<0)
            System.out.println("(x-" + m + ")(x" + x + ")");
        }
        else if(p==1){
            if(y>0&&x>0)
            System.out.println("(x+" + m + ")(" + a + "x+" + x + ")");
            else if(y<0&&x>0)
            System.out.println("(x-" + m + ")(" + a + "x+" + x + ")");
            else if(y>0&&x<0)
            System.out.println("(x+" + m + ")(" + a + "x" + x + ")");
            else if(y<0&&x<0)
            System.out.println("(x-" + m + ")(" + a + "x" + x + ")");
        }
        else if(a==1){
            if(y>0&&x>0)
            System.out.println("(" + p + "x+" + m + ")(x+" + x + ")");
            else if(y<0&&x>0)
            System.out.println("(" + p + "x-" + m + ")(x+" + x + ")");
            else if(y>0&&x<0)
            System.out.println("(" + p + "x+" + m + ")(x" + x + ")");
            else if(y<0&&x<0)
            System.out.println("(" + p + "x-" + m + ")(x" + x + ")");
        }
        else
        System.out.println("(" +  p + "x+" + m + ")(" + a + "x+" + x + ")");
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the unknown coefficients of your quadratic equation");
        double a = sc.nextDouble(),b = sc.nextDouble(),c = sc.nextDouble();
        factor((int)a,(int)b,(int)c);
        root(a,b,c);
        sc.close();
    }
}