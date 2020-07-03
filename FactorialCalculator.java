import java.util.Scanner;

public class FactorialCalculator {
	static Scanner sc = new Scanner(System.in);
	static int num;
	static int fact(int n) //Recursive function
	{
		if(n <= 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated Method stub
		FactorialCalculator calc = new FactorialCalculator();
		System.out.println("Number: ");
		int n  =  sc.nextInt();
		System.out.println("The factorial is "+ fact(n));
		}
	}



