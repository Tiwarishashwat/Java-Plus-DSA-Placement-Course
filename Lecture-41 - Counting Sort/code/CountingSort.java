public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3,0};
        printArray(arr,"original array");
        int res[] = countingSort(arr);
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
   public static int[] countingSort(int arr[]){
        // find K,
        int n = arr.length;
        int k = Integer.MIN_VALUE;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                k = arr[i];
            }
        }
        if(k==Integer.MIN_VALUE){
            System.out.println("Empty Value");
            return res;
        }

        int countArr[] = new int[k+1];

        // find the frequency
        for(int i=0;i<n;i++){
            int index = arr[i];
            countArr[index]+=1;
        }

        // find cumulative frequency
        for(int i=1;i<=k;i++){
            countArr[i] += countArr[i-1];
        }

        //find the sorted array
        for(int i=n-1;i>=0;i--){
            int val = arr[i];
            // a-- & --a
            int countVal = --countArr[val];
            res[countVal] = val;
        }
        return res;
    }
}