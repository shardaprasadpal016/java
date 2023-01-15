public class MainMethodOverloadDemo {
    public static void main(String[] args) {
    System.out.println("1");
    MainMethodOverloadDemo ob=new MainMethodOverloadDemo();
    ob.main(20);
    }
    public static void main(int a)
    {
        System.out.println("2");
    }
}
