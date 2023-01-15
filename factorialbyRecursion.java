import java.util.Scanner;

public class factorialbyRecursion 
{       static int fact=1;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int no=sc.nextInt();

        factorialbyRecursion fr=new factorialbyRecursion();
        fr.calcFact(no);

        System.out.println("factorial of "+no+" is "+fact);
    }
    void calcFact(int no)
    {
        if(no>=1)
        {
            fact=fact*no;
            calcFact(no-1);
        }
    
    }
    
}
