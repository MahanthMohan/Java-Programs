import java.util.Scanner;

public class PercentageCalc {

public static void main(String[] args) {
	// TODO Auto-generated Method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter your value");
double yourval = sc.nextInt();
System.out.println("Enter the total");
double total = sc.nextInt();
double Percentage = ((yourval/total)*100);
System.out.println("The percentage is "+ Percentage);
sc.close();
	}
}
