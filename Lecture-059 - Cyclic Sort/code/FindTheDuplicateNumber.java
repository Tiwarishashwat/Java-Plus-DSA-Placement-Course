class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n = nums.length;
        while(i<n){
            int expectedIndex = nums[i]-1;
            if( nums[expectedIndex] == nums[i]){
                i++;
            }else{
                swap(nums, expectedIndex,i);
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]-1!=j) return nums[j];
        }
        
        return -1;
    }
    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



