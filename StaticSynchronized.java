    class StaticSynchronized
    {
       static  int total_seat=20;
      static synchronized  void bookSeat(int seats)
         {
            if(total_seat>=seats)
            {
                System.out.println(seats+"  seats successfully booked");
                total_seat=total_seat-seats;
                System.out.println(" seats left : "+total_seat);
            }
            else{
                System.out.println(seats+"  sorry cannot be booked seat");
                System.out.println(" seats left : "+total_seat);

            }
         }
    }
    class MyThread1 extends Thread
    {
      StaticSynchronized s;
      int seats;
      MyThread1(StaticSynchronized s,int seats)
      {
        this.s=s;
        this.seats=seats;
      }
      public void run()
      {
        s.bookSeat(seats);
      }}
      
    class MyThread2 extends Thread
    {
      StaticSynchronized s;
      int seats;
      MyThread2(StaticSynchronized s,int seats)
      {
        this.s=s;
        this.seats=seats;
      }
      public void run()
      {
        s.bookSeat(seats);
      }
    }
     class MoveBookApp
    {
        public static void main(String[] args) 
        {
            StaticSynchronized s1=new StaticSynchronized();
            MyThread1 t1=new MyThread1(s1, 7);
            t1.start();

            MyThread1 t2=new MyThread1(s1, 6);
            t2.start();

            //-----------------------
            StaticSynchronized s2=new StaticSynchronized();
            MyThread1 t3=new MyThread1(s2, 5);
            t3.start();

            MyThread2 t4=new MyThread2(s2, 9);
            t4.start();

        }
    }