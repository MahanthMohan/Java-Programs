import java.util.Scanner;
import java.lang.Math;

public class LogCalc {

	static Double NaturalLog(Double value)
	{
		Double result = Math.log(value);
		return result;
	}

	static Double Log(Double value)
	{
		Double result = Math.log10(value);
		return result;
	}

	static Double e(Double value)
	{
		Double result = Math.pow(2.71828, value);
		return result;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LogCalc logcalc = new LogCalc();
			Scanner sc = new Scanner(System.in);
			System.out.println("What do you want to calculate - ln, log, or e:");
			String op = sc.next();

			if(op.equals("ln") == true) 
			{
				System.out.println("Enter a value:");
				Double value = sc.nextDouble();
				System.out.println(logcalc.NaturalLog(value));
			}
			else if(op.equals("log") == true) 
			{
				System.out.println("Enter a value:");
				Double value = sc.nextDouble();
				System.out.println(logcalc.Log(value));
			}
			else if(op.equals("e") == true) 
			{
				System.out.println("Enter a value:");
				Double value = sc.nextDouble();
				System.out.println(logcalc.e(value));
			}

			sc.close();

		}

}
