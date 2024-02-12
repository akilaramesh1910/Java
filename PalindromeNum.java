import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean value=isPalindrome(n);
        System.out.println(value);
    }
    public static boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int given_num=num;
        int new_num=0;
        while (num>0) {
            new_num=new_num*10+num%10;
            num/=10;
        }
        if(given_num==new_num){
            return true;
        }
        else{
            return false;
        }
    }
}
