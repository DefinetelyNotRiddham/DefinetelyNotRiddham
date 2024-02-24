import java.util.*;
import java.lang.Math;
public class Calci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the kind of operation you want to do");
        System.out.println("please enter 1 for Arithmetic operations");
        System.out.println("Please enter 2 for trignometric operations");
        System.out.println("Please enter 3 for logarithmic operations");
        System.out.println("Please enter 4 for interest calculation");
        System.out.println("Please enter 5 for base conversion");
        System.out.println("Please enter 6 for HCF and LCM");
        System.out.println("Please enter 7 for simultaneous linear equations");
        System.out.println("Please enter 8 for quadratic equations");
        System.out.println("Please enter 9 for long division");
        System.out.println("Please enter 10 for sorting numbers");
        int x = sc.nextInt();
        switch(x){
            case 1:
            A();
            break;
            case 2:
            B();
            break;
            case 3:
            C();
            break;
            case 4:
            interest.comp();
            break;
            case 5:
            baseconv.main();
            break;
            case 6:
            HCF.main();
            LCM.main();
            break;
            case 7:
            simul.main();
            break;
            case 8:
            quads.main();
            break;
            case 9:
            longdiv.main();
            break;
            case 10:
            bsort.main();
            break;
            
        }
        sc.close();
    }
    public static void A(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please first enter both your operands(number) and operation later as symbol seperately:");
        double x = sc.nextDouble(),y = sc.nextDouble(),result;
        System.out.println("Now enter the operation you want to do between them");
        System.out.println(" For example: Addition as + or exponent as exp ");
        String s = sc.next();
        switch(s){
            case "+":
            result = x+y;
            break;
            case "-":
            result = x-y;
            break;
            case "*":
            result = x*y;
            break;
            case "/":
            result = x/y;
            break;
            case "%":
            result = x%y;
            break;
            case "exp":
            result = Math.pow(x,y);
            break;
            default:
            result = 0;
        }
        System.out.println("Your result is: " + result);
        sc.close();
    }
    public static void B(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please first enter your operand(number) and operation as symbol seperately:");
        double y = sc.nextDouble(),z=y%360,result,x = Math.toRadians(z);
        System.out.println("Now enter the operation you want to do between them");
        System.out.println(" For example: Sine as sin or Cosecant as csc,if hyperbolic, enter sinh instead of sin");
        String s = sc.next();
        switch(s){
            case "sin":
            result = Math.sin(x);
            break;
            case "cos":
            result = Math.cos(x);
            break;
            case "tan":
            result = Math.tan(x);
            break;
            case "csc":
            result = 1/Math.sin(x);
            break;
            case "sec":
            result = 1/Math.cos(x);
            break;
            case "cot":
            result = 1/Math.tan(x);
            break;
            case "sinh":
            result = Math.sinh(x);
            break;
            case "cosh":
            result = Math.cosh(x);
            break;
            case "tanh":
            result = Math.tanh(x);
            break;
            case "csch":
            result = 1/Math.sinh(x);
            break;
            case "sech":
            result = 1/Math.cosh(x);
            break;
            case "coth":
            result = 1/Math.tanh(x);
            break;
            default:
            result = 69420;
        }
        System.out.println("Your result is: " + result);
        sc.close();
    }
    public static void C(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the log base and then number respectively:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double result = Math.log(y)/Math.log(x);
        System.out.println("Your result is: "+result);
        sc.close();
    }
    public static void D(){
        
    }
}