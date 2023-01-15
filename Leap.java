import java.util.Scanner;
class Leap  
{
    public static void main(String[] args)
     {
        System.out.println("enter  the  any year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        //  if(year%4==0)
        //  {
        //     if(year%100==0)
        //     {
        //        if(year%400==0)
        //   {
        //      System.out.println("leap year");
        //    }
        //  else{
        //  System.out.println("not leap year");
        //  }

        //     }
        //     else{
        //         System.out.println("leap year");
        //     }
        //  }
            
        //   else
        //   {
        //     System.out.println("not leap year");
        // }
        if((year%4==0)||(year%400==0 && year%100!=0))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
    }
    sc.close();
}
}