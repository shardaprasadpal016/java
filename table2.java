import java.util.Scanner;
class table2
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(i*j);
            }
            System.out.println();
        }
        s.close();
    }
}