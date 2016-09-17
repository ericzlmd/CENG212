import java.util.Scanner;

public class CylinderVolume
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		final double PI = 3.14;
		double volume;
		double area;
		double rad;
		double len;

		System.out.println("Enter the radius and length of a cylinder: ");
		rad = in.nextDouble();
		len = in.nextDouble();

		area = rad * rad * PI;
		volume = area * len;

		System.out.println("The are is " + area);
		System.out.println("The volume is " + volume);
	}
}