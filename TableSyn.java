public class TableSyn 
{
    void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }

}
class Thread1 extends Thread
{
    TableSyn t;
    Thread1(TableSyn t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class Thread2 extends Thread
{
    TableSyn t;
    Thread2(TableSyn t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(8);
    }
}
class Main{
    public static void main (String[] args) 
    
    {
        TableSyn obj=new TableSyn();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();

        
    }
}