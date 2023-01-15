 //super class
 
 class SuperDemo {
    void show()
    {
        System.out.println("1");
    }
}
class test extends SuperDemo
{
    void show()
    {
   super.show();
    System.out.println("2");
}
public static void main(String[] args) 
{
    test t=new test();
    t.show();
}
}
