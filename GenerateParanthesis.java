import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int value = 4;
        List<String> result = generateParenthesis(value);

        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n){
        List<String> list1 = new ArrayList<>();
        int open = 0;
        int close = 0;
        String current = "";

        paranthesis(list1, current, open, close, n);

        return list1;
    }

    public static  void paranthesis(List<String> list1, String current, int open, int close, int n){

        if(current.length() == n * 2){
            list1.add(current);
            return;
        }

        if( open < n ){
            paranthesis(list1, current + "(", open + 1, close, n);
        }

        if( close < open){
            paranthesis(list1, current + ")", open , close + 1, n);
        }

    }
}
