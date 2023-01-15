import java.util.Scanner;


public class DecesionStructure {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age=");
        age=sc.nextInt();
       if( age>18)
       {
        System.out.println("you are ready tovote");
       }
       else if(age==18)
       {
System.out.println(" congrates you are first time vote");
       }
       else
       {
        System.out.println("u are not for vote");
       }
       sc.close();

  }
}
