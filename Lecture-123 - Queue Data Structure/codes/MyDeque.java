class MyDeque {
        int size;
        int deque[];
        int capacity;
        int front;
        int rear;
        MyDeque(int capacity){
            this.capacity = capacity;
            deque = new int[capacity];
            front = rear = 0;
            size=0;
        }
        public boolean isFull(){
            return size ==capacity;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int peekFront(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[front];
        }

    public int peekRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        return deque[(rear-1 + capacity) % capacity];
    }

    public void insertAtFront(int val) {
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        front = (front-1 + capacity)%capacity;
        deque[front] = val;
        size++;
    }

    public void insertAtRear(int val) {
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        deque[rear] = val;
        rear = (rear+1) % capacity;
        size++;
    }

    public int deleteAtFront(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        int val = deque[front];
        front = (front+1) % capacity;
        size--;
        return val;
    }

    public int deleteAtRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        rear = (rear-1 + capacity) % capacity;
        int val = deque[rear];
        size--;
        return val;
    }

    public void printDeque(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        int i = front;
        for(int j=0;j<size;j++){
            System.out.print(deque[i] + " ");
            i = (i+1)%capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque(5);
        System.out.println("Print Deque");
        myDeque.printDeque();
        System.out.println("Insert 7 at front");
        myDeque.insertAtFront(7);
        System.out.println("Insert 9 at front");
        myDeque.insertAtFront(9);
        System.out.println("Insert 11 at front");
        myDeque.insertAtFront(11);
        System.out.println("Print Deque");
        myDeque.printDeque();
        System.out.println("Insert 16 at rear");
        myDeque.insertAtRear(16);
        System.out.println("Insert 19 at rear");
        myDeque.insertAtRear(19);
        System.out.println("Print Deque");
        myDeque.printDeque();
        System.out.println("Delete From Front");
        myDeque.deleteAtFront();
        System.out.println("Print Deque");
        myDeque.printDeque();
        System.out.println("PeekFront" +  myDeque.peekFront());
        System.out.println("PeekRear" + myDeque.peekRear());
        System.out.println("Delete From Front");
        myDeque.deleteAtFront();
        System.out.println("Delete From Rear");
        myDeque.deleteAtRear();
        System.out.println("Delete From Front");
        myDeque.deleteAtFront();
        System.out.println("Print Deque");
        myDeque.printDeque();
        System.out.println("Delete From Rear");
        myDeque.deleteAtRear();
        System.out.println("Print Deque");
        myDeque.printDeque();

    }



}



