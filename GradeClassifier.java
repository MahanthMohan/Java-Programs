import java.util.Scanner;
public class GradeClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yourscore,total,Percentage;
Scanner keyboard=new Scanner(System.in);
System.out.println("Enter your value");
yourscore=keyboard.nextInt();
System.out.println("Enter the total");
total=keyboard.nextInt();
Percentage=((yourscore/total)*100);
System.out.println("The percentage is "+ Percentage);
if(Percentage>=90)
{
	System.out.println("You have an A");
}
else if(Percentage>=80)
{
	System.out.println("You have a B");
}
else if(Percentage>=70)
{
	System.out.println("You have an C");
}
else if(Percentage>=60)
{
	System.out.println("You have an D");
}
else if(Percentage<60)
{
	System.out.println("You have a F(Fail)");
}
System.out.println("Thanks for calculating your grade and have a good day");

	}

}
