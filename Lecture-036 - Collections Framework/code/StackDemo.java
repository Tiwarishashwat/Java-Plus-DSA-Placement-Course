import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(7);
        stack.push(9);
        stack.push(1);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println("Raw");
        for(Integer i : stack){
            System.out.println(i);
        }
    }
}
