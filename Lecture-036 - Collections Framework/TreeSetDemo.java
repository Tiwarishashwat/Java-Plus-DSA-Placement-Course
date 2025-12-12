import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(8);
        set.add(4);
        set.add(3);
        set.add(8);
//        set.remove(8);
        for(Integer element : set){
            System.out.print(element + " ");
        }
//        set.remove(8);
        System.out.println(set.contains(10));


        Set<Integer> maxSet = new TreeSet<>((a,b) -> (b-a));
        maxSet.add(1);
        maxSet.add(8);
        maxSet.add(4);
        maxSet.add(3);
        maxSet.add(8);
//        maxSet.remove(8);
        for(Integer element : maxSet){
            System.out.print(element + " ");
        }
//        maxSet.remove(8);
        System.out.println(maxSet.contains(10));
    }
}
