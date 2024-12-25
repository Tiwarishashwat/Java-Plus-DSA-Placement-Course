import java.util.*;
//------------- min cost climbing stairs ----------
// recursion
class Solution10 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return recur(n, cost);
    }

    public int recur(int n, int cost[]) {
        //base case
        if (n == 0 || n == 1) {
            return 0;
        }
        int oneStep = cost[n - 1] + recur(n - 1, cost);
        int twoStep = cost[n - 2] + recur(n - 2, cost);
        return Math.min(oneStep, twoStep);
    }

}
//    top down
    class Solution11 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return recur(n, cost, dp);
    }

    public int recur(int n, int cost[], int dp[]) {
        //base case
        if (n == 0 || n == 1) {
            dp[n] = 0;
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int oneStep = cost[n - 1] + recur(n - 1, cost, dp);
        int twoStep = cost[n - 2] + recur(n - 2, cost, dp);
        dp[n] = Math.min(oneStep, twoStep);
        return dp[n];
    }

}
//    bottom up
    class Solution12 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int state = 2; state <= n; state++) {
            int oneStep = cost[state - 1] + dp[state - 1];
            int twoStep = cost[state - 2] + dp[state - 2];
            dp[state] = Math.min(oneStep, twoStep);
        }
        return dp[n];
    }
}
    // bottom up - space optimized
 class Solution13 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        int prev2 = 0;
        int prev1 = 0;
        int ans=0;
        for(int state=2;state<=n;state++){
            int oneStep = cost[state-1] + prev1;
            int twoStep = cost[state-2] + prev2;
            ans = Math.min(oneStep,twoStep);
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }

}