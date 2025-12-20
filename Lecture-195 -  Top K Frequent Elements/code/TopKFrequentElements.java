import java.util.*;
class Number implements Comparable<Number> {
    int element;
    int freq;
    Number(int element, int freq){
        this.element = element;
        this.freq = freq;
    }
    public int compareTo(Number that){
        //min heap
        return this.freq - that.freq; //inc
    }

}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        //find freq of all elements
        for(int element : nums){
            freqMap.put(element,freqMap.getOrDefault(element,0) + 1);
        }
        //insert elements in pq
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            Number number = new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int index=0;
        while(index<k){
            Number number = pq.poll();
            res[index] = number.element;
            index++;
        }
        return res;

    }
}