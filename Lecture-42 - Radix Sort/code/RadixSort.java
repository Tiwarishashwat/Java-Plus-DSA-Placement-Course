public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3,0};
        printArray(arr,"original array");
        radixSort(arr);
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

 public static void countingSortWithDigit(int arr[], int digit){
        // find K,
        int n = arr.length;
        int k = 9;
        int res[] = new int[n];

        int countArr[] = new int[k+1];

        System.out.println("value of digit is "+ digit);
        // find the frequency
        for(int i=0;i<n;i++){
            int index = (arr[i]/digit)%10;
            System.out.println("element is "+ arr[i] + "digit is "+ index);
            countArr[index]+=1;
        }
        printArray(countArr,"count array");

        // find cumulative frequency
        for(int i=1;i<=k;i++){
            countArr[i] += countArr[i-1];
        }

        printArray(countArr,"count array with cumulative frequency");
        printArray(arr,"original array");
        //find the sorted array
        for(int i=n-1;i>=0;i--){
            int val = arr[i];
            System.out.println("Value is "+ val);
            // a-- & --a
            int countIndex = (arr[i]/digit)%10;
            System.out.println("Index in count array "+ countIndex);
            int countVal = --countArr[countIndex];
            System.out.print("Element "+ val +" placed at index "+countVal);
            res[countVal] = val;
        }

        // copy back to original array
        for(int i =0;i<n;i++){
            arr[i] = res[i];
        }

        printArray(arr,"original array");

//        return res;
    }

 public static void radixSort(int arr[]){
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxEl){
                maxEl = arr[i];
            }
        }
        if(maxEl == Integer.MIN_VALUE){
            System.out.println("Empty array");
            return;
        }

        for(int digit = 1;maxEl/digit>0;digit*=10){
            countingSortWithDigit(arr,digit);
        }

    }
}