import java.util.Scanner;
import java.lang.Math;

public class AlgebraCalc  {
	static double a,b,c,d,x1,x2;
	Scanner sc  =  new Scanner(System.in);
	public void getInput() 
	{
		System.out.println("Enter a");
		a = sc.nextDouble();
		System.out.println("Enter b");
		b = sc.nextDouble();
		System.out.println("Enter c");
		c = sc.nextDouble();
	}
	
	public void QuadraticFormula() 
	{
		x1 = ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		x2 = ((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		System.out.println("The roots of the quadratic equation are " + x1 + " and " + x2);
	}

	public void Discriminant()
	{
		d = (Math.pow(b, 2)-4*a*c);
		System.out.println("The discriminant of the quadratic equation is " + d);
		if(d > 0)
		{
			System.out.println("The quadratic equation has 2 real solutions");
		}

		else if(d == 0)
		{
			System.out.println("The quadratic equation has 1 real solution");
		}

		else if(d < 0)
		{
			System.out.println("The quadratic equation has 2 complex solutions");
		}
	}
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	AlgebraCalc calc  =  new AlgebraCalc();

	System.out.println("Root or Discriminant: ");
	String op = sc.next();
	if(op.equals("Roots"))
	{
		calc.getInput();
		calc.QuadraticFormula();
	}
	
	else if(op.equals("Discriminant"))
	{
		calc.getInput();
		calc.Discriminant();
	}

sc.close();
}
}

