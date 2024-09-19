
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberCombination {
    public static void main(String[] args) {
        String nums = "23";
        System.out.println(FindCombination(nums));
    }
    public static List<String> FindCombination(String letters){
        List<String> list1 = new ArrayList<>();

        if(letters == null || letters.isEmpty()){
            return list1;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        list1.add("");

        for(char letter:  letters.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String combo: list1){
                for(char value: map.get(letter).toCharArray() ){
                    temp.add(combo + value);
                }
            }
            list1 = temp;
        }

        return list1;
    }
}
