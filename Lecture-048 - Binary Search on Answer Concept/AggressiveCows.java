class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int start=Integer.MAX_VALUE;
        int end=0;
        int n = stalls.length;
        for(int i=0;i<n-1;i++){
            start = Math.min(start, stalls[i+1] - stalls[i]);
        }
        end = stalls[n-1] - stalls[0];
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isAllocationPossible(stalls,mid,k)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    private boolean isAllocationPossible(int stalls[],int minDist,int cows){
        int n = stalls.length;
        int count=1;
        int lp = stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i] - lp >= minDist){
                count++;
                lp = stalls[i];
            }
            if(count>=cows){
                return true;
            }
        }
        return false;
    }
}