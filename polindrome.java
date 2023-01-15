import java.util.Scanner;
public class polindrome
 {
 public static void main(String[] args) 
 {
    System.out.println("enter the num");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int r,sum=0,c;
    c=num;
    while(num>0)
    {
       r= num%10;
        sum=(sum*10)+r;
        num=num/10;
    }
    if(c==sum)
    {
        System.out.println("num is polindrome");

    }
    else
    {
        System.out.println("num is not polindrome");
    }
    sc.close();
 }   
}
