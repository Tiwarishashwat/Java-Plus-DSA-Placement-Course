import java.util.Stack;

// Array Impl
public class MyStack {
    int stack[];
    int top;
    int size;

    public MyStack(int stackSize){
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }
    // insert
    public void push(int element){
        if(top>=size-1){
            System.out.println("Stack is full - overflow");
            return;
        }
        top++;
        stack[top] = element;
    }

    public boolean isEmpty(){
        return top<=-1;
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    public int pop(){
        int val = peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }
    
    public void printStack(){
        System.out.println("Printing stack");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]);
            if(i!=top){
                System.out.print(",");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n=5; // take user input
        MyStack stack = new MyStack(n);
        System.out.println("isEmpty:"+  stack.isEmpty());
        stack.push(9);
        stack.printStack();
        stack.push(1);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.push(5);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(6);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("size:"+  stack.size());
        System.out.println("isEmpty:"+  stack.isEmpty());
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("peek:"+  stack.peek());

        //JC Stack
        Stack<Integer> myClass = new Stack<>();
        myClass.peek();
        myClass.push(7);
        myClass.pop();
        myClass.size();
        myClass.isEmpty();
    }
}










