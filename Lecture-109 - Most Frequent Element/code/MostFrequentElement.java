import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {2,1,7,8,2,1,9,10,9,9,2,8,2};
        int ans = mostFrequentElementRaw(arr);
        System.out.println("ans ->" + ans);
        int ans1 = mostFrequentElement(arr);
        System.out.println("ans ->" + ans1);
    }
    public static int mostFrequentElement(int arr[]){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;
        for(int i=0;i<arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
            if(freqMap.get(arr[i])>maxFreq){
                maxFreq = freqMap.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }
    public static int mostFrequentElementRaw(int arr[]){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;
        for(int i=0;i<arr.length;i++){
            if(freqMap.containsKey(arr[i])){
                int val = freqMap.get(arr[i]);
                val+=1;
                freqMap.put(arr[i],val);
            }else{
                freqMap.put(arr[i],1);
            }
            if(freqMap.get(arr[i])>maxFreq){
                maxFreq = freqMap.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }
}









