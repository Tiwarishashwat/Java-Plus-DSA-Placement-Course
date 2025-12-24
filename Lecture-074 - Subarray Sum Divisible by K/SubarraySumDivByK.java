import java.util.*;
class SubarraySumDivByK{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer,Integer> remMap = new HashMap<>();
        remMap.put(0,-1); // to handle subarray starting from index 0
        int sum=0, maxLen=0;
        for(int i=0;i<n;i++){
            sum+=a[i]; // X
            int rem = sum%k;
            //convert negative remainders to positive
            if(rem<0){
                rem = rem + k;
            }
            if(remMap.containsKey(rem)){
                int len = i - remMap.get(rem); // UL - LL
                maxLen = Math.max(maxLen,len);
            }else{
                remMap.put(rem,i);
            }
        }
        return maxLen;
    }
}