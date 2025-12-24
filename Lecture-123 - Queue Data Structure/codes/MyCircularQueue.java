public class MyCircularQueue {

    int rear;
    int front;
    int size;
    int capacity;
    int circularQueue[];

    public MyCircularQueue(int capacity) {
        circularQueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((front==0 && rear == capacity - 1) ||(front!=0 && rear==(front-1)%(capacity))) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("circularQueue is empty");
            return -1;
        }
        return circularQueue[front];
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("circularQueue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if(rear==capacity-1 && front!=0) { //circular insertion
            rear=0;
        } else{ // normal case
            rear++;
        }
        size++;
        circularQueue[rear] = val;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("circularQueue is empty");
            return -1;
        }
        int val = circularQueue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if(front==capacity-1){ // circular deletion
            front=0;
        } else { // normal
            front++;
        }
        size--;
        return val;
    }

    public int Size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("circularQueue is empty");
            return;
        }
        // circular case
        if(rear<=front){
            for (int i = front; i <= capacity-1; i++) {
                System.out.print(circularQueue[i]);
                System.out.print(",");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(circularQueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }
        } else { // normal printing
            for (int i = front; i <= rear; i++) {
                System.out.print(circularQueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }
        }

        System.out.println();


    }

    public static void main(String[] args) {

        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        System.out.println("Capacity is: " + 5);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 7);
        myCircularQueue.enqueue(7);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 8);
        myCircularQueue.enqueue(8);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 11);
        myCircularQueue.enqueue(11);
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("is CircularQueue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is CircularQueue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("Peak element: " + myCircularQueue.peek());

        System.out.println("is CircularQueue empty: " + myCircularQueue.isEmpty());

        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is CircularQueue empty: " + myCircularQueue.isEmpty());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
    }

}











