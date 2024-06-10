import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args){
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Anu", 70);
        map.put("Aarthi", 82);
        map.put("Mani", 55);

        // using some features of HashMap
        
        System.out.print(map + " ");
        System.out.println(map.get("Anu"));
        System.out.println(map.size());

        if(map.containsKey("Aarthi")){
            int age = map.get("Aarthi");
            System.out.println(age);
        }
        
        if(map.containsValue(55)){
            int age = map.get("Mani");
            System.out.println(age);
        }

        map.remove("Mani");

        System.out.println(map.containsKey("Mani"));

        System.out.println(map.get("Mani"));

        System.out.println(map.size());


        // copy one map data to another map

        HashMap<String, Integer> map1 = new HashMap<>(map);

        System.out.println(map1);
    }
}