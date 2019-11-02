import java.util.Scanner;
public class PercentageCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yourval,total,Percentage;
Scanner keyboard=new Scanner(System.in);
System.out.println("Enter your value");
yourval=keyboard.nextInt();
System.out.println("Enter the total");
total=keyboard.nextInt();
Percentage=((yourval/total)*100);
System.out.println("The percentage is "+ Percentage);
	}

}
