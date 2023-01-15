public class ThredSleepDemo extends Thread
{
 public void run()

 {
    try {
        
    
    for(int i=0;i<=10;i++)
    {
        System.out.println("Happy Birthday"+" "+Thread.currentThread().getName());
        Thread.sleep(2000);
        
    }
}
catch (Exception e) 
{
    System.out.println(e);
}
 }   
 public static void main(String[] args) {
    ThredSleepDemo thd=new ThredSleepDemo();
    thd.start();
    ThredSleepDemo  tsd=new ThredSleepDemo();
    tsd.start();
 }
}
