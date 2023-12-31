import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float arr[] = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};
        ArrayList<Float> res = bucketSort(arr);
        System.out.println(res);
    }
    public static float findMax(float nums[]){
        float maximum = Float.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maximum = Math.max(maximum,nums[i]);
        }
        return maximum;
    }
//    tc: N+K(BEST CASE) // WORST -> N^2
//    sc: N+K
    public static ArrayList<Float> bucketSort(float arr[]){
        if(arr.length==0){
            return new ArrayList<>();
        }
        // find the bucket size
        float maxElement = findMax(arr); //N
        int maxIndex = (int)(maxElement*arr.length);
        int bucketSize = maxIndex+1;
        //Init bucket list
        ArrayList<Float> buckets[] = new ArrayList[bucketSize];
        for(int i=0;i<bucketSize;i++){ //N
            buckets[i] = new ArrayList<>();
        }
        //Insert elements into the bucket
        for(int i=0;i<arr.length;i++){ //N^2
            int index = (int)(arr[i]*arr.length);
            int targetIndex=0;
            while (targetIndex<buckets[index].size() && arr[i] > buckets[index].get(targetIndex)){
                targetIndex++;
            }
            buckets[index].add(targetIndex,arr[i]);
        }
//        //Sort the elements
//        for(int i=0;i<bucketSize;i++){ //K
//            Collections.sort(buckets[i]);
//        }
        // Store the elements into result list
        ArrayList<Float> res = new ArrayList<>();
        for(int i=0;i<bucketSize;i++){ //N*M+K
            System.out.println("Buckets[" + i + "]->" + buckets[i]);
            for(Float element:buckets[i]){
                res.add(element);
            }
        }
        return res;
    }
}








