public class OutputRestrictedDeque extends MyDeque{
    OutputRestrictedDeque(int capacity) {
        super(capacity);
    }
    @Override
    public int deleteAtRear(){
        System.out.println("Deletion is not allowed at rear");
        return -1;
    }
    public static void main(String[] args) {
        OutputRestrictedDeque myDeque = new OutputRestrictedDeque(5);
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
