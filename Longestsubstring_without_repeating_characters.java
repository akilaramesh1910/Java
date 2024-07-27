
import java.util.HashSet;
import java.util.Scanner;

public class Longestsubstring_without_repeating_characters{
    public static void main(String[] args){
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = FindLongestSubstring(s);
        System.out.println("Longestsubstring: " + result);
    }
    public static int FindLongestSubstring(String str){
        int start = 0;
        int end = 0;
        int length = Math.min(str.length(), 1);

        HashSet<Character> set = new HashSet<>();

        while(end < str.length()){
            char c = str.charAt(end);
            while(set.contains(c)){
                set.remove(str.charAt(start));
                start++;
            }
            set.add(c);

            int newLength = end - start + 1;

            length = Math.max(length, newLength);
            end++;
        }
        return length;
    }
}