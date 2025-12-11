class Solution {
    public int firstMissingPositive(int[] nums) {
         int i=0;
        int n = nums.length;
        while(i<n){
            int expectedIndex = nums[i]-1;
            if(expectedIndex<0 || expectedIndex>=n || nums[expectedIndex] == nums[i]){
                i++;
            }else{
                swap(nums, expectedIndex,i);
            }
        }

        for(int j=1;j<=n;j++){
            int expectedIndex = j-1;
            if(nums[expectedIndex] != j) return j;
        }
        return n+1;
    }
     private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


