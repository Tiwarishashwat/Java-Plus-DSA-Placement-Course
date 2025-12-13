public class MyLinkedList {
    public static void main(String[] args) {
      MyLinkedList obj = new MyLinkedList();
      obj.insertTail(10);
      obj.insertTail(20);
      obj.insertHead(5);
      obj.insertNode(40,5);
      obj.insertNode(40,4);
      obj.insertNode(35,4);
      obj.insertNode(68,5);
      obj.insertNode(78,6);
      obj.printList();
      obj.deleteTail();
      obj.printList();
      obj.deleteHead();
      obj.printList();
      obj.deleteNode(3);
      obj.printList();
      obj.deleteNode(1);
      obj.deleteNode(3);
      obj.printList();

    }
    Node<Integer> head;
    int size;
    MyLinkedList(){
        this.head = null;
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
                Node<Integer> newNode = new Node<>(data);
                Node<Integer> temp = head;
                while (counter<position-1 && temp!=null){
                    counter++;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
            System.out.println("Insertion successful at position " + position);
    }

    public void insertHead(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                System.out.println("Insertion at head is successful");
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            System.out.println("Insertion at head is successful");
            size++;
    }

    public void insertTail(int data){
        Node<Integer> newNode = new Node<>(data);
        if(head==null){
            head = newNode;
            System.out.println("Insertion at tail is successful");
            size++;
            return;
        }
        Node<Integer> temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Insertion at head is successful");
        size++;
    }

    public void deleteHead(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Deletion at head is successful");
        size--;
    }

    public void deleteTail(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            size--;
            System.out.println("Deletion at tail is successful");
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while (temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
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
            Node<Integer> prev = null;
            Node<Integer> temp = head;
            while (counter<position && temp!=null){
                counter++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            size--;
            System.out.println("Deletion successful at position " + position);
        }

    }

























    public void printList(){
        Node<Integer> temp = head;
        while (temp!=null){
            System.out.println("data is -> " + temp.data);
            temp = temp.next;
        }
    }



    public void updateNode(int position, int updatedValue){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        int counter=1;
        Node<Integer> temp = head;
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
        Node<Integer> temp = head;
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

class Node<T> {
    T data;
    Node next;
    Node(){
        this.next = null;
    }
    Node(T data){
        this.next = null;
        this.data = data;
    }

}
