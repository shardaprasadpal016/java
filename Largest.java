import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("ente the two num");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int num2=sc.nextInt();
 if(num1>num2)
 {
    System.out.println("num1 is largest");
 }
 else{
    System.out.println("num2 is largest");
 }
 sc.close();
 sc1.close();
    }

}
