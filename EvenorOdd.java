import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		// TODO Auto-generated Method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
	   int num = sc.nextInt();
	   if(num%2 == 0)
	   {
		   System.out.println("The number entered is even");
	   }
	   
	   else
	   {
		   System.out.println("The number entered is odd");
	   }
	   sc.close();
	}

}
