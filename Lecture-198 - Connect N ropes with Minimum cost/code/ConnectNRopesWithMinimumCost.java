import java.util.*;
class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int element: arr){
            minHeap.offer(element);
        }
        //find the min cost
        int cost=0;
        while(minHeap.size()>1){
            int rope1 = minHeap.poll();
            int rope2 = minHeap.poll();
            int newRope = rope1 + rope2;
            cost += newRope;
            minHeap.offer(newRope);
        }
        return cost;
    }
}