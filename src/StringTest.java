public class StringTest {
    public static void main(String[] args) {
        String a = "Hello World ";
        String b = "Hello World ";
        String c = new String("Hello World ");

        System.out.println("a==b : " + (a == b));
        System.out.println("a eaquals b :" + a.equals(b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a equals c : "+ a.equals(c));

    }
}
