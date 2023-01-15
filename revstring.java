import java.util.Scanner;
public class revstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String name=s.next();
        int length=name.length();
        String rev="";
        for(int i=length-1;i>=0;i--)
        {
          rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        s.close();
    }
}
