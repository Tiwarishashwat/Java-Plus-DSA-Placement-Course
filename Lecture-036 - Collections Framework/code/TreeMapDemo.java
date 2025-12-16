import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>((a,b) -> (b-a));
        map.put(2,"shikhar");
        map.put(1,"shashwat");
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
