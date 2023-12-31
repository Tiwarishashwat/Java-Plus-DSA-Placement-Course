import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K,V> {
    class Node{
        K key;
        V value;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key +" : "+ value;
        }
    }
    private LinkedList<Node> hashTable[];
    private int elements;
    private int tableSize;
    private double threshold;

    private void initializeHashTable(){
        for(int i=0;i<tableSize;i++){
            hashTable[i] = new LinkedList<>();
        }
    }
    MyHashMap(){
        elements = 0;
        tableSize = 16;
        threshold = 0.75;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
    }
    private int getHashCode(K key){
        int hashcode = Objects.hash(key);
        hashcode = (Math.abs(hashcode))%tableSize;
        return hashcode;
    }

    private int searchKeyInList(K key, int hashcode){
        LinkedList<Node> list = hashTable[hashcode];
        for(int index = 0;index<list.size();index++){
            if(list.get(index).key.equals(key)){
                return index;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node> oldTable[] = hashTable;
        tableSize = 2*tableSize;
        elements = 0;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
        for(LinkedList<Node> list : oldTable) {
            for(Node node : list){
                put(node.key,node.value);
            }
        }
    }

    public void put(K key, V value){
        // find the hashcode
        int hashcode = getHashCode(key);
        int index = searchKeyInList(key, hashcode);
        Node node = new Node(key,value);
        if(index == -1){
            // insert
            hashTable[hashcode].add(0,node);
            elements++;
        }else {
            // update
            hashTable[hashcode].get(index).value = value;
        }
        if(elements/(double)tableSize >= threshold){
            rehash();
        }
    }

    public V get(K key){
        // find the hashcode
        int hashcode = getHashCode(key);
        int index = searchKeyInList(key, hashcode);
        if(index == -1){
            // insert
           return null;
        }else {
            // update
            return hashTable[hashcode].get(index).value;
        }
    }
    public boolean containsKey(K key){
        // find the hashcode
        int hashcode = getHashCode(key);
        int index = searchKeyInList(key, hashcode);
        if(index == -1){
            // insert
            return false;
        }else {
            // update
            return true;
        }
    }

    public boolean containsValue(V value){
        for(int i=0;i<tableSize;i++){
            for(Node node : hashTable[i]){
                if(node.value.equals(value)){
                    return true;
                }
            }
        }
        return false;
    }

    public V remove(K key){
        // find the hashcode
        int hashcode = getHashCode(key);
        int index = searchKeyInList(key, hashcode);
        if(index == -1){
           return null;
        }else {
            V value =  hashTable[hashcode].get(index).value;
            hashTable[hashcode].remove(index);
            elements--;
            return value;
        }
    }

    public void iterate(){
        for(int i=0;i<tableSize;i++){
            for(Node node : hashTable[i]){
                System.out.println(node);
            }
        }
    }

    public boolean isEmpty(){
        return (elements==0);
    }

    public int size(){
        return elements;
    }

}










