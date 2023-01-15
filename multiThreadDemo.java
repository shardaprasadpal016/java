// by Thread class

public class multiThreadDemo  extends Thread
{
    public void run()
    {
        System.out.println("thread task");

    }
    public static void main(String[] args) {
        multiThreadDemo mtd= new multiThreadDemo();
        mtd.start();
    }
    
}
