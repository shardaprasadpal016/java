public interface InterfaceMultiple 
{
public abstract void run();

}
interface i1
{
    public abstract void display();

}
class test implements InterfaceMultiple,i1
{
    public void  run()
    {
System.out.println("this is run method");
    }
    public void display()
    {
        System.out.println("this is display method");
    }
    public static void main(String[] args) {
        test t=new  test();
        t.run();
        t.display();
    }
}

