import java.util.Scanner;
import java.lang.Math;
import java.math.*;
public class AlgebraCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,x1,x2;
Scanner keyboard=new Scanner(System.in);
System.out.println("Enter the operation - Quadratic(1) and Cubic(2)");
int operation=keyboard.nextInt();
if(operation==1)
{
System.out.println("Do you want to calculate the Roots(1) or the Discriminant(2)?");
int subop1=keyboard.nextInt();
if(subop1==1)
{
	System.out.println("Enter a");
	a=keyboard.nextDouble();
	System.out.println("Enter b");
	b=keyboard.nextDouble();
	System.out.println("Enter c");
	c=keyboard.nextDouble();
	x1=((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
	x2=((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
	System.out.println("The roots of the quadratic equation are "+ x1 +" and "+x2);
}
else if(subop1==2)
{
System.out.println("Enter a");
a=keyboard.nextDouble();
System.out.println("Enter b");
b=keyboard.nextDouble();
System.out.println("Enter c");
c=keyboard.nextDouble();
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
}
else if(operation==2)
{
	System.out.println("Do you want to calculate the Roots(1) or the Discriminant(2)?");
	int subop2=keyboard.nextInt();
	if(subop2==1)
	{
		System.out.println("Enter a");
		a=keyboard.nextDouble();
		System.out.println("Enter b");
		b=keyboard.nextDouble();
		System.out.println("Enter c");
		c=keyboard.nextDouble();
		x1=((-b+Math.sqrt(Math.pow(b, 3)-4*a*c))/3*a);
		x2=((-b-Math.sqrt(Math.pow(b, 3)-4*a*c))/3*a);
		System.out.println("The roots of the cubic equation are "+ x1 +" and "+ x2);
	}
	else if(subop2==2)
	{
	System.out.println("Enter a");
	a=keyboard.nextDouble();
	System.out.println("Enter b");
	b=keyboard.nextDouble();
	System.out.println("Enter c");
	c=keyboard.nextDouble();
	d=(Math.pow(b,3)-3*a*c);
	System.out.println("The discriminant of the cubic equation is " + d);
	if(d>0)
	{
		System.out.println("The cubic equation has 2 real solutions");
	}
	else if(d==0)
	{
		System.out.println("The cubic equation has 1 real solution");
	}
}
	
}
}
}

