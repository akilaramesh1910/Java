import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the num(positive/negative): ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("You entered: " + num);
        int value=ReverseNumber(num);
        System.out.println("Reversed number: " + value);
    }
    public static int ReverseNumber(int num){
        long reverse=0;  
        int stored_num=num;  
        if(num<0){
            num=-num;
        }
        while (num!=0) {
            reverse=reverse*10+num%10;
            num/=10;
        }
        if(stored_num<0){
            reverse=-reverse;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}
