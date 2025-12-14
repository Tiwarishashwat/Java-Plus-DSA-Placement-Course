public class MyHeap {
    int heapSize;
    int heap[];
    int capacity;
    MyHeap(int arr[]){
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }
    public void increaseCapacity(){
        capacity *=2; //double
        int newHeap[] = new int[capacity];
        for(int i=0;i<heapSize;i++){
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }
    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j]= temp;
    }
    public void heapify(int index){
        int largest = index;
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;
        if(leftChildIndex<heapSize && heap[leftChildIndex]>heap[largest]){
            largest = leftChildIndex;
        }
        if(rightChildIndex<heapSize && heap[rightChildIndex]>heap[largest]){
            largest = rightChildIndex;
        }
        if(largest!=index){
            swap(index,largest);
            heapify(largest);
        }
    }
    public void buildTree(){
        //  (N/2-1) to N
        for(int index = heapSize/2-1;index>=0;index--){
            heapify(index);
        }
    }

    public void extractMaxAndStore(){
        if(heapSize==0){
            System.out.println("Heap is empty");
            return;
        }
        int max = heap[0]; //store the root
        heap[0] = heap[heapSize-1];
        heap[heapSize-1] = max; //store in the last node
        heapSize--; //delete the last node
        heapify(0);
        return;
    }
    public void decreaseKey(int index, int newValue){
        if(index<0 || index>=heapSize || heap[index]<=newValue){
            System.out.println("wrong operation");
            return;
        }
        heap[index] = newValue;
        heapify(index);
    }
    public void insert(int newValue){
        if(heapSize+1>=capacity){
            increaseCapacity();
        }
        heapSize+=1;
        heap[heapSize-1] = newValue;
        int index = heapSize-1;
        while(index>0 && heap[index]>heap[(int)(Math.ceil(index/2.0)-1)]){
            swap(index,(int)(Math.ceil(index/2.0)-1));
            index = (int)(Math.ceil(index/2.0)-1);
        }

    }
    public int[] heapSort(){
        buildTree();
        int size = heapSize;
        for(int i=0;i<size;i++){
            extractMaxAndStore();
        }
        return heap;
    }
    public int extractMax(){
        if(heapSize==0){
            System.out.println("Heap is empty");
            return -1;
        }
        int max = heap[0]; //store the root
        heap[0] = heap[heapSize-1];
        heapSize--; //delete the last node
        heapify(0);
        return max;
    }

   public void increaseKey(int index, int newValue){
        if(index<0 || index>=heapSize || heap[index]>=newValue){
            System.out.println("wrong operation");
            return;
        }
        heap[index] = newValue;
       while(index>0 && heap[index]>heap[(int)(Math.ceil(index/2.0)-1)]){
           swap(index,(int)(Math.ceil(index/2.0)-1));
           index = (int)(Math.ceil(index/2.0)-1);
       }
   }

    public void printTree(){
        for(int i=0;i<heapSize;i++){
            System.out.print(heap[i] +", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,20,6,11};
        MyHeap heap = new MyHeap(arr);
        heap.printTree();
        int res[] = heap.heapSort();
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] +", ");
        }

//        heap.buildTree();
//        heap.printTree();
//
//        heap.increaseKey(4,15);
//        heap.printTree();
//        heap.decreaseKey(0,4);
//        heap.printTree();
//        System.out.println("removed max element is-> " + heap.extractMax());
//        heap.printTree();
//        heap.insert(18);
//        heap.printTree();
    }
}
