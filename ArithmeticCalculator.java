import java.util.Scanner;
import java.lang.Math;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;double sum=0;
	Scanner keyboard=new Scanner(System.in);
	System.out.println("How many numbers are there in total?");
	int n=keyboard.nextInt();	
	int a[]=new int [n];
	System.out.println("Enter the "+ n + " numbers");
	for(i=0;i<n;i++)
    {
        a[i] = keyboard.nextInt();
        sum = sum + a[i];
    }
	System.out.println("Enter the operation - Mean(1), Median(2)");
	double oddmedian=a[((n+1)/2)];
	double evenmedian=a[((n/2)+(n/2)+1)/2];
    int operation=keyboard.nextInt();
	if(operation==1)
	{
		double mean=sum/n;
		System.out.println(mean);
	}
	else if(operation==2)
	{
		 if(n%2==0)
		   {
			   System.out.println("The median is "+ evenmedian);
		   }
		   else
		   {
			   System.out.println("The median is "+ oddmedian);
		   }
	}
	}
	}


	

	

