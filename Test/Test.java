import java.util.Scanner; // Scanner

public class Test
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      String name;
      String address;
      int age;
      double salary;

      Person per1 = new Person();

      System.out.println("Please enter your name: ");
      name = IO.readString();
      per1.set_name(name);             // using setters

      System.out.println("Please enter your address: ");
      address = in.nextLine();
      per1.set_address(address);

      System.out.println("Please enter your age: ");
      age = IO.readInt();
      per1.set_age(age);               // using setters

      System.out.println("Please enter your salary: ");
      salary = IO.readDouble();
      per1.set_salary(salary);         // using setters



      /**
      prints everything set by user input
      */
      System.out.println();
      System.out.println("*********************************");
      System.out.println("Name: " + per1.get_name());
      System.out.println("Address: " + per1.get_address());
      System.out.println("Age: " + per1.get_age());
      System.out.println("Salary: " + per1.get_salary());
      System.out.println("*********************************");
   }
}
