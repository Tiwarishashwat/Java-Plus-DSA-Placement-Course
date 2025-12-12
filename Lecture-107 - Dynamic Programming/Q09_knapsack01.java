
//------------ 01 knapsack------------
// recursive
class Solution27 {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n = val.length;
        return recur(capacity, val, wt, n-1);
    }
    static int recur(int capacity, int val[], int wt[], int index){
        // base case
        if(capacity == 0) return 0;
        if(index==0){
            if(wt[index]<=capacity){
                return val[index];
            }else{
                return 0;
            }
        }
        int pick = 0;
        if(wt[index] <= capacity){
            pick = val[index] + recur(capacity - wt[index], val, wt, index-1);
        }
        int noPick = 0 + recur(capacity, val, wt, index-1);
        return Math.max(pick, noPick);
    }
}

//top down
class Solution28 {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp[][] = new int[n][capacity+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<capacity+1;j++){
                dp[i][j] = -1;
            }
        }
        return recur(capacity, val, wt, n-1,dp);
    }
    static int recur(int capacity, int val[], int wt[], int index, int dp[][]){
        // base case
        if(capacity == 0) {
            dp[index][capacity] = 0;
            return 0;
        }
        if(index==0){
            if(wt[index]<=capacity){
                dp[index][capacity] = val[index];
                return val[index];
            }else{
                dp[index][capacity] = 0;
                return 0;
            }
        }
        if(dp[index][capacity]!=-1){
            return dp[index][capacity];
        }
        int pick = 0;
        if(wt[index] <= capacity){
            pick = val[index] + recur(capacity - wt[index], val, wt, index-1, dp);
        }

        int noPick = 0 + recur(capacity, val, wt, index-1,dp);
        dp[index][capacity] = Math.max(pick, noPick);
        return dp[index][capacity];
    }
}

// bottom up
class Solution29 {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp[][] = new int[n][capacity+1];
        for(int i=0;i<n;i++){
            dp[i][0] = 0;
        }
        for(int c=0;c<capacity+1;c++){
            if(wt[0]<=c){
                dp[0][c] = val[0];
            }else{
                dp[0][c] = 0;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<capacity+1;j++){
                int pick = 0;
                if(wt[i] <= j){
                    pick = val[i] + dp[i-1][j-wt[i]]; //recur(j - wt[i], val, wt, i-1, dp);
                }

                int noPick = 0 + dp[i-1][j]; //recur(j, val, wt, i-1,dp);
                dp[i][j] = Math.max(pick, noPick);
            }
        }
        return dp[n-1][capacity]; //recur(capacity, val, wt, n-1,dp);
    }
}

// bottom up space optimized
class Solution30 {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n = val.length;
        int prev[] = new int[capacity+1];
        // for(int i=0;i<n;i++){
        prev[0] = 0;
        // }
        for(int c=0;c<capacity+1;c++){
            if(wt[0]<=c){
                prev[c] = val[0];
            }else{
                prev[c] = 0;
            }
        }

        for(int i=1;i<n;i++){
            int cur[] = new int[capacity+1];
            cur[0] = 0;
            for(int j=1;j<capacity+1;j++){
                int pick = 0;
                if(wt[i] <= j){
                    pick = val[i] + prev[j-wt[i]]; //recur(j - wt[i], val, wt, i-1, dp);
                }

                int noPick = 0 + prev[j]; //recur(j, val, wt, i-1,dp);
                cur[j] = Math.max(pick, noPick);
            }
            prev = cur;
        }
        return prev[capacity]; //recur(capacity, val, wt, n-1,dp);
    }
}