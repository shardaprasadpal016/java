class InheritanceDemo {
    void eat()
    {
        System.out.println("i am eating");
    }

}
class black extends InheritanceDemo
{
    public static void main(String[] args) {
       black b=new black();
        b.eat();

    }
}
