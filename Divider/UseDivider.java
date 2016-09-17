/**********************************
File name: Divider.java
@Author: Eric Julius V. Zalameda
Student number: N00617545
Course: CENG212
Email: ericzlmd@gmail.com
@version: JDK 1.8.0_101
@since: September 16, 2016

@description UseDivider.java will use Divider.java template to 
input voltage and resistor values input by the user, and compute
for output voltage and output current.
***********************************/

public class UseDivider
{
	public static void main(String[] args)
	{
		// declare variable for user input
		double inVoltTop;
		double inVoltBot;
		double rTop;
		double rBot;

		// declare instance of Divider class
		Divider newDiv1 = new Divider();

		// prompt user for voltage and resistor inputs
		System.out.println("Enter input voltage 1: ");
		inVoltTop = IO.readDouble();
		newDiv1.set_inVoltTop(inVoltTop);

		System.out.println("Enter input voltage 2: ");
		inVoltBot = IO.readDouble();
		newDiv1.set_inVoltBot(inVoltBot);

		System.out.println("Enter resistor 1 value: ");
		rTop = IO.readDouble();
		newDiv1.set_rTop(rTop);

		System.out.println("Enter resistor 2 value: ");
		rBot = IO.readDouble();
		newDiv1.set_rBot(rBot);

		// calculate and display all data
		newDiv1.display_Data();
	}
}