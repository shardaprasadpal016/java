//by Runnable interface

public  class MultiThreadRunnDemo  implements Runnable
{
    public void run()
    {
        System.out.println("runnable task 2");
    }
    public static void main(String[] args) {
        MultiThreadRunnDemo mtd=new MultiThreadRunnDemo();
        Thread th=new Thread(mtd);
        th.start(); 
    }
    
}
