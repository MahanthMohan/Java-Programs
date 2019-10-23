import java.util.Scanner;
import java.io.*;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;double result=0;double median=0;double median1=0;double mode=0;
		Scanner Data=new Scanner(System.in);
		System.out.println("Enter how many numbers are there in total");
		n=Data.nextInt();
		System.out.println("Enter the "+n+" numbers");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Data.nextInt();
		for(int i=0;i<n;i++)
		result=result+a[i];
		median=a[n/2];
		median1=a[((n/2)+((n/2)+1))/2];
	    System.out.println("Enter the arithmetic operation - Mean(1),Median(2)");
	    char operation=Data.next().charAt(0);
	    switch(operation)
	    {
	   case '1':
	    System.out.println("The average of these numbers is "+ result/n);
	    break;
	   case '2':System.out.println("Enter whether the no of no's entered are even or odd");
	   char subop=Data.next().charAt(0);
	   System.out.println("Even is 1, Odd is 2");
		   switch(subop)
		   {
		   case '1':
		   System.out.println("The median of these numbers is " + median);
		   case '2':
		   System.out.println("The median of these numbers is "+ median1);
		   break;
		   }
	   case '3':
		   if (operation>2)
		   {
			   System.out.println("Please enter a valid input");
		   }
		   
		   
	  
		   
	
		   
		
		  
		   
		   
		   
	   }
		

	}
}


