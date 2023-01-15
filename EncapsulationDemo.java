import java.lang.module.ModuleDescriptor.Modifier;

class Teacher
{
   public String name;
   protected String tid;
private double salary;
String skill[];//default
Teacher()
{
    name="sharda";
    tid="201";
    salary=15000;
    skill=new String[]{"java","python"};
}
public void show()
{
    System.out.println("my name is "+name);
    System.out.println("my tid is "+tid);
    System.out.println("my salary is "+salary);

    System.out.println("my skill is "+skill[0]+","+skill[1]);

}
}
public class EncapsulationDemo {
    public static void main(String[] args) 
    {
        //access modifier
        //public 
        //proceted
        //private
       // non access Modifier
        //default
        //pacakage
        //getter and setter
         Teacher t1=new Teacher();
        // t1.name="sharda";
        // System.out.println(t1.name);
        // t1.tid="101";
        // System.out.println(t1.tid);
        // // t1.salary=15000;
        // // System.out.println(t1.salary);
        // t1.skill=new String[]{"java"};
        // System.out.println(t1.skill[0]);
      t1.show();
    }
}
