import java.util.Stack;

public class Bracket{
    public static void main(String[] args) {
        String str="()[]{}";
        boolean ans=isValid(str);
        System.out.println(ans);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }
                else{
                    char top=stack.peek();
                    if(s.charAt(i)==')' && top=='(' || s.charAt(i)==']' && top=='[' || s.charAt(i)=='}' && top=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        } 
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
                     
                        

