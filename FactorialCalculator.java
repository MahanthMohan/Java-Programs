import java.util.Scanner;
public class FactorialCalculator {
static Scanner sc=new Scanner(System.in);
public void getFactorial()
{
	int i,no,result;long Factorial=1;
	no=sc.nextInt();
	for(i=1;i<=no;i++)
	{
		Factorial=Factorial*i;
	}
	System.out.println(Factorial);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialCalculator method=new FactorialCalculator();
		int a,b=0;
		System.out.println("***Enter the number that you want to calculate the factorial for***");
		for(a=1;a>b;a++)
		{
			method.getFactorial();
		}
	}

}
