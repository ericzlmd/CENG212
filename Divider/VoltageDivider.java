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

public class VoltageDivider
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

	public static class Divider
	{
		private double inVoltTop;
		private double inVoltBot;
		private double outVolt;
		private double rTop;
		private double rBot;	
		private double outCurrent;

		// Constructor for Divider class

		/*****************************************************
			Empty constructor to enable instance declaration
					with empty OR no parameters included.
		******************************************************/

		public Divider()
		{
			
		}



		/******************************************************
			Constructor for taking values being thrown by user
				then tested if said values are within range
		*******************************************************/
		
		public Divider(double inVoltTop, double inVoltBot, double rTop, double rBot)
		{
			// pass user input to temp variable, and test variable if within range value
			double tempVoltTop = inVoltTop;
			while(inVoltTop < -20 || inVoltTop > 20)
			{
				System.out.println("Voltage 1 value is out of range(-20 to 20): ");
				inVoltTop = IO.readDouble();
			}
			this.inVoltTop = inVoltTop;

			// pass user input to temp variable, and test variable if within range value
			double tempVoltBot = inVoltBot;
			while(inVoltBot < -20 || inVoltBot > 20)
			{
				System.out.println("Voltage 2 value is out of range(-20 to 20): ");
				inVoltBot = IO.readDouble();
			}
			this.inVoltBot = inVoltBot;

			// pass user input to temp variable, and test variable if within range value
			double temprTop = rTop;
			while(rTop > 100000)
			{
				System.out.println("Resistor 1 value is out of range(100k ohms MAX): ");
				rTop = IO.readDouble();
			}
			this.rTop = rTop;

			// pass user input to temp variable, and test variable if within range value
			double temprBot = rBot;
			while(rBot > 100000)
			{
				System.out.println("Resistor 2 value is out of range(100k ohms MAX): ");
				rBot = IO.readDouble();
			}
			this.rBot = rBot;
		}



		/****************************
			inVoltTop setter/getter
		*****************************/

		public void set_inVoltTop(double inVoltTop)
		{
			// pass user input to temp variable, and test variable if within range value
			double tempVoltTop = inVoltTop;
			while(inVoltTop < -20 || inVoltTop > 20)
			{
				System.out.println("Voltage 1 value is out of range(-20 to 20): ");
				inVoltTop = IO.readDouble();
			}
			this.inVoltTop = inVoltTop;
		}
		public double get_inVoltTop()
		{
			return this.inVoltTop;
		}



		/****************************
			inVoltBot setter/getter
		*****************************/

		public void set_inVoltBot(double inVoltBot)
		{
			// pass user input to temp variable, and test variable if within range value
			double tempVoltBot = inVoltBot;
			while(inVoltBot < -20 || inVoltBot > 20)
			{
				System.out.println("Voltage 2 value is out of range(-20 to 20): ");
				inVoltBot = IO.readDouble();
			}
			this.inVoltBot = inVoltBot;
		}
		public double get_inVoltBot()
		{
			return this.inVoltBot;
		}



		/****************************
				rTop setter/getter
		*****************************/

		public void set_rTop(double rTop)
		{
			// pass user input to temp variable, and test variable if within range value
			double temprTop = rTop;
			while(rTop > 100000)
			{
				System.out.println("Resistor 1 value is out of range(100k ohms MAX): ");
				rTop = IO.readDouble();
			}	
			this.rTop = rTop;
		}
		public double get_rTop()
		{
			return this.rTop;
		}



		/****************************
				rBot setter/getter
		*****************************/

		public void set_rBot(double rBot)
		{
			// pass user input to temp variable, and test variable if within range value
			double temprBot = rBot;
			while(rBot > 100000)
			{
				System.out.println("Resistor 2 value is out of range(100k ohms MAX): ");
				rBot = IO.readDouble();
			}
			this.rBot = rBot;
		}
		public double get_rBot()
		{
			return this.rBot;
		}



		/******************************
				Divider.java methods

			* calc_DC_Voltage()
			* display_Data()
		*******************************/

		private void calc_DC_Voltage()
		{
			outVolt =  inVoltTop + (inVoltBot - inVoltTop) * (rTop / (rTop + rBot));
			outCurrent = (inVoltTop - outVolt) / rTop;
		}

		public void display_Data()
		{
			// calculate data
			calc_DC_Voltage();

			System.out.println("Voltage input 1: " + inVoltTop);
			System.out.println("Voltage input 2: " + inVoltBot);
			System.out.println("Resistor 1: " + rTop);
			System.out.println("Resistor 2: " + rBot);
			System.out.println("Total DC output voltage " + outVolt + "v");
			System.out.println("Total output current: " + outCurrent + "A");
		}
	}
}