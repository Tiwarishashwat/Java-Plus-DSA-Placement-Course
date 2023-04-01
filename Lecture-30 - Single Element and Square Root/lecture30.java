public int singleNonDuplicate(int[] nums) {

        int start =0;
        int end = nums.length-2;

        while(start<=end){
            int mid = start + (end-start)/2;
            // left half -> move towards right
            if(nums[mid] == nums[mid^1]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return nums[start];
}
// return exact number in case of perfect square
// return ceil in case of non perfect square. 
public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid <= x/mid) {
                if( x%mid==0 && mid == x/mid) 
                {
                    return mid;
                }
                start = mid+1;
            }
            else end = mid-1;
        }
        return start;
    }
    static int countSquares(int N) {
        // code here
        int sqroot = mySqrt(N);
        return sqroot - 1;
    }

// return exact number in case of perfect square
// return floor in case of non perfect square. 
      public int mySqrtBinarySearch(int x) {
        int start = 1;
        int end = x;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid <= x/mid) {
                if( x%mid==0 && mid == x/mid) 
                {
                    return mid;
                }
                start = mid+1;
            }
            else end = mid-1;
        }
        return end;
    }