public class PalindromeString {
    public static void main(String[] args) {
        String str="akjaka";
        int i,j;
        for(i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}
