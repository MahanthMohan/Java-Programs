import java.lang.Math;
import java.util.Scanner;

public class TrigonometricFunctions {
	static double adj,opp,hyp,x,result;
	static Scanner sc  =  new Scanner(System.in);

	public void getData()
	{
	System.out.println("Enter adjacent side taking theta angle as ref");
	adj = sc.nextDouble();
	System.out.println("Enter opposite side taking theta angle as ref");
	opp = sc.nextDouble();
	System.out.println("Enter hypotenuse side taking theta angle as ref");
	hyp = sc.nextDouble();
	}
	public static void main(String[] args) {
	// TODO Auto-generated Method stub
	TrigonometricFunctions trig = new TrigonometricFunctions();
	System.out.println("Is it a right triangle? - y/N: ");
	String op = sc.next();
	if(op.equals("y"))
	{
		trig.getData();
		System.out.println("What do you want to calculate - sin, cos, tan, csc, sec, cot, arcsin, arccos, arctan");
		String subop = sc.next();
		if(subop.equals("sin"))
		{
			result = (opp/hyp);
			System.out.println(result);
		}

		else if(subop.equals("cos"))
		{
			result = (adj/hyp);
			System.out.println(result);
		}

		else if(subop.equals("tan"))
		{
			result = (opp/adj);
			System.out.println(result);
		}

		else if(subop.equals("csc"))
		{
			result = (1/(opp/hyp));
			System.out.println(result);
		}

		else if(subop.equals("sec"))
		{
			result = (1/(adj/hyp));
			System.out.println(result);
		}

		else if(subop.equals("cot"))
		{
			result = (1/(opp/adj));
			System.out.println(result);
		}

		else if(subop.equals("arcsin"))
		{
			System.out.println("Enter the value");
			x = sc.nextInt();
			result = (Math.asin(x));
			System.out.println(result);
		}

		else if(subop.equals("arccos"))
		{
			System.out.println("Enter the value");
			x = sc.nextInt();
			result = (Math.acos(x));
			System.out.println(result);
		}
		
		else if(subop.equals("arctan"))
		{
			System.out.println("Enter the value");
			x = sc.nextInt();
			result = (Math.atan(x));
			System.out.println(result);
		}
	}

	else if(op.equals("N"))
	{
		System.out.println("Trigonometric ratios for non-right triangles cannot be calculated");
		System.out.println("Thank you for using this program");
	}

	}

}
