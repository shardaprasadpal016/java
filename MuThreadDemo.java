
//single task from multiple thread

public class MuThreadDemo extends Thread {
    public void run()
    {
        System.out.println("single task");
    }
    public static void main(String[] args) {
        MuThreadDemo mtd1=new MuThreadDemo();
        mtd1.start();
        MuThreadDemo mtd2=new MuThreadDemo();
        mtd2.start();
    }
}
