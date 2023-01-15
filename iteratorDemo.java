import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorDemo
{
    public static void main(String [] args)
    {
        List l=new ArrayList();
        l.add(100);
        l.add("deepak");
        l.add("sharda");
       // System.out.println(l);
        Iterator itr=l.iterator();
        while(itr.hasNext());
        {
            System.out.println(itr.next());
        }
    }
}