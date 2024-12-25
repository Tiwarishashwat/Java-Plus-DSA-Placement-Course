//------------ shortest common subsequence------------
class Solution45 {
    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][] = longestCommonSubsequence(str1, str2);
        int n = dp.length;
        int m = dp[0].length;
        int i=n-1;
        int j=m-1;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){ //lcs
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                sb.append(str1.charAt(i-1));
                i--;
            }else {
                sb.append(str2.charAt(j-1));
                j--;
            }
        }
        while(i>0) {
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j>0) {
            sb.append(str2.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
    public int[][] longestCommonSubsequence(String text1, String text2) {
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
        return dp;//recur(n,m,text1,text2,dp);
    }
}