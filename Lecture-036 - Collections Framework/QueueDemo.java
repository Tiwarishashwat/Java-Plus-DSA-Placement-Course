import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(7);
        queue.offer(8);
        queue.offer(11);
        queue.offer(1);
        queue.poll();
        System.out.println(queue.peek());
        for(Integer element : queue){
            System.out.print(element + " ");
        }

    }
}
