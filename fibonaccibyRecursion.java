public class fibonaccibyRecursion
{
static int a=0,b=1,c;
 
    public static void main(String[] args) {
        System.out.println(a+" "+b);
    
    fibonaccibyRecursion ob=new fibonaccibyRecursion();
    ob.printfib(10);
    }
    void printfib(int i)
    {
        if(i>=1)
    
    
    {
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        printfib(i-1);
    }
}
}
