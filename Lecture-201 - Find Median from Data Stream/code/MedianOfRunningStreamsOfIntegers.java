import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;

    public MedianFinder() {
        minheap = new PriorityQueue<>(); //inc
        maxheap = new PriorityQueue<>((a,b)->(b-a)); //dec
    }
    
    public void addNum(int num) {
        maxheap.offer(num);
        // <=
        if(!maxheap.isEmpty() && !minheap.isEmpty() && maxheap.peek() > minheap.peek()){
            int val = maxheap.poll();
            minheap.offer(val);
        }
        //size check
        if(maxheap.size() > minheap.size()+1){
            int val = maxheap.poll();
            minheap.offer(val); 
        }

        if(minheap.size() > maxheap.size()+1){
            int val = minheap.poll();
            maxheap.offer(val); 
        }
    }
    
    public double findMedian() {
        if(minheap.size()>maxheap.size()){
            return minheap.peek();
        }else if(maxheap.size()>minheap.size()){
            return maxheap.peek();
        }else {
            return (minheap.peek() + maxheap.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */