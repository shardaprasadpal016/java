class StaticMethodDemo
{
  // void display()
   static  void display()
   {
System.out.println("1");

   }
   public static void main(String[] args) {
     // StaticMethodDemo s=new StaticMethodDemo();
     // s.display();
     display();
     //StaticMethodDemo.display();
     xyz.show();
   }
}
class xyz
{
   static void show()
   {
      System.out.println("2");
   }
}