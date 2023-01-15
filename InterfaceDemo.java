
public interface InterfaceDemo {
public static final int a=10;
public abstract void show() ;
    //    default void display()
    //static void display()
    private void display()
    {
        System.out.println("1");
    }
}
   class test implements InterfaceDemo
   {
    
        public  void show()
        {
System.out.println("child mehtod 1");
        }
        public static void main(String[] args) {
            test t=new test();
            t.show();
        }
    }
   
  
    
    

