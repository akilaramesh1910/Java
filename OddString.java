import java.util.Scanner;

public class OddString{
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Change(s);
    }
    public static void Change(String s){
        int length=s.length();
        for(int i=0;i<length;i++){
            int k=s.length()-1-i;
            for(int j=0;j<length;j++){
                if(j==i || j==k){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}