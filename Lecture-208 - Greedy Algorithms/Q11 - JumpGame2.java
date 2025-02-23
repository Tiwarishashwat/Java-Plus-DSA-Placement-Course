class Solution {
    public int jump(int[] nums) {
        int end=0;
        int minJump=0;
        int maxIndex=0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(i == end){
                minJump++;
                end = maxIndex;
            }
            if(end >= n-1){
                break;
            }
        }
        return minJump;
    }
}