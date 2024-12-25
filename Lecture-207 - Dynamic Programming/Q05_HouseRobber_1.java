import java.util.*;
//-------------  House Robber 1 ----------
// recursion
class Solution14 {
    public int rob(int[] nums) {
        int n = nums.length;
        return recur(nums, n - 1);
    }

    public int recur(int nums[], int index) {
        //base case
        if (index == 0) {
            return nums[0];
        }
        if (index == -1) {
            return 0;
        }
        //pick and no pick logic
        int pick = nums[index] + recur(nums, index - 2);
        int noPick = 0 + recur(nums, index - 1);
        return Math.max(pick, noPick);
    }

}
// top down
class Solution15 {
    // shifting logic
     public int rob(int[] nums) {
         int n = nums.length;
         int dp[] = new int[n+1];
         Arrays.fill(dp,-1);
         return recur(nums,n,dp);
     }
     public int recur(int nums[], int index, int dp[]){
         //base case
         if(index==1){
             dp[index] = nums[0];
             return nums[0];
         }
         if(index==0){
             dp[index] = 0;
             return 0;
         }
         if(dp[index]!=-1){
             return dp[index];
         }

         //pick and no pick logic
         int pick = nums[index-1] + recur(nums,index-2,dp);
         int noPick = 0 + recur(nums,index-1,dp);
         dp[index] = Math.max(pick,noPick);
         return dp[index];
     }
}
// bottom up
class Solution16 {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int state = 2; state < n + 1; state++) {
            //pick and no pick logic
            int pick = nums[state - 1] + dp[state - 2];
            int noPick = 0 + dp[state - 1];
            dp[state] = Math.max(pick, noPick);
        }
        return dp[n];
    }

}

//space optimized
class Solution17{
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int prev2 = 0;
        int prev1 = nums[0];
        int ans = 0;
        for(int state=2;state<n+1;state++){
            //pick and no pick logic
            int pick = nums[state-1] + prev2;
            int noPick = 0 + prev1;
            ans = Math.max(pick,noPick);
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}