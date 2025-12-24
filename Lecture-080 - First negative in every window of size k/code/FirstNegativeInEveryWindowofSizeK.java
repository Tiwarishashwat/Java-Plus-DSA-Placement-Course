

//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> queue = new LinkedList<Long>();
        // calculate for first window
        int index=0;
        while(index<K){
            if(A[index]<0){
                queue.offer(A[index]);
            }
            index++;
        }
        long res[] = new long[N-K+1];
        res[0] = (queue.isEmpty())?0:queue.peek();
        
        for(int i=1;i<N-K+1;i++){
            //remove
            if(A[i-1]<0){
                queue.poll();
            }
            //add
            if(A[i+K-1]<0){
                queue.offer(A[i+K-1]);
            }
            res[i] = (queue.isEmpty())?0:queue.peek();
        }
        return res;
    }
}





