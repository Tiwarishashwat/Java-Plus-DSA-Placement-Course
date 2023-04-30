public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3,0};
        printArray(arr,"original array");
        insertionSort(arr);
        printArray(arr,"sorted array");

    }
    public static void printArray(int arr[], String message){
        System.out.println("Printing " + message);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
public static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            // shifting logic
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            // place the key at j+1
            arr[j+1] = key;
        }
    }
}