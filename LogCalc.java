import java.util.Scanner;
import java.math.*;
public class LogCalc {
static double x,y,op;
static Scanner keyboard=new Scanner(System.in);
public void NaturalLog()
{
	System.out.println("Enter the value");
	x=keyboard.nextDouble();
	//System.out.println(Math.log(x));
}
public void Log()
{
	System.out.println("Enter the value");
	x=keyboard.nextDouble();
	//System.out.println(Math.log10(x));
}
public void e()
{
	System.out.println("Enter the power that e needs to be raised to");
	x=keyboard.nextDouble();
	System.out.println(Math.pow(2.71828, x));
}
static LogCalc Method=new LogCalc();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("What do you want to calculate - ln(1),log(2),and e(3)");
		op=keyboard.nextDouble();
		if(op==1) 
		{
			Method.NaturalLog();
		}
		else if(op==2) 
		{
			Method.Log();
		}
		else if(op==3) 
		{
			Method.e();
		}

	}

}
