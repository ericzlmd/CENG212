import java.util.Scanner;

public class PoundsToKilograms
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double lbs;
		double kgs;

		System.out.println("Please enter value in pounds: ");
		lbs = in.nextDouble();

		kgs = lbs * 0.454;

		System.out.println(lbs + " pounds is " + kgs + " kilograms");
	}
}