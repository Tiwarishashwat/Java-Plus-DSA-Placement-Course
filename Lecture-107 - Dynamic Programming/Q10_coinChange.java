//------------ coin change 1------------
import java.util.*;
// recursive
class Solution31 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int res = recur(coins, amount, n-1);
        if(res == (int)(1e9)){
            return -1;
        }
        return res;
    }
    public int recur(int coins[], int amount, int index){
        //base case
        if(index == 0){
            if(amount % coins[index]==0){
                return amount / coins[index];
            }
            return (int)(1e9);
        }
        int pick = (int)(1e9);
        if(amount >= coins[index]){
            pick = 1 + recur(coins, amount - coins[index], index);
        }
        int noPick = recur(coins, amount, index-1);
        return Math.min(pick, noPick);
    }
}


// top down
class Solution32 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        int res = recur(coins, amount, n-1,dp);
        if(res == (int)(1e9)){
            return -1;
        }
        return res;
    }
    public int recur(int coins[], int amount, int index, int dp[][]){
        //base case
        if(index == 0){
            if(amount % coins[index]==0){
                dp[index][amount] = amount / coins[index];
                return amount / coins[index];
            }
            dp[index][amount] = (int)(1e9);
            return (int)(1e9);
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int pick = (int)(1e9);
        if(amount >= coins[index]){
            pick = 1 + recur(coins, amount - coins[index], index, dp);
        }
        int noPick = recur(coins, amount, index-1, dp);
        dp[index][amount] = Math.min(pick, noPick);
        return dp[index][amount];
    }
}

// bottom up
class Solution33 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int a=0;a<amount+1;a++){
            if(a % coins[0]==0){
                dp[0][a] = a / coins[0];
            }else{
                dp[0][a] = (int)(1e9);
            }
        }

        for(int i=1;i<n;i++){
            for(int a=0;a<amount+1;a++){
                int pick = (int)(1e9);
                if(a >= coins[i]){
                    pick = 1 + dp[i][a-coins[i]]; //recur(coins, a - coins[i], i, dp);
                }
                int noPick = dp[i-1][a]; //recur(coins, a, i-1, dp);
                dp[i][a] = Math.min(pick, noPick);
            }
        }

        if(dp[n-1][amount] == (int)(1e9)){
            return -1;
        }
        return dp[n-1][amount];
    }
 }

// space optimized solution
class Solution34 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int prev[] = new int[amount+1];
        for(int a=0;a<amount+1;a++){
            if(a % coins[0]==0){
                prev[a] = a / coins[0];
            }else{
                prev[a] = (int)(1e9);
            }
        }

        for(int i=1;i<n;i++){
            int cur[] = new int[amount+1];
            for(int a=0;a<amount+1;a++){
                int pick = (int)(1e9);
                if(a >= coins[i]){
                    pick = 1 + cur[a-coins[i]]; //recur(coins, a - coins[i], i, dp);
                }
                int noPick = prev[a]; //recur(coins, a, i-1, dp);
                cur[a] = Math.min(pick, noPick);
            }
            prev = cur;
        }

        if(prev[amount] == (int)(1e9)){
            return -1;
        }
        return prev[amount];
    }

}