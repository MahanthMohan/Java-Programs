import java.util.Scanner;
import java.lang.Math;
public class NaturalLogApproximator {

	public static void main(String[] args) {
		// TODO Auto-generated Method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to calculate the lim of e? - y/N");
		String logic = sc.next();
		if(logic.equals("y"))
		{
		System.out.println("Enter the no till which you want to calculate the limit of e");
		double no = sc.nextInt();
		double exp = (1+(1/no));
		System.out.println(exp);
		double e = (Math.pow(exp,no));
		System.out.println("The value of e is "+ e + " when calculated upto "+ no + " places");
		}

		else if(logic.equals("N"))
		{
			System.out.println("Thank you for using this program");
		}
		sc.close();
	}

}
