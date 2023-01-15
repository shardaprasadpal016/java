class Singleinherit {
    void show()
    {
        System.out.println("a class show");
    }

}
class black extends Singleinherit
{
    void show()
    {
        System.out.println("b class show");
    }
    public static void main(String[] args) {
        Singleinherit ob1=new Singleinherit();
        ob1.show();
        black b=new black();
        b.show();
    }
}
