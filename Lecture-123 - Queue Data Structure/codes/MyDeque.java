public class MyDeque {

        int rear;
        int front;
        int size;
        int capacity;
        int deque[];

        public MyDeque(int capacity) {
            deque = new int[capacity];
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

        public int peekFront() {
            if (isEmpty()) {
                System.out.println("deque is empty");
                return -1;
            }
            return deque[front];
        }

    public int peekRear() {
        if (isEmpty()) {
            System.out.println("deque is empty");
            return -1;
        }
        return deque[rear];
    }

        public void enqueueRear(int val) {
            if (isFull()) {
                System.out.println("deque is full");
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
            deque[rear] = val;
        }
    public void enqueueFront(int val) {
        if (isFull()) {
            System.out.println("deque is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if(front==0 && rear!=capacity-1) { //circular insertion
            front=capacity-1;
        } else{ // normal case
            front--;
        }
        size++;
        deque[front] = val;
    }

        public int dequeueFront() {
            if (isEmpty()) {
                System.out.println("deque is empty");
                return -1;
            }
            int val = deque[front];
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

    public int dequeueRear() {
        if (isEmpty()) {
            System.out.println("deque is empty");
            return -1;
        }
        int val = deque[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if(rear==0){ // circular deletion
            rear=capacity-1;
        } else { // normal
            rear--;
        }
        size--;
        return val;
    }

        public int Size() {
            return size;
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("deque is empty");
                return;
            }
            // circular case
            if(rear<=front){
                for (int i = front; i <= capacity-1; i++) {
                    System.out.print(deque[i]);
                    System.out.print(",");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(deque[i]);
                    if (i != rear) {
                        System.out.print(",");
                    }
                }
            } else { // normal printing
                for (int i = front; i <= rear; i++) {
                    System.out.print(deque[i]);
                    if (i != rear) {
                        System.out.print(",");
                    }
                }
            }

            System.out.println();
        }

        public static void main(String[] args) {

            MyDeque MyDeque = new MyDeque(5);
            System.out.println("Capacity is: " + 5);
            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("Insert element Front:" + 7);
            MyDeque.enqueueFront(7);
            System.out.println("Peak Front element: " + MyDeque.peekFront());
            System.out.println("Insert element Rear:" + 8);
            MyDeque.enqueueRear(8);
            System.out.println("Peak Rear element: " + MyDeque.peekRear());
            System.out.println("Insert element Front:" + 9);
            MyDeque.enqueueFront(9);
            System.out.println("Peak Front element: " + MyDeque.peekFront());
            System.out.println("Insert element Rear:" + 11);
            MyDeque.enqueueRear(11);
            System.out.println("Insert element Front:" + 19);
            MyDeque.enqueueFront(19);
            System.out.println("Insert element Rear:" + 9);
            MyDeque.enqueueRear(9);
            System.out.println("is deque full: " + MyDeque.isFull());
            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("delete element Front");
            MyDeque.dequeueFront();
            System.out.println("is deque full: " + MyDeque.isFull());
            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("Insert element Rear:" + 19);
            MyDeque.enqueueRear(19);
            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("Peak element Rear: " + MyDeque.peekRear());
            System.out.println("delete Front element");
            MyDeque.dequeueFront();
            System.out.println("Peak element Rear: " + MyDeque.peekRear());

            System.out.println("is deque empty: " + MyDeque.isEmpty());

            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("delete Rear element");
            MyDeque.dequeueRear();
            System.out.println("delete Rear element");
            MyDeque.dequeueRear();
            System.out.println("delete Rear element");
            MyDeque.dequeueRear();
            System.out.println("delete Rear element");
            MyDeque.dequeueRear();
            System.out.println("is deque empty: " + MyDeque.isEmpty());
            System.out.println("Print:");
            MyDeque.printQueue();
            System.out.println("delete Front element");
            MyDeque.dequeueFront();
        }

    }
