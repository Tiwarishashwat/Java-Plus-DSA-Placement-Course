class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left=0;
        int leftMax=0;
        int right=n-1;
        int rightMax=0;
        int result=0;
        while(left<=right){
            if(height[left] > leftMax){
                leftMax = height[left];
            }
            if(height[right] > rightMax){
                rightMax = height[right];
            }
            if(leftMax<=rightMax){
                result += (leftMax - height[left]);
                left++;
            }else{
                result += (rightMax - height[right]);
                right--;
            }
        }
        return result;

    }
}