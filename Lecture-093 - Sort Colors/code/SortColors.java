class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start=0;
        int end = n-1;
        int i=0;
        while(i<=end){
            if(nums[i] == 0){
                swap(nums,start,i);
                start++;
                i++;
            }else if(nums[i] == 2){
                swap(nums,end,i);
                end--;
            }else{
                i++;
            }
        }
    }
}