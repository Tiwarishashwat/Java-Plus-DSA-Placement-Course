import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(11);
        queue.offer(1);
        queue.poll();
        System.out.println(queue.peek());

//        Queue<Integer> maxPq = new PriorityQueue<>((a,b) -> (b-a));
        Queue<Integer> maxPq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1; //dec
            }
        });
        maxPq.offer(2);
        maxPq.offer(11);
        maxPq.offer(1);
//        maxPq.poll();
        System.out.println(maxPq.peek());
    }
}
