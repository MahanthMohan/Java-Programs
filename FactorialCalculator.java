import java.util.Scanner;
import java.lang.Math;
public class FactorialCalculator {
	static Scanner sc=new Scanner(System.in);
	static int num;
	static int fact(int n) //Recursive function
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialCalculator method=new FactorialCalculator();
		System.out.println("Enter the number that you want to calculate the factorial for");
		int n=sc.nextInt();
		System.out.println("The factorial is "+ fact(n));
		}
	}



