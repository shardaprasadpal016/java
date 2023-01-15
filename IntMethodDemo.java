public class IntMethodDemo {
    //void show(int a)
    //void show(Object a)
    //void show(StringBuffer a)
    void show(int a,float b)
    {
        // System.out.println("int method");
        // System.out.println("StringBuffer method");
        System.out.println("int float method");


    }
    void show(float b,int a)
    {
        System.out.println("String method");
    }
    public static void main(String[] args) {
        IntMethodDemo ob=new IntMethodDemo();
        //ob.show(20);
// ob.show("abc");
//ob.show('a');//data promotion
//ob.show("abc");
//ob.show(new StringBuffer("xyz"));
//ob.show(null);
ob.show(10,20.5f);
ob.show(10.55f,5 );
    }
}
