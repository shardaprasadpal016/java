//Daemon thread  setDaemon isDaemon

public class DemainThreadDemo extends Thread
{
    public void run()
    {
         if(Thread.currentThread().isDaemon())
        {
            System.out.println("Demain threaed");

        }
        else
        {
            System.out.println("child threaed");

        }
    }
    public static void main(String[] args) 
    {
       System.out.println("main thread");
        DemainThreadDemo d=new DemainThreadDemo();
        d.setDaemon(true);
        d.start();
    }
}
