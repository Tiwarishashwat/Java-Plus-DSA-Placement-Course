class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}