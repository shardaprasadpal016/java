 abstract class AbstrVehicle {
   abstract void start();

}
class car extends AbstrVehicle
{
    void start()
    {
System.out.println(" car start with key");
    }
}
    class scooter extends AbstrVehicle
    {
    void start()
    {
        System.out.println("scooter start with kick");
    }
    public static void main(String[] args) {
           car c=new car();
           c.start();
           scooter sc=new scooter();
           sc.start();

        
    }
}


