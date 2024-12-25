import java.util.*;

//--------- Climbing Stairs ----------
//  recursion
class Solution5 {
     // 2^n
     public int climbStairs(int n) {
         //base case
         if(n<=2){
             return n;
         }
         return climbStairs(n-1) + climbStairs(n-2);
     }
 }

 // top down approach
 class Solution6 {
     // O(N)
     // O(N) + O(N)
     public int climbStairs(int n) {
         int dp[] = new int[n+1];
         Arrays.fill(dp,-1);
         return recur(n,dp);
     }
     public int recur(int n, int dp[]){
         //base case
         if(n<=2){
             dp[n] = n;
             return n;
         }
         if(dp[n]!=-1){
             return dp[n];
         }
         dp[n] = climbStairs(n-1) + climbStairs(n-2);
         return dp[n];
     }
 }

// bottom up approach
 class Solution7 {
     // O(N)
     // O(N)
     public int climbStairs(int n) {
          if(n<=2){
             return n;
         }
         int dp[] = new int[n+1];
         dp[1] = 1;
         dp[2] = 2;
         for(int state=3;state<=n;state++){
             dp[state] = dp[state-1] + dp[state-2];
         }
         return dp[n];
     }

 }

// bottom up approach - space optimized
class Solution8 {
    // O(N)
    // O(N)
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        int ans = 0;
        for(int state=3;state<=n;state++){
            ans = prev1 + prev2;
            prev2 = prev1;
            prev1 = ans;

        }
        return ans;
    }

}
