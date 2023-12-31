public class BinarySearch3 {
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,11,16,13,11,9,3,2,1};
//        findMinElementInBitonicArray(arr);
//        int arr[] = {22,12,5,2,1,0};
//        int index = findPeakElementInBitonicArray(arr);
//        if(index == -1) {
//            System.out.println("Element does not exist");
//        } else {
//            System.out.println("Found "+arr[index]+" at: "+ index);
//        }
//        findElementInBitonicArray(arr,11);
    }

    static void findElementInBitonicArray(int arr[], int target){
        int index = findPeakElementInBitonicArray(arr);
        if(index == -1 || target > arr[index]) {
            System.out.println("Element does not exist");
        } else {
                if(target == arr[index]){
                    System.out.println("Found "+arr[index]+" at: "+ index);
                    return;
                }
            // search in left half
                int ans = binarySearch(arr,0,index-1,target);
                if(ans == -1){
                    // search in right half
                    ans = binarySearchDesc(arr,index+1,arr.length-1,target);
                }
                if(ans == -1){
                    System.out.println("Element does not exist");
                } else {
                    System.out.println("Found "+arr[ans]+" at: "+ ans);
                }
        }
    }
    static int findPeakElementInBitonicArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            int next = (mid+1)%arr.length;
            int prev = (mid-1 + arr.length)%arr.length;
            if(arr[mid] > arr[prev] && arr[mid] > arr[next]){
                return mid;
            }else if(arr[mid] > arr[prev]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    static void findMinElementInBitonicArray(int arr[]){
        if(arr.length == 0) {
            System.out.println("Array is empty");
        }else if(arr.length==1){
            System.out.println("Min element is: "+ arr[0]);
        }
        else {
            int res = (arr[0]<arr[arr.length-1])?arr[0]:arr[arr.length-1];
            System.out.println("Min element is: "+ res);
        }
    }

    static int binarySearch(int arr[],int start, int end, int target){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
      return ans;
    }
    static int binarySearchDesc(int arr[],int start,int end, int target){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;


    }
}
