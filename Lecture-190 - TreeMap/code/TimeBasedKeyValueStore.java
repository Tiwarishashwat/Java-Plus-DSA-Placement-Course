import java.util.*;
class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new TreeMap<>());
        }
        TreeMap<Integer,String> subMap = map.get(key);
        subMap.put(timestamp,value);
        //key -> time -> value
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
           return "";
        }
        TreeMap<Integer,String> subMap = map.get(key);
        Integer prevTime = subMap.floorKey(timestamp);
        if(prevTime==null){
            return "";
        }
        return subMap.get(prevTime);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */