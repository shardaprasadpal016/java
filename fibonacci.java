public class fibonacci {
    public static void main(String[] args) {
        int a=3,b=4,c;
        for(int i=1;i<=6;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
