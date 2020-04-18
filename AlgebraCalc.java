import java.util.Scanner;
import java.lang.Math;
import java.math.*;
public class AlgebraCalc  {
	static double a,b,c,d,x1,x2;static int operation;
	Scanner keyboard=new Scanner(System.in);
	public void userInput() 
	{
		System.out.println("Enter a");
		a=keyboard.nextDouble();
		System.out.println("Enter b");
		b=keyboard.nextDouble();
		System.out.println("Enter c");
		c=keyboard.nextDouble();
	}
	public void QuadraticFormula() 
	{
		x1=((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		x2=((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		System.out.println("The roots of the quadratic equation are "+ x1 +" and "+x2);
	}
	public void CubicFormula() 
	{
		x1=((-b+Math.sqrt(Math.pow(b, 2)-3*a*c))/3*a);
		x2=((-b-Math.sqrt(Math.pow(b, 2)-3*a*c))/3*a);
		System.out.println("The roots of the quadratic equation are "+ x1 +" and "+x2);
	}
	public void QDiscriminant()
	{
		d=(Math.pow(b, 2)-4*a*c);
		System.out.println("The discriminant of the quadratic equation is " + d);
		if(d>0)
		{
			System.out.println("The quadratic equation has 2 real solutions");
		}
		else if(d==0)
		{
			System.out.println("The quadratic equation has 1 real solution");
		}
		else if(d<0)
		{
			System.out.println("The quadratic equation has 2 complex solutions");
		}
	}
	public void CDiscriminant()
	{
		d=(Math.pow(b, 2)-4*a*c);
		System.out.println("The discriminant of the quadratic equation is " + d);
		if(d>0)
		{
			System.out.println("The quadratic equation has 2 real solutions");
		}
		else if(d==0)
		{
			System.out.println("The quadratic equation has 1 real solution");
		}
		else if(d<0)
		{
			System.out.println("The quadratic equation has 2 complex solutions");
		}
	}
	public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the operation - Quadratic(1) and Cubic(2)");
AlgebraCalc Method=new AlgebraCalc();
operation=keyboard.nextInt();
if(operation==1)
{
System.out.println("Do you want to calculate the Roots(1) or the Discriminant(2)?");
int subop1=keyboard.nextInt();
if(subop1==1)
{
   Method.userInput();
   Method.QuadraticFormula();
}
else if(subop1==2)
{
Method.userInput();
Method.QDiscriminant();
}
}
else if(operation==2)
{
	System.out.println("Do you want to calculate the Roots(1) or the Discriminant(2)?");
	int subop2=keyboard.nextInt();
	if(subop2==1)
	{
		Method.userInput();
		Method.CubicFormula();
	}
	else if(subop2==2)
	{
    Method.userInput();
    Method.CDiscriminant();
}

keyboard.close();
}
}
}

