class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n = nums.length;
        while(i<n){
            int expectedIndex = nums[i];
            if( expectedIndex>=n || nums[expectedIndex] == nums[i]){
                i++;
            }else{
                swap(nums, expectedIndex,i);
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j) return j;
        }
        
        return n;
    }
        private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}