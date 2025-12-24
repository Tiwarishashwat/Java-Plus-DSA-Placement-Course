class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int w : weights){
            start = Math.max(start,w);
            end = end + w;
        }
        //NlogK + N
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isShipmentPossible(weights, mid, days)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    private boolean isShipmentPossible(int weights[], int capacity, int days){
        int d=1;
        int count=0;
        for(int w: weights){
            count+=w;
            if(count>capacity){
                d++;
                count=w;
            }
            if(d>days){
                return false;
            }
        }
        return true;
    }
}