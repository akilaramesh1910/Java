public class Problem13 {
    public static void main(String[] args) {
        String s1 = new String("hai");
        StringBuffer s2 = new StringBuffer("hai");
        StringBuffer S3 = new StringBuffer("hai");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(S3));
    }
}
