
 interface I1 {

public abstract void show();
 
}
interface I2
{
    void display();
}
class test implements I1,I2
{
    public void show()
    {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        test t=new test();
        t.show();
        // t.display();
    }
}

