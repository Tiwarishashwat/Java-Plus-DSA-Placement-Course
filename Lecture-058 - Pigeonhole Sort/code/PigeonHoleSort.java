public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3,0};
        printArray(arr,"original array");
        pigeonholeSort(arr);
        printArray(res,"sorted array");
    }
	
public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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

public static void pigeonholeSort(int arr[]){
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxEl){
                maxEl = arr[i];
            }
            if(arr[i]<minEl){
                minEl = arr[i];
            }
        }
        if(maxEl == Integer.MIN_VALUE || minEl == Integer.MAX_VALUE){
            System.out.println("Empty array");
            return;
        }

        int size = maxEl - minEl +1;
        int pigeonHole[] = new int[size];

        // find the count
        for(int i=0;i<n;i++){
            int index = arr[i] - minEl;
            pigeonHole[index]++;
        }
        printArray(pigeonHole,"pigeonHole array");
        int insertionIndex = 0;
        // fill the original array
        for(int j=0;j<size;j++){
            printArray(pigeonHole,"start of loop");
            while (pigeonHole[j]>0){
                arr[insertionIndex] = j + minEl;
                insertionIndex++;
                pigeonHole[j]--;
            }
            printArray(arr,"original array after update");
            printArray(pigeonHole,"end of loop");
        }

    }
}