//------------ longest increasing subsequence------------

import java.util.*;
class Solution46 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int lis[] = new int[n];
        Arrays.fill(lis, 1);
        int maxLen=1;
        for(int i=1;i<n;i++){
            for(int p=0;p<i;p++){
                if(nums[p] < nums[i]){
                    lis[i] = Math.max(lis[i], 1 + lis[p]);
                }
            }
            if(lis[i] > maxLen){
                maxLen = lis[i];
            }
        }
        return maxLen;
    }
}