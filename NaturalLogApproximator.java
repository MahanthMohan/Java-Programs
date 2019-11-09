import java.util.Scanner;
import java.lang.Math;
public class NaturalLogApproximator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Do you want to calculate the lim of e? - Enter 1 for Yes and 2 for No");
		int logic=keyboard.nextInt();
		if(logic==1)
		{
		System.out.println("Enter the no till which you want to calculate the limit of e");
		double no=keyboard.nextInt();
		double exp=(1+(1/no));
		System.out.println(exp);
		double e=(Math.pow(exp,no));
		System.out.println("The value of e is "+ e + " when calculated upto "+ no + " places");
		}
		else if(logic==2)
		{
			System.out.println("Thank you for using this program");
		}

	}

}
