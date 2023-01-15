public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer("sharda Pal");
        StringBuffer sb=new StringBuffer();//16

        System.out.println(sb.capacity());
        sb.append("hello");                  //16
        System.out.println(sb.capacity());
        sb.append("sharda javaa");
        System.out.println(sb.capacity());//16*2+2 old capacity*2+2
        System.out.println(sb.length());

    }
}
