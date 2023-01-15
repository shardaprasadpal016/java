public class ThreadMain extends Thread
{
    public void run()
    {
        try 
        {
          for(int i=0;i<=10;i++)
          {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
          }  
        } 
        catch (Exception e) 
        {
        System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
    ThreadMain tm=new ThreadMain();
    tm.start();  
    System.out.println(Thread.currentThread().getName());
    
    
    
    }
    
}
