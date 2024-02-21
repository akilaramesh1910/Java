public class ReverseString {
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s){
        for(int i=0,j=s.length-1;i<j+1/2;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        for(int m=0;m<s.length;m++){
            System.out.print(s[m] + " ");
        }
    }
}
