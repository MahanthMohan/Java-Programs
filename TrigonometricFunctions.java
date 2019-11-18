import java.lang.Math;
import java.util.Scanner;
public class TrigonometricFunctions {
	static double adj,opp,hyp,x,result;static int op,subop;
	static Scanner keyboard= new Scanner(System.in);
	public void getData()
	{
	System.out.println("Enter adjacent side taking theta angle as ref");
	adj = keyboard.nextDouble();
	System.out.println("Enter opposite side taking theta angle as ref");
	opp=keyboard.nextDouble();
	System.out.println("Enter hypotenuse side taking theta angle as ref");
	hyp=keyboard.nextDouble();
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrigonometricFunctions Method=new TrigonometricFunctions();
	System.out.println("Is it a right triangle? - Yes(1),No(2)");
	op=keyboard.nextInt();
	if(op==1)
	{
		Method.getData();
		System.out.println("What do you want to calculate - Sine(1),Cosine(2),Tangent(3),Cosecant(4),Secant(5),Cotangent(6),arcsine(7),arccos(8),arctan(9)");
		subop=keyboard.nextInt();
		if(subop==1)
		{
			result=(opp/hyp);
			System.out.println(result);
		}
		else if(subop==2)
		{
			result=(adj/hyp);
			System.out.println(result);
		}
		else if(subop==3)
		{
			result=(opp/adj);
			System.out.println(result);
		}
		else if(subop==4)
		{
			result=(1/(opp/hyp));
			System.out.println(result);
		}
		else if(subop==5)
		{
			result=(1/(adj/hyp));
			System.out.println(result);
		}
		else if(subop==6)
		{
			result=(1/(opp/adj));
			System.out.println(result);
		}
		else if(subop==7)
		{
			System.out.println("Enter the value");
			x=keyboard.nextInt();
			result=(Math.asin(x));
			System.out.println(result);
		}
		else if(subop==8)
		{
			System.out.println("Enter the value");
			x=keyboard.nextInt();
			result=(Math.acos(x));
			System.out.println(result);
		}
		else if(subop==9)
		{
			System.out.println("Enter the value");
			x=keyboard.nextInt();
			result=(Math.atan(x));
			System.out.println(result);
		}
	}
	else if(op==2)
	{
		System.out.println("Trigonometric ratios for non-right triangles cannot be calculated");
		System.out.println("Thank you for using this program");
	}

	}

}
