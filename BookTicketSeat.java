class BookTicketSeat 
{
    
        int total_seats=10;
      void  bookSeat(int seats)
        {
          if(total_seats>=seats)
        
 {
    System.out.println(seats+" booked successfully");
    total_seats=total_seats-seats;
    System.out.println("seats left: "+total_seats);
 }
      else
      {
        System.out.println("sorry  seat can not be booked");
          System.out.println("seats left: "+total_seats);

        }
        
    }
}
class MoveBookApp extends Thread
{
   static BookTicketSeat b;
   int seats;
public void run()
{
    b.bookSeat(seats);

}
public static void main(String[] args) 
{
    b=new BookTicketSeat();
MoveBookApp sharda=new MoveBookApp();
sharda.seats=7;
sharda.start();
MoveBookApp  santosh=new MoveBookApp();
santosh.seats=6;
santosh.start();
}
}
