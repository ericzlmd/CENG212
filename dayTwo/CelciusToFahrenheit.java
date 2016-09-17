import java.util.Scanner;

public class CelciusToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double fahrenheit;

		System.out.println("Please enter a degree in Celcius: ");
		double deg = in.nextDouble();

		fahrenheit = ((9.0 / 5) * deg) + 32;
		/*
		One of the given should be a doulbe (i.e. 9.0/5 or 9/5.0)
		Or else, decimal places will be truncated
		*/


		System.out.println(deg + " C : " + fahrenheit + " F");
	}
}