public class ThreadSet  extends Thread
{
    public void run()
    {
        try {
            for(int i=0;i<=10;i++)
            {
                System.out.println("sp");
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("sharda prasad");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Sharda prasad");
        System.out.println(Thread.currentThread().getName());

        ThreadSet ts=new ThreadSet();
        ts.start();
    }
}
