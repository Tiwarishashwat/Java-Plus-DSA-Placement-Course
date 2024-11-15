//leetcode 33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] arr, int target) {
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
}

// leetcode 81. Search in rotated sorted array 2
class Solution {
    public boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean ans=false;
        // tc: logN + O(N/2)
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return true;
            }
            // if start,mid and end all are same then we can't guarentee which
            // part is sorted so we will trim down the space
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            // left side is sorted
            else if (arr[start] <= arr[mid]) {
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
}

// leetcode 153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int minElement = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[start]<=nums[mid]){
                minElement = Math.min(minElement,nums[start]);
                start = mid+1;
            }else{
                minElement = Math.min(minElement,nums[mid]);
                end = mid-1;
            }
        }
        return minElement;
    }
}

// gfg find Kth Rotation

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n = arr.size();
        int start = 0;
        int end = n-1;
        int minElement = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr.get(start)<=arr.get(mid)){
                // minElement = Math.min(minElement,nums[start]);
                if(arr.get(start) < minElement){
                    minElement = arr.get(start);
                    minIndex = start;
                }
                start = mid+1;
            }else{
                // minElement = Math.min(minElement,nums[mid]);
                if(arr.get(mid) < minElement){
                    minElement = arr.get(mid);
                    minIndex = mid;
                }
                end = mid-1;
            }
        }
        return minIndex;
    }
}

// Homework
// 154. Find Minimum in Rotated Sorted Array II
class Solution {
    public int findMin(int[] nums) {
        int index = minElement(nums);
       return nums[index];
    }
      static int minElement(int arr[]){
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
