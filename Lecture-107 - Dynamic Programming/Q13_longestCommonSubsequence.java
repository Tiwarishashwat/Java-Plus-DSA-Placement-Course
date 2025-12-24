
//------------ longest common subsequence------------
import java.util.*;
// lcs recursive
class Solution40 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        return recur(n-1,m-1,text1,text2);
    }
    int recur(int i, int j, String text1, String text2){
        //base case
        if(i<0 || j<0){
            return 0;
        }

        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + recur(i-1,j-1,text1,text2);
        }else{
            int case1 = recur(i-1,j,text1,text2);
            int case2 = recur(i,j-1,text1,text2);
            return Math.max(case1,case2);
        }

    }
}

// lcs top down
class Solution41 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(n,m,text1,text2,dp);
    }
    int recur(int i, int j, String text1, String text2, int dp[][]){
        //base case
        if(i==0 || j==0){
            dp[i][j] = 0;
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(text1.charAt(i-1) == text2.charAt(j-1)){
            dp[i][j] = 1+ recur(i-1,j-1,text1,text2,dp);
            return dp[i][j];
        }else{
            int case1 = recur(i-1,j,text1,text2,dp);
            int case2 = recur(i,j-1,text1,text2,dp);
            dp[i][j] = Math.max(case1,case2);
            return dp[i][j];
        }

    }
}

// lcs bottom up
class Solution42 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        dp[0][0] = 0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1]; //recur(i-1,j-1,text1,text2,dp);
                    // return dp[i][j];
                }else{
                    int case1 = dp[i-1][j]; //recur(i-1,j,text1,text2,dp);
                    int case2 = dp[i][j-1]; //recur(i,j-1,text1,text2,dp);
                    dp[i][j] = Math.max(case1,case2);
                    // return dp[i][j];
                }
            }
        }
        return dp[n][m];//recur(n,m,text1,text2,dp);
    }
}

//lcs space optimized
class Solution43 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int prev[] = new int[m+1];
        prev[0] = 0;

        for(int i=1;i<n+1;i++){
            int cur[] = new int[m+1];
            cur[0] = 0;
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    cur[j] = 1+ prev[j-1]; //recur(i-1,j-1,text1,text2,dp);
                    // return dp[i][j];
                }else{
                    int case1 = prev[j]; //recur(i-1,j,text1,text2,dp);
                    int case2 = cur[j-1]; //recur(i,j-1,text1,text2,dp);
                    cur[j] = Math.max(case1,case2);
                    // return dp[i][j];
                }
            }
            prev = cur;
        }
        return prev[m];//recur(n,m,text1,text2,dp);
    }
}



