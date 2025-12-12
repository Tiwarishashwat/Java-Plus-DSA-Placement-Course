class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        int i=0;
        int n = nums.length;
        while(i<=maxIndex){
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(maxIndex>=(n-1)){
                return true;
            }
            i++;
        }
        return false;
    }
}