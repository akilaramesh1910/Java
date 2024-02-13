import java.util.*;;

public class RomanInteger {
    public static void main(String[] args) {
        System.out.println("Enter th roman letter's in capital: ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int value=RomantoInt(s1);
        System.out.println(value);
    }
    public static int RomantoInt(String s1){
        int ans=0;
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=0;i<s1.length();i++){
            if(i<s1.length()-1 && m.get(s1.charAt(i)) < m.get(s1.charAt(i+1))){
                ans-=m.get(s1.charAt(i));
            }
            else{
                ans+=m.get(s1.charAt(i));
            }
        }
        return ans;
    }
}