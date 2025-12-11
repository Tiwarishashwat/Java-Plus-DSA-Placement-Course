import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(6);
        System.out.println(set);
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        System.out.println(set.contains(4));
        System.out.println(set.remove(4));
        System.out.println(set);
        for (Integer i:set) {
            System.out.println(i);
//            set.remove(i);
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }

    }
}








