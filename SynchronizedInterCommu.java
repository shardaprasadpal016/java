class SynchronizedInterCommu extends Thread
{
    int total=0;
    public void run() 
        {
            synchronized(this)
            {
            for(int i=1;i<=10;i++)
            {
                total=total+100;
            }
            this.notify();
        }
    }
    }
class MoveBookApp
{
    public static void main(String[] args) throws InterruptedException
    {
        SynchronizedInterCommu si=new SynchronizedInterCommu();
        si.start();
       // System.out.println("SynchronizedInterCommu : "+si.total +"rs");
synchronized(si)
{
    si.wait();
    System.out.println("SynchronizedInterCommu : "+si.total +"rs");
}
    }
}

