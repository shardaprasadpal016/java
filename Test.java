//static method

class Test
{
   static void show()
   {
System.out.println("1");

   }
}
class Abc extends Test
{
   void show()
   {
      System.out.println("2");
   }
   public static void main(String[] args) 
   {
      Abc ob= new Abc();
      ob.show();
   }
}