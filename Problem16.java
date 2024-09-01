public class Problem16 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").insert(1, "bbbbb").insert(4, "ccc").insert(6, "e");

        System.out.println(sb);
    }
}
