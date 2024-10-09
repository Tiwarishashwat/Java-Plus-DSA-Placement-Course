

// leetcode 941. Valid Mountain Array
class Solution {
    // operations: O(N)
    public boolean validMountainArray(int[] arr) {
        int index=0;
        int n = arr.length;
        // find all increasing seq (find the peak)
        while(index<n-1){
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index==0 || index==n-1){
            return false;
        }

        // find all decreasing seq (find the end of the array)
        while(index<n-1){
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);

    }
}

// leetcode 852. Peak Index in a Mountain Array
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid!=n-1 && arr[mid]<arr[mid+1]){ //inc
                start = mid+1;
            }else{ //dec
                end = mid-1;
            }
        }
        return -1; //never be returned
    }
}

// leetcode 1095: find in mountain array
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // find peak index
        int n = mountainArr.length();
        int start=0;
        int end=n-1;
        int mid=-1;
        while(start<=end){
            mid = start + (end-start)/2;
            int cur = mountainArr.get(mid);
            if(mid!=0 && mid!=n-1 && cur>mountainArr.get(mid-1) 
            && cur >mountainArr.get(mid+1)){
                if(cur==target){
                    return mid;
                }
                break;
            }else if(mid!=n-1 && cur<mountainArr.get(mid+1)){ //inc
                start = mid+1;
            }else{ //dec
                end = mid-1;
            }
        }
        // find in first half (increasing)
        start = 0;
        end = mid-1;
        while(start<=end){
            int m = start + (end-start)/2;
            int cur = mountainArr.get(m);
            if(cur==target){
                return m;
            }else if(target<cur){
                end=m-1;
            }else{
                start=m+1;
            }
        }

        // find in second half (decreasing array)
        start = mid+1;
        end = n-1;
        while(start<=end){
            int m = start + (end-start)/2;
            int cur = mountainArr.get(m);
            if(cur==target){
                return m;
            }else if(target<cur){
                start=m+1;
            }else{
                end=m-1;
            }
        }
        return -1;
    }
}
