public class MethodOverloadingDemo 
{
    void show(int a ,String b)
    {
        System.out.println("1");
    }
    void show(String b,int a)
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        MethodOverloadingDemo ob=new MethodOverloadingDemo();
       // ob.show(10);
    //    ob.show("a",10);
    ob.show(10,"a");

    }
}
