import java.util.Scanner;

public class sum {
    public static void main(String[] args) 
    {
        Scanner s=new  Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is:"+sum);
        s.close();
    }
}
