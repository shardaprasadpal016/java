abstract class vehiclle
{
     abstract void start();
}
class car extends vehiclle
{
   public void start()
    {
        System.out.println("car start with key");
    }
}
class scooter extends vehiclle
{
   public void start()
    {
        System.out.println("scooter start with kick");
    }
    public static void main(String[] args) {
        // vehiclle v=new vehiclle() ;
            
        car c=new car();
        c.start();
        scooter s=new scooter();
        s.start();
    }
}