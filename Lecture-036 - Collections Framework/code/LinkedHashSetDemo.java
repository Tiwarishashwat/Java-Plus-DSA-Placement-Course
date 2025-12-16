import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(8);
        set.add(4);
        set.add(3);
        set.add(8);
        set.remove(8);
        for(Integer element : set){
            System.out.print(element + " ");
        }
//        set.remove(8);
        System.out.println(set.contains(10));
    }
}
