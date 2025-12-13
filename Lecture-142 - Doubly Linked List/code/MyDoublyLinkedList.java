public class MyDoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList obj = new MyDoublyLinkedList();
        obj.insertTail(10);
//        obj.printList();
        obj.insertTail(20);
//        obj.printList();
        obj.insertHead(5);
//        obj.printList();
        obj.insertNode(40,5);
//        obj.printList();
        obj.insertNode(40,4);
//        obj.printList();
        obj.insertNode(35,4);
//        obj.printList();
        obj.insertNode(68,5);
//        obj.printList();
        obj.insertNode(78,6);
//        obj.printList();
//        System.out.println("-----------------------------------------");
//        obj.printListInReverse();
//        obj.deleteTail();
//        obj.printList();
//        obj.deleteHead();
//        obj.printList();
//        obj.deleteNode(3);
//        obj.printList();
//        obj.deleteNode(1);
//        obj.deleteNode(3);
        obj.printList();
//        System.out.println("-----------------------------------------");
//        obj.printListInReverse();

        obj.updateNode(2,100);
        obj.printList();

        obj.searchNode(100);

    }
    DoublyNode<Integer> head;
    DoublyNode<Integer> tail;
    int size;
    MyDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertNode(int data, int position){
        if(position>size+1 || position <= 0){
            System.out.println("Wrong input");
            return;
        }
        // head
        if(position==1){
            insertHead(data);
        } else if(position==size+1){
            insertTail(data);
        } else {
            int counter=1;
            DoublyNode<Integer> newNode = new DoublyNode<>(data);
            DoublyNode<Integer> temp = head;
            while (counter<position-1 && temp!=null){
                counter++;
                temp = temp.next;
            }
            DoublyNode<Integer> currentNode = temp.next;

            newNode.next = currentNode;
            currentNode.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            size++;
            System.out.println("Insertion successful at position " + position);
        }

    }

    public void insertHead(int data){
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            System.out.println("Insertion at head is successful");
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        System.out.println("Insertion at head is successful");
        size++;
    }

    public void insertTail(int data){
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            System.out.println("Insertion at tail is successful");
            size++;
            return;
        }
        DoublyNode<Integer> temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        System.out.println("Insertion at tail is successful");
        size++;
    }


    public void deleteHead(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        DoublyNode<Integer> temp = head;
        head = head.next;
        temp.next = null;
        if(head==null){
            tail = null;
        } else {
            head.prev = null;
        }
        System.out.println("Deletion at head is successful");
        size--;
    }

    public void deleteTail(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        // single node
        if(head.next==null){
            head = null;
            tail = null;
            size--;
            System.out.println("Deletion at tail is successful");
            return;
        }
        DoublyNode<Integer> temp = head;
        DoublyNode<Integer> prevNode = null;
        while (temp.next!=null){
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
        temp.prev = null;
        tail = prevNode;
        System.out.println("Deletion at tail is successful");
        size--;
    }

    public void deleteNode(int position){
        if(position>size || position <= 0){
            System.out.println("Wrong input");
            return;
        }
        // head
        if(position==1){
            deleteHead();
        } else if(position==size){
            deleteTail();
        } else {
            int counter=1;
            DoublyNode<Integer> prevNode = null;
            DoublyNode<Integer> temp = head;
            while (counter<position && temp!=null){
                counter++;
                prevNode = temp;
                temp = temp.next;
            }
            DoublyNode<Integer> nextNode = temp.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            temp.prev = null;
            temp.next = null;
            size--;
            System.out.println("Deletion successful at position " + position);
        }

    }
























    public void printList(){
        DoublyNode<Integer> temp = head;
        while (temp!=null){
            System.out.println("data is -> " + temp.data);
            temp = temp.next;
        }
    }

    public void printListInReverse(){
        DoublyNode<Integer> temp = tail;
        while (temp!=null){
            System.out.println("data is -> " + temp.data);
            temp = temp.prev;
        }
    }



    public void updateNode(int position, int updatedValue){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        int counter=1;
        DoublyNode<Integer> temp = head;
        while (counter<position && temp!=null){
            counter++;
            temp = temp.next;
        }
        if(temp!=null && counter==position){
            temp.data = updatedValue;
        } else {
            System.out.println("Size of linked list is smaller than position " +position);
            return;
        }
        System.out.println("Update at position " + position + "was successful");
    }

    public boolean searchNode(int searchedValue){
        if(head==null){
            System.out.println("Linked list is empty");
            return false;
        }
        int counter=1;
        DoublyNode<Integer> temp = head;
        while (temp!=null){
            if(temp.data == searchedValue) {
                System.out.println("found at position " + counter + "was successful");
                return true;
            }
            counter++;
            temp = temp.next;
        }
        System.out.println("Not found");
        return false;
    }



}

class DoublyNode<T> {
    T data;
    DoublyNode next;
    DoublyNode prev;
    DoublyNode(){
        this.next = null;
        this.prev = null;
    }
    DoublyNode(T data){
        this.next = null;
        this.data = data;
        this.prev = null;
    }

}

