import java.util.Scanner;
public class reverse {
 public static void main(String[] args) {
    System.out.println("enter the num");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int rem,rev=0;
    while(num>0)
    {
       rem= num%10;
        rev=rev*10+rem;
        num=num/10;
    }
    
        System.out.println(rev);
        sc.close();
 }   

 }