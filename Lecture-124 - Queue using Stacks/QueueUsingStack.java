import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
//    public void enqueue(int val) {
//        stack1.push(val);
//    }
//    public int dequeue(){
//        if(stack1.isEmpty()){
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        int val = stack2.pop();
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return val;
//    }
//
//    public int peek(){
//        if(stack1.isEmpty()){
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        int val = stack2.peek();
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return val;
//    }
    public void enqueue(int val) {
        // move all elements from stack 1 to stack 2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // insert value in stack 1
        stack1.push(val);

        // move all elements from stack 2 to stack 1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    public int dequeue(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
       return stack1.pop();
    }

    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack1.peek();
    }
    public static void main(String[] args) {

//        Queue<Integer> queue = new LinkedList<>();
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Peek is " + queue.peek());
        System.out.println("DEQUEUE is " + queue.dequeue());
        queue.enqueue(7);
        System.out.println("Peek is " + queue.peek());



    }
}
