class shape
{
    void draw()
    {
        System.out.println("cannot say shape type");
    }
}
class square extends shape{
    void draw()
    {
System.out.println("square shape");
    }
}
class Demo
{
    public static void main(String[] args) {
        shape r=new square();
        r.draw();
    }
}