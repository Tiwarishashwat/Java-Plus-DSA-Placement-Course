

//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int windowStart=0;
        int windowEnd=0; //i
        int sum=0;
        int minLen = Integer.MAX_VALUE;
        int len=0;
        while(windowEnd<n){
            //expansion
            sum+=a[windowEnd];
            if(sum>x){
                len = windowEnd-windowStart+1;
                minLen = Math.min(minLen,len);
                //Shrinking
                while(windowStart<windowEnd && sum>x){
                    sum-=a[windowStart];
                    windowStart++;
                    if(sum>x){
                        len = windowEnd-windowStart+1;
                        minLen = Math.min(minLen,len);
                    }
                }
                
            }
            windowEnd++;
        }
        
        return (minLen==Integer.MAX_VALUE)?0:minLen;
        
        
        
        
        
        
        
        
        
        
    }
}