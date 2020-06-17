import java.util.Scanner;

public class TempConverter {

static Scanner sc = new Scanner(System.in);

	static Double getFahrenheit(Double celsius)
	{
		Double fahrenheit = (1.8 * celsius) + 32;
		return fahrenheit;
	}

	static Double getCelsius(double fahrenheit)
	{
		Double Celsius = (5 * (fahrenheit - 32)) / 9;
		return Celsius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Temperature:");
		double temp = sc.nextDouble();
		System.out.println("What is the unit of measurement?: ");
		String unit = sc.next();

		if(unit.equals("F"))
		{
			System.out.println(getCelsius(temp));
		}
		if(unit.equals("C"))
		{
			System.out.println(getFahrenheit(temp));
		}

		sc.close();
	}


}


