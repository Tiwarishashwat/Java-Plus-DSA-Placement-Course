

//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long maxSum=0;
        long sum=0;
        // first find sum of K elements
        int index=0; 
        while(index<N && index<K){
            sum += Arr.get(index); 
            index++;
        }
        maxSum = sum;
        for(int i=1;i<N-K+1;i++){
            int prevElement = Arr.get(i-1);
            int nextElement = Arr.get(i+K-1);
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
       
    }   
}