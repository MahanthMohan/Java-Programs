import java.util.Scanner;
import java.math.*;

public class Calculator
{
    public static void main(String args[])
    {
       double a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
            System.out.print("Addition(+),Subtraction(-),Multiplication(*),Division(/),sqrt(√),cuberoot(6),square(7),cube(8)");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);    
            switch(choice)
            {
                case '+' :
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;
                case '-' : 
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    res = a - b;
                    System.out.print("Result = " + res);
                    break;
                case '*' : 
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    res = a * b;
                    System.out.print("Result = " + res);
                    break;
                case '/' : 
                	a = scan.nextDouble();
                    b = scan.nextDouble();
                    res = a / b;
                    System.out.print("Result = " + res);
                    break;
                case '√' : System.out.println("Enter your number");
                	a = scan.nextDouble();
                	res= Math.sqrt(a);
                    break;
                case '6' : System.out.println("Enter your number");
            	a = scan.nextDouble();
            	res= Math.cbrt(a);
                break;
                case '7' : System.out.println("Enter your number");
            	a = scan.nextDouble();
            	res= a*a;
                break;
                case '8' : System.out.println("Enter your number");
            	a = scan.nextDouble();
            	res= a*a*a;
                break;
 
            }
        }
}


