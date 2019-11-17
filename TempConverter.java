import java.util.Scanner;
public class TempConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		double x;
		System.out.println("Enter the temperature");
		double temp=keyboard.nextInt();
		System.out.println("What is the unit of measurement? - C(1),F(2)");
		int unit=keyboard.nextInt();
		if(unit==1)
		{
			System.out.println("What scale do you want to convert to - F(1),C(2)");
			int convunit=keyboard.nextInt();
			if (convunit==1)
			{
			x=(1.8*temp)+32;
			System.out.println(x+" degree fahrenheit");
			}
			else if(convunit==2)
			{
			System.out.println(temp+"  degree centigrade");	
			}
		}
		if(unit==2)
		{
			System.out.println("What scale do you want to convert to - F(1),C(2)");
			int convunit=keyboard.nextInt();
			if (convunit==1)
			{
			System.out.println(temp+" degree fahrenheit");
			}
			else if(convunit==2)
			{
			x=5/9*(temp-32);
			System.out.println(x+" degree centigrade");
			}
		}
			keyboard.close();
		}
		

		
		
		

	}


