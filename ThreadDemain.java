public class ThreadDemain extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("daemon thread");
        }
        else{
        System.out.println("child thread");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("main thread");
        ThreadDemain td=new ThreadDemain();
        td.setDaemon(true);
        td.start();
    }
}