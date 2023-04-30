public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2,7,1,5,4,6,3};
        printArray(arr,"original array");
        cycleSort(arr);
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

//    [1...N]
    public static void cycleSort(int arr[]){
        int n = arr.length;
        int index = 0;
        while(index<n){
            int element  = arr[index];
            int actualPos = element - 1;
            // if element is not at the correct pos, then perform swapping
            if(arr[index]<n && arr[index]!=arr[actualPos]){
                swap(arr,index,actualPos);
            } else {
                index++;
            }
        }
    }


public static void cycleSort0ToN(int arr[]){
        int n = arr.length;
        int index = 0;
        while(index<n){
            int element  = arr[index];
            int actualPos = element;
            // if element is not at the correct pos, then perform swapping
            if(arr[index]<n && arr[index]!=arr[actualPos]){
                swap(arr,index,actualPos);
            } else {
                index++;
            }
        }
    }

    public static void cyclicSort(int arr[]){
        int n = arr.length;
        for(int cycles=0;cycles<n-1;cycles++){
            int pos = cycles;
            int item = arr[cycles];

            // find number of smaller elements
            for(int i=cycles+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            // element is at correct position
            if(pos==cycles){
                continue;
            }
            //ignore duplicates
            while(arr[pos]==item){
                pos++;
            }
            // if smaller elements are found then perform swapping.
            if(pos!=cycles){
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
            // check if more swaps are required.
            while(pos!=cycles){
                pos = cycles;
                // find number of smaller elements
                for(int i=cycles+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                //ignore duplicates
                while(arr[pos]==item){
                    pos++;
                }
                if(item!=arr[pos]){
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
    }
}