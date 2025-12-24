import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyCollege{
    int regNo;
    private int hashCode;
    MyCollege(int regNo){
        this.regNo = regNo;
        this.hashCode = Objects.hashCode(regNo);
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        MyCollege college = (MyCollege) obj;
        return this.regNo == college.regNo;
    }
}

class MyRanking{
    int rank;
    MyRanking(int rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ""+this.rank;
    }

    @Override
    public boolean equals(Object obj) {
        MyRanking r = (MyRanking) obj;
        return this.rank == r.rank;
    }
}

public class MyHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Shashwat");
        myMap.put(2,"Pavleen");
        myMap.put(3,"aashray");
        myMap.put(4,"ayush");
        System.out.println(myMap);
        myMap.put(2,"Shivansh");
        System.out.println(myMap);
        System.out.println(myMap.get(5));
        System.out.println(myMap.containsKey(1));
        System.out.println(myMap.getOrDefault(5,"Not Present"));
        myMap.replace(5,"pavleen");
        System.out.println(myMap);
        for(Map.Entry<Integer,String> entry : myMap.entrySet()){
            System.out.println("Key -> "+ entry.getKey());
            System.out.println("Value -> " + entry.getValue());
        }
        for(Integer key : myMap.keySet()){
            System.out.println("Key -> "+ key);
            System.out.println("Value -> " + myMap.get(key));
        }
        MyHashMap<Integer,Integer> collegeRankingMap = new MyHashMap<>();
        collegeRankingMap.put(111,1);
        collegeRankingMap.put(312,2);
        collegeRankingMap.put(457,3);
        System.out.println(collegeRankingMap.get(111));
        System.out.println(collegeRankingMap.containsValue(1));
        // Custom Key-Value Pair
        MyHashMap<MyCollege,MyRanking> collegeRankingMap2 = new MyHashMap<>();
        collegeRankingMap2.put(new MyCollege(111),new MyRanking(1));
        collegeRankingMap2.put(new MyCollege(312),new MyRanking(2));
        collegeRankingMap2.put(new MyCollege(457),new MyRanking(3));
        System.out.println(collegeRankingMap2.get(new MyCollege(111)));
        System.out.println(collegeRankingMap2.containsValue(new MyRanking(1)));
    }
}












