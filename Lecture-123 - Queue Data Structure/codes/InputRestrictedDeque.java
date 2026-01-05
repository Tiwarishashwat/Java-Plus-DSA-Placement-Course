public class InputRestrictedDeque extends MyDeque{
    InputRestrictedDeque(int capacity){
        super(capacity);
    }
    @Override
    public void insertAtFront(int val) {
       System.out.println("Insertion is not allowed at front");
    }

    public static void main(String[] args) {
        InputRestrictedDeque myDeque = new InputRestrictedDeque(5);
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
