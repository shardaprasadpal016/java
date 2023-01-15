public class StaticBlockDemo 
{
    static
    {
        System.out.println("hello");

    }
    static{
        System.out.println("hello am 2nd block");
    }
    public static void main(String[] args)
     {
        System.out.println("I am in main method");
    }
    static{
        System.out.println("hi");
    }
}
