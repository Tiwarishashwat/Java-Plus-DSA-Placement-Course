import java.util.*;
//--------- Fibonacci Sequence ----------
//Recursion
class Solution1 {
    // tc: 2^n
    public int fib(int n) {
        //base case
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

// Top Down
class Solution2 {
    // tc: O(N)
    // sc: O(N) + O(N)
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }

    public int recur(int n, int dp[]) {
        //base case
        if(n<=1){
            dp[n] = n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }
}

// Bottom Up
class Solution3 {
    // tc: O(N)
    // sc: O(N)
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int dp[] = new int[n+1];
        //base case
        dp[0] = 0;
        dp[1] = 1;

        for(int state = 2; state<=n; state++){
            dp[state] = dp[state-1] + dp[state-2];
        }
        return dp[n];
    }
}

//Bottom Up space optimized
class Solution4 {
    // tc: O(N)
    // sc: O(1)
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        //base case
        int prev2 = 0;
        int prev1 = 1;
        int ans = 0;

        for(int state = 2; state<=n; state++){
            ans = prev1 + prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}


