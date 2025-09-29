public class BinarySearchQuestions {
    public static void main(String[] args) {
//        int arr1[] = {2,2,3,4,4,4,6,8,9};
        int arr[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
//        int res[] = new int[2];
//        int first = binarySearch(arr, 60, true);
//        int last = binarySearch(arr, 60, false);
//        if (first == -1){
//            System.out.println("Occurrence of target is :"+ 0);
//        } else {
//            System.out.println("Occurrence of target is :"+ (last - first + 1));
//        }
        int ans = binarySearchFloor(arr,17);
        System.out.println("floor is :"+ ans);
        int ans1 = binarySearchCeil(arr,17);
        System.out.println("ceil is :"+ ans1);
    }
    static int binarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                if (isFirst) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
//        if (ans == -1){
//            System.out.println("Element not found");
//        }
//        else {
//            System.out.println("Found element "+ target+ " at index : "+ ans);
//        }

    }
    static int binarySearchFloor(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            } else if(arr[mid]<target){
                start = mid+1;
                ans = arr[mid];
            } else {
                end = mid-1;
            }
        }
        return ans;
//        if (ans == -1){
//            System.out.println("Element not found");
//        }
//        else {
//            System.out.println("Found element "+ target+ " at index : "+ ans);
//        }

    }
    static int binarySearchCeil(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
                ans = arr[mid];
            }
        }
        return ans;
//        if (ans == -1){
//            System.out.println("Element not found");
//        }
//        else {
//            System.out.println("Found element "+ target+ " at index : "+ ans);
//        }

    }
    
    // if answer does not exist return the first element
    static char nextGreatestElement(char arr[], char target){
        char ans = '$';
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=target){
                start = mid+1;
            } else {
                end = mid-1;
                ans = arr[mid];
            }
        }
        return (ans == '$')?arr[0]:ans;
    }
}
