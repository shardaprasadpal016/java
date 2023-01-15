  
  //multiple task from multiple theread
  public class MulThredTask extends Thread{
    public void run()
    {
        System.out.println("single task2");
    }
} class Mythred2 extends Thread{
    public void run()
    {
        System.out.println("single task2");
    }
}
class Main
{
    public static void main(String[] args) {
        MulThredTask t1=new MulThredTask();
        t1.start();
        Mythred2 t2=new Mythred2();
        t2.start();
    }
}
