public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3,0};
        printArray(arr,"original array");
        selectionSort(arr);
        printArray(arr,"sorted array");
	  biDirectionalSelectionSort(arr);
        printArray(arr,"sorted array");
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
public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minEl = arr[i];
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < minEl){
                    minEl = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
public static void biDirectionalSelectionSort(int arr[]){
        int n = arr.length;
        int k = n-1;
        for(int i=0;i<k;i++){
            int minEl = arr[i];
            int minIndex = i;
            int maxEl = arr[i];
            int maxIndex = i;
            for(int j=i+1;j<=k;j++){
                if(arr[j] < minEl){
                    minEl = arr[j];
                    minIndex = j;
                } else if(arr[j] > maxEl){
                    maxEl = arr[j];
                    maxIndex = j;
                }
            }
            // swap min element.
            swap(arr,i,minIndex);
            // swap max element.
            if(maxEl == arr[minIndex]){
                swap(arr,k,minIndex);
            } else {
                swap(arr,k,maxIndex);
            }
            k--;
        }
    }
}