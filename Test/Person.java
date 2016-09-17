public class Person
{
   private String name;
   private int age;
   private double salary;



   /**
      empty constructor necessary for
      instance declaration.
   */
   public Person()
   {

   }

   public Person(String name, int age, double salary)
   {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }



   public void set_name(String name)
   {
      this.name = name;
   }
   public String get_name()
   {
      return name;
   }

   public void set_age(int age)
   {
      this.age = age;
   }
   public int get_age()
   {
      return age;
   }

   public void set_salary(double salary)
   {
      this.salary = salary;
   }
   public double get_salary()
   {
      return salary;
   }
}
