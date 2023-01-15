import java.util.Scanner;
public class table 
 {
    public static void main(String[] args) {
        
        System.out.print("enter the number:");
        Scanner  sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t=0;
        for(int i=1;i<=10;i++)
        {
            t=num*i;
        System.out.println(t);
        
    }
    sc.close();
}
}
