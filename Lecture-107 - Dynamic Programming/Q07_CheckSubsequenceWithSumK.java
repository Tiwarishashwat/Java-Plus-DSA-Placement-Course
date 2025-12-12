
//------------ check subsequence with sum k------------
// recursive
class Solution19 {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        return recur(arr, K, N-1);

    }
    public static boolean recur(int arr[], int K, int index){
        //base case
        if(K == 0){
            return true;
        }
        if(index == 0){
            if(K == arr[index]) return true;
            return false;
        }
        boolean pick = false;
        if(arr[index]<= K){
            pick = recur(arr, K-arr[index], index-1);
            if (pick){
                return true;
            }
        }
        boolean noPick = recur(arr, K, index-1);
        return noPick;
    }
}

// top down
class Solution20 {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        int dp[][] = new int[N][K+1];
        return recur(arr, K, N-1,dp);

    }
    //   0 -> not visited
//   1 -> true
//  2 -> false
    public static boolean recur(int arr[], int K, int index, int dp[][]){
        //base case
        if(K == 0){
            dp[index][K] = 1;
            return true;
        }
        if(index == 0){
            if(K == arr[index]) {
                dp[index][K] = 1;
                return true;
            }
            dp[index][K] = 2;
            return false;
        }

        if(dp[index][K]!=0){
            return (dp[index][K] == 1);
        }

        boolean pick = false;
        if(arr[index]<= K){
            pick = recur(arr, K-arr[index], index-1,dp);
            if (pick){
                dp[index][K] = 1;
                return true;
            }
        }
        boolean noPick = recur(arr, K, index-1,dp);
        dp[index][K] = (noPick==true)?1:2;
        return noPick;
    }
}


// bottom up
class Solution21 {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        int dp[][] = new int[N][K+1];
        //base case
        for(int i=0;i<N;i++){
            dp[i][0] = 1;
        }

        for(int t=1;t<=K;t++){
            if(t == arr[0]){
                dp[0][t] = 1;
            }else{
                dp[0][t] = 2;
            }
        }

        for(int i=1;i<N;i++){
            for(int j=1;j<=K;j++){
                int pick = 2;
                if(arr[i]<= j){
                    pick = dp[i-1][j-arr[i]]; //recur(arr, j-arr[i], i-1,dp);
                    if (pick==1){
                        dp[i][j] = 1;
                        continue;
                    }
                }
                int noPick = dp[i-1][j]; //recur(arr, j, i-1,dp);
                dp[i][j] = noPick;
            }
        }

        return (dp[N-1][K] == 1); //recur(arr, K, N-1,dp);

    }
}




// space optimized
class Solution22 {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        // int dp[][] = new int[N][K+1];
        int prev[] = new int[K+1];
        //base case
        // for(int i=0;i<N;i++){
        //     dp[i][0] = 1;
        // }
        prev[0] = 1;

        for(int t=1;t<=K;t++){
            if(t == arr[0]){
                prev[t] = 1;
            }else{
                prev[t] = 2;
            }
        }

        for(int i=1;i<N;i++){
            int cur[] = new int[K+1];
            cur[0] = 1;
            for(int j=1;j<=K;j++){
                int pick = 2;
                if(arr[i]<= j){
                    pick = prev[j-arr[i]]; //recur(arr, j-arr[i], i-1,dp);
                    if (pick==1){
                        cur[j] = 1;
                        continue;
                    }
                }
                int noPick = prev[j]; //recur(arr, j, i-1,dp);
                cur[j] = noPick;
            }
            prev = cur;
        }
        return (prev[K] == 1); //recur(arr, K, N-1,dp);
    }
}
     
     