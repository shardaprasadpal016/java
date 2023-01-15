public class SynchronizedBlock
{
    int total_seat=100;

    
     void bookSeat( int seats)
    {
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
synchronized(this)
{
    if(total_seat>=seats)
    {
        System.out.println(seats+" seats successfully booked");
        total_seat=total_seat-seats;
        System.out.println("left seat :"+total_seat);
    }
    else{
        System.out.println("sorry can not book seat");
        System.out.println("left seat :"+total_seat);

    }
}
      
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());
        System.out.println("hi  :"+Thread.currentThread().getName());

    }
}
 class MoveBookApp extends Thread
{
static SynchronizedBlock s;
int seats;

    public void run()
     {
        s.bookSeat(seats);
    }
    public static void main(String[] args) {
        s=new SynchronizedBlock();
        MoveBookApp sharda=new MoveBookApp();
        sharda.seats=25;
        sharda.start();
        MoveBookApp santosh=new MoveBookApp();
        santosh.seats=40;
        santosh.start();
        MoveBookApp ajay=new MoveBookApp();
        ajay.seats=50;
        ajay.start();
    }
}



