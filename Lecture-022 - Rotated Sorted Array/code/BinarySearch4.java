public class BinarySearch4 {
    public static void main(String args[]){
        int arr[] = {2,4,5,7,11,43};
        int index = minElement(arr);
        System.out.println(arr[index]);
        int index1 = maxElement(arr);
        System.out.println(arr[index1]);
        int index2 = searchInRotatedArray(arr,66);
        if(index2 == -1){
            System.out.println("Element does not exist");
        } else
        System.out.println(arr[index2]);
        rotationCountInCWSA(arr);
        rotationCountInACWSA(arr);

    }

    static void rotationCountInACWSA(int arr[]){
        int index = minElement(arr);
        System.out.println("ACW Rotation count is:"+ ((arr.length-index)%arr.length));
    }
    static void rotationCountInCWSA(int arr[]){
        int index = minElement(arr);
        System.out.println("CW Rotation count is:"+ index);
    }
    static int searchInRotatedArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            // left side is sorted
            if (arr[start] <= arr[mid]) {
                // can ans be found in left side?
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } // right side is sorted
            else {
                // can ans be found in right side?
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
    static int maxElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            // if right half is sorted, move left
            else if(arr[start]>arr[mid]){
                end = mid-1;
            }   // if left half is sorted, move right
            else {
                start = mid+1;
            }
        }
        return end;
    }
    static int minElement(int arr[]){
    int start = 0;
    int end = arr.length-1;
    while (start < end){
        int mid = start + (end-start)/2;
        if(mid>0 && arr[mid]<arr[mid-1]){
            return mid;
        }
        // if right half is sorted, move left
        else if(arr[end]>arr[mid]){
            end = mid-1;
        }   // if left half is sorted, move right
        else {
            start = mid+1;
        }
    }
    return start;
    }
    static int minElementDuplicates(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                start++;
                end--;
            }
            else if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            }
            // if right half is sorted, move left
            else if(arr[end]>=arr[mid]){
                end = mid-1;
            }   // if left half is sorted, move right
            else {
                start = mid+1;
            }
        }
        return start;
    }
}









