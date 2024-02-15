public class LengthOfLastWord{
    public static void main(String[] args) {
        String s1="Hello World hellllooo   ";
        int ans=lengthOfLastWord(s1);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String s) {
        String s1=s.strip();
        int length=0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)!=' '){
                length++;
            }
            else{
                break;
            }
        }
        return length;
    } 
}