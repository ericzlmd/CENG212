import java.util.Scanner;

public class FeetToMeters
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the measurement in feet: ");
		double feet = in.nextDouble();

		double meters = feet / 0.305;
		System.out.println(feet + " feet is " + meters + " meters.");
	}
}