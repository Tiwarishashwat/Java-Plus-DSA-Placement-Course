
//------------ perfect sum------------
// recursive
class Solution23 {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        return recur(nums,target, n-1);
    }
    int recur(int nums[], int target, int index){
        //base case
        if(index==0){
            if(target == 0 && nums[index] == 0) return 2;
            else if(target == 0) return 1;
            else if(target == nums[index]) return 1;
            else return 0;
        }
        int pick = 0;
        if(nums[index]<=target){
            pick = recur(nums, target - nums[index], index-1);
        }

        int noPick = recur(nums, target , index-1);

        return pick + noPick;

    }
}

// top down
class Solution24 {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int dp[][] = new int[n][target+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<target+1;j++){
                dp[i][j] = -1;
            }
        }
        return recur(nums,target, n-1, dp);
    }
    int recur(int nums[], int target, int index, int dp[][]){
        //base case
        if(index==0){
            if(target == 0 && nums[index] == 0) {
                dp[index][target] = 2;
                return 2;
            }
            else if(target == 0) {
                dp[index][target] = 1;
                return 1;
            }
            else if(target == nums[index]) {
                dp[index][target] = 1;
                return 1;
            }
            else {
                dp[index][target] = 0;
                return 0;
            }
        }

        if(dp[index][target]!=-1){
            return dp[index][target];
        }

        int pick = 0;
        if(nums[index]<=target){
            pick = recur(nums, target - nums[index], index-1, dp);
        }

        int noPick = recur(nums, target , index-1, dp);
        dp[index][target] = pick + noPick;
        return dp[index][target];

    }
}



//bottom up
class Solution25 {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int dp[][] = new int[n][target+1];

        // if(index==0){
        for(int t=0;t<target+1;t++){
            if(t == 0 && nums[0] == 0) {
                dp[0][t] = 2;
            }
            else if(t == 0) {
                dp[0][t] = 1;
            }
            else if(t == nums[0]) {
                dp[0][t] = 1;
            }
            else {
                dp[0][t] = 0;
            }
        }


        // }


        for(int i=1;i<n;i++){
            for(int j=0;j<target+1;j++){
                int pick = 0;
                if(nums[i]<=j){
                    pick = dp[i-1][j - nums[i]]; //recur(nums, target - nums[index], index-1, dp);
                }

                int noPick = dp[i-1][j]; //recur(nums, target , index-1, dp);
                dp[i][j] = pick + noPick;
            }
        }

        return dp[n-1][target]; //recur(nums,target, n-1, dp);
    }
}


// bottom up space optimized
class Solution26 {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int prev[] = new int[target+1];

        for(int t=0;t<target+1;t++){
            if(t == 0 && nums[0] == 0) {
                prev[t] = 2;
            }
            else if(t == 0) {
                prev[t] = 1;
            }
            else if(t == nums[0]) {
                prev[t] = 1;
            }
            else {
                prev[t] = 0;
            }
        }


        for(int i=1;i<n;i++){
            int cur[] = new int[target+1];
            for(int j=0;j<target+1;j++){
                int pick = 0;
                if(nums[i]<=j){
                    pick = prev[j - nums[i]]; //recur(nums, target - nums[index], index-1, dp);
                }

                int noPick = prev[j]; //recur(nums, target , index-1, dp);
                cur[j] = pick + noPick;
            }
            prev = cur;
        }

        return prev[target]; //recur(nums,target, n-1, dp);
    }

}

