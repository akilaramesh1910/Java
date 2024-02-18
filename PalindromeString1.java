public class PalindromeString1 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Boolean result=isPalindrome(s);
        System.out.println(result);
    }
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        String s1=s.toLowerCase();
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z' || s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                s2+=s1.charAt(i);
            }
        }
        for(int i=0,j=s2.length()-1;i<j;i++,j--){
            if(s2.charAt(i)!=s2.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
