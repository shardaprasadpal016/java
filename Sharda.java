interface Sharda
{
     public void show();

}
class test implements Sharda
{
    public void show()
    {
        System.out.println("1");
    }
    public static void main(String[] args) 
    {
        test t=new test();
        t.show();
        
    }
}