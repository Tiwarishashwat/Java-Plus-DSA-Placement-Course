

//------------ rod cutting ------------
//rod cutting problem - recursive

class Solution36 {
    public int cutRod(int[] price) {
        // code here
        int N = price.length;
        return recur(N, N-1, price);
    }
    int recur(int N, int ind, int price[]){
        //base case
        if(ind == 0){
            return N*price[ind];
        }
        int pick = 0;
        int curLen = ind+1;
        if(N>=curLen){
            pick = price[ind] + recur(N-curLen, ind, price);
        }

        int noPick = 0 + recur(N, ind-1, price);
        return Math.max(pick, noPick);
    }
}

//rod cutting problem - bottom up

class Solution37 {
    public int cutRod(int[] price) {
        // code here
        int N = price.length;
        // (len, RodLen)
        int dp[][] = new int[N][N+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<N+1;j++){
                dp[i][j] = -1;
            }
        }
        return recur(N, N-1, price, dp);
    }
    int recur(int N, int ind, int price[], int dp[][]){
        //base case
        if(ind == 0){
            dp[ind][N] = N*price[ind];
            return N*price[ind];
        }

        if(dp[ind][N]!=-1){
            return dp[ind][N];
        }
        int pick = 0;
        int curLen = ind+1;
        if(N>=curLen){
            pick = price[ind] + recur(N-curLen, ind, price, dp);
        }

        int noPick = 0 + recur(N, ind-1, price,dp);

        dp[ind][N] = Math.max(pick, noPick);
        return dp[ind][N];
    }

}

//rod cutting problem - top down
class Solution38 {
    public int cutRod(int[] price) {
        // code here
        int N = price.length;
        int dp[][] = new int[N][N+1];
        // len=1
        for(int r=0;r<N+1;r++){
            dp[0][r] = r*price[0];
        }
        // (len, RodLen)

        for(int i=1;i<N;i++){
            for(int j=0;j<N+1;j++){
                int pick = 0;
                int curLen = i+1;
                if(j>=curLen){
                    pick = price[i] + dp[i][j-curLen]; //recur(j-curLen, i, price, dp);
                }

                int noPick = 0 + dp[i-1][j]; //recur(j, i-1, price,dp);

                dp[i][j] = Math.max(pick, noPick);
            }
        }
        return dp[N-1][N]; //recur(N, N-1, price, dp);
    }

}


//rod cutting problem - space optimized
class Solution39 {
    public int cutRod(int[] price) {
        // code here
        int N = price.length;
        int prev[] = new int[N+1];
        // len=1
        for(int r=0;r<N+1;r++){
            prev[r] = r*price[0];
        }
        // (len, RodLen)

        for(int i=1;i<N;i++){
            int cur[] = new int[N+1];
            for(int j=0;j<N+1;j++){
                int pick = 0;
                int curLen = i+1;
                if(j>=curLen){
                    pick = price[i] + cur[j-curLen]; //recur(j-curLen, i, price, dp);
                }

                int noPick = 0 + prev[j]; //recur(j, i-1, price,dp);

                cur[j] = Math.max(pick, noPick);
            }
            prev = cur;
        }
        return prev[N]; //recur(N, N-1, price, dp);
    }

}