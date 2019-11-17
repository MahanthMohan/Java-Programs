import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		   System.out.println("Enter a number to check whether it is even or odd");
	   int num=keyboard.nextInt();
	   if(num%2==0)
	   {
		   System.out.println("The number entered is even");
	   }
	   else
	   {
		   System.out.println("The number entered is odd");
	   }
		

	}

}
