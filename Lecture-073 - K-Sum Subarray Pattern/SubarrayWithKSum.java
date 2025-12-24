import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWithKSum {
    public static void main(String[] args) {
        int arr[] = {2,8,2,6,-6,3,2};
        boolean found = checkKSumSubarray(arr,5);
        System.out.println("Found-> " + found);

        ArrayList<Integer> res = findKSumSubarray(arr,5);
        if(res.get(0) == -1){
            System.out.println("Not found");
            return;
        }
        System.out.println("Res-> [" + res.get(0) + "," + res.get(1) +"]");

        int count = findTotalKSumSubarray(arr,5);
        System.out.println("Total counts-> " + count);


       int maxLen = findLongestKSumSubarray(arr,5);
       System.out.println("maxLen-> " + maxLen);
    }
    public static boolean checkKSumSubarray(int arr[], int k){
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(0); // x==k
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem = sum-k;
            if(mySet.contains(rem)){
                return true;
            }
            mySet.add(sum);
        }
       return false;
    }
    public static ArrayList<Integer> findKSumSubarray(int arr[], int k){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1); // no answer case
        HashMap<Integer,Integer> myMap = new HashMap<>();
        myMap.put(0,-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            int rem = sum-k;
            if(myMap.containsKey(rem)){
                int startingIndex = myMap.get(rem)+1;
                list.set(0,startingIndex);
                list.add(i);
                break;
            }
            myMap.put(sum,i);
        }
        return list;
    }
    public static int findTotalKSumSubarray(int arr[], int k){
       int count=0,sum=0;
       HashMap<Integer,Integer> sumFreqMap = new HashMap<>();
       sumFreqMap.put(0,1);
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           int rem = sum-k;
           count += sumFreqMap.getOrDefault(rem,0);
           sumFreqMap.put(sum,sumFreqMap.getOrDefault(sum,0)+1);
       }
       return count;
    }

    public static int findLongestKSumSubarray(int arr[], int k){
        int maxLen=0,sum=0;
        HashMap<Integer,Integer> myMap = new HashMap<>();
        myMap.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem = sum-k;
            if(myMap.containsKey(rem)){
                int len = i - myMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!myMap.containsKey(sum)){
                myMap.put(sum,i);
            }
        }
        return maxLen;
    }
}






