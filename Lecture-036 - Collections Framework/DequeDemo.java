import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offerFirst(10);
        deque.offerLast(9);
        deque.pollFirst();
        deque.poll();
        deque.pollLast();
        deque.offer(11);
        deque.offer(21);
        deque.offerFirst(101);
        deque.offerLast(91);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        for(Integer element : deque){
            System.out.print(element + " ");
        }
    }
}
