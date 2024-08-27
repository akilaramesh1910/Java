
public class StringProb {
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        String s2 = new String("Hello, World!");
        String s3 = s1;
        String s4 = s2.intern();
        String s5 = "Hello, " + "World!";
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
    }
}
