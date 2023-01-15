class Animal1
{
    public void run()
    {
System.out.println("i am runing method");
    }
    public static void main(String [] args)
    {
        System.out.println("1");
    Animal1 tomy= new Animal1();
    
     tomy.run();
     tomy.eat();
     Bird b=new Bird();
     b.fly();
    }

     public void eat()
     {
        System.out.println("i am eat method");
     }
}
    class Bird
    {
        void fly()
        {
            System.out.println(" i am fly method");
        }
    }

