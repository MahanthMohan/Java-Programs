import java.util.Scanner;

public class ArithmeticCalculator {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated Method stub
	int i;
	double sum = 0;
	System.out.println("Total number of numbers: ");
	int n = sc.nextInt();	
	int a[] = new int [n];
	System.out.println("Enter the " + n + " numbers");

	for(i = 0; i < n; i++)
    {
        a[i] = sc.nextInt();
        sum = sum + a[i];
	}
	
	System.out.println("Mean or Median: ");

	double oddmedian = a[((n+1)/2)];
	double evenmedian = a[((n/2)+(n/2)+1)/2];

    String operation = sc.next();
	if(operation.equals("Mean"))
	{
		double mean = sum/n;
		System.out.println(mean);
	}

	else if(operation.equals("Median"))
	{
		 if(n%2 == 0)
		   {
			   System.out.println("The median is "+ evenmedian);
		   }
		   
		   else
		   {
			   System.out.println("The median is "+ oddmedian);
		   }
	}
	sc.close();
	}
	}
