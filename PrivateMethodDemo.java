class PrivateMethodDemo
 {
    private void show() 
    {
        System.out.println("1");

    }
}

class Test extends PrivateMethodDemo
  {
    void show()
     {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}