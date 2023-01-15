import java.util.Scanner;

public class subfun {
    public static int CalculateSub(int a ,int b)
    {
        int sub=a-b;
    
        return  sub;

    }
    public static void main(String[] args)
     
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two number");
        int a=s.nextInt();
        int b=s.nextInt();
        int sub=CalculateSub(a,b);
        System.out.println(sub);

        
        s.close();
    }
}
