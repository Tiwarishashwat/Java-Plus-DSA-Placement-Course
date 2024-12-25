//------------ unique path 1------------

import java.util.*;
// recursion
class Solution48 {
    public int uniquePaths(int m, int n) {
        return recur(m-1, n-1);
    }
    public int recur(int m, int n){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        return recur(m-1,n) + recur(m,n-1);
    }
}

// top down
class Solution49 {

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(m, n, dp);
    }

    public int recur(int m, int n, int dp[][]){
        if(m==1 && n==1){
            dp[m][n] = 1;
            return 1;
        }
        if(m==0 || n==0){
            dp[m][n] = 0;
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n] = recur(m-1,n,dp) + recur(m,n-1,dp);
        return dp[m][n];
    }

}

// bottom up
class Solution50 {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else if(i==1 && j==1){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]; //recur(m-1,n, dp) + recur(m,n-1, dp);
                }
            }
        }
        return dp[m][n]; //recur(m,n, dp);
    }

}

// bottom up space optimized
class Solution51 {
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n+1];
        for(int i=1;i<m+1;i++){
            int cur[] = new int[n+1];
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    cur[j] = 0;
                }else if(i==1 && j==1){
                    cur[j] = 1;
                }else{
                    cur[j] = prev[j] + cur[j-1]; //recur(m-1,n, dp) + recur(m,n-1, dp); 
                }
            }
            prev = cur;
        }
        return prev[n]; //recur(m,n, dp);
    }

}