import java.util.*;
public class LongestSubarrayOf0and1 {
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        HashMap<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
        sumMap.put(0,-1); //to handle subarray with sum 0 and starting from index 0
        int sum=0,maxLen=0;
        for(int i=0;i<N;i++){
            sum = (arr[i]==0)?(sum-1):(sum+1);
            if(sumMap.containsKey(sum)){
                int len = i - sumMap.get(sum);
                maxLen = Math.max(maxLen,len);
            }else{
                sumMap.put(sum,i);
            }
        }
        return maxLen;
    }
}







    // arr[] : the input array containing 0s and 1s
    // N : size of the input array










