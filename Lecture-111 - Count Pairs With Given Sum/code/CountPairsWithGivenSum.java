import java.util.*;
public class CountPairsWithGivenSum {

    //better Approach
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                continue;
            }
            int secondVal = k-arr[i];
            if(freqMap.getOrDefault(secondVal,0)>0){
                res+=freqMap.get(secondVal);
                freqMap.put(arr[i],freqMap.get(arr[i])-1);
                if(arr[i] == secondVal){
                    res-=1;
                }
            }
        }
        return res;
    }
    // optimal Approach
    int getPairsCountOptimized(int[] arr, int n, int k) {
        int res = 0;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                continue;
            }
            int secondVal = k-arr[i];
            res += freqMap.getOrDefault(secondVal,0);
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        return res;
    }

}









