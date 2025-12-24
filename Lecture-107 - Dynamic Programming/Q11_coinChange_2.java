//------------ coin change 2------------
class Solution35 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int prev[] = new int[amount+1];
        for(int a=0;a<amount+1;a++){
            if(a % coins[0]==0){
                prev[a] = 1; //a / coins[0];
            }else{
                prev[a] = 0; //(int)(1e9);
            }
        }

        for(int i=1;i<n;i++){
            int cur[] = new int[amount+1];
            for(int a=0;a<amount+1;a++){
                int pick = 0; //(int)(1e9);
                if(a >= coins[i]){
                    pick = cur[a-coins[i]]; //recur(coins, a - coins[i], i, dp);
                }
                int noPick = prev[a]; //recur(coins, a, i-1, dp);
                cur[a] = pick + noPick; //Math.min(pick, noPick);
            }
            prev = cur;
        }
        return prev[amount];
    }
}