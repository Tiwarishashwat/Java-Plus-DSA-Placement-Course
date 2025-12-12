import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"shashwat");
        map.put(2,"shikhar");
        map.put(7,"rajesh");
        map.put(17,"dinesh");

        System.out.println(map.containsKey(19));
        System.out.println(map.containsValue("shashwat"));

        String fullName = map.get(17) + " pandit";
        map.put(17, fullName);

        String defaultName = map.getOrDefault(90,"Rahul") + " tiwari";
        map.put(90, defaultName);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
//        System.out.println("Print using keys");
//        for(Integer key : map.keySet()){
//            System.out.println(key + " -> " + map.get(key));
//        }
//
//        System.out.println("Print using values");
//        for(String name : map.values()){
//            System.out.println(name);
//        }




    }
}
