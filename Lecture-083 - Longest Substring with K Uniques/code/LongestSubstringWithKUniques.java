

// User function Template for Java

class Solution {
    // aabacbebebe
    public int longestkSubstr(String s, int k) {
        // code here
        int n = s.length();
        int windowStart=0;
        int windowEnd=0;
        int len=0;
        int maxLen = Integer.MIN_VALUE;
        int freqHash[] = new int[26];
        int uniqueCharCount=0;
        while(windowEnd<n){
            int index = s.charAt(windowEnd)-97;
            if(freqHash[index]==0){
                uniqueCharCount++;
            }
               freqHash[index]++;
             if(uniqueCharCount==k){
                len = windowEnd-windowStart+1;
                maxLen = Math.max(maxLen,len);
            }  
             //Shrinking
            else if(uniqueCharCount>k){
                while(windowStart<windowEnd && uniqueCharCount>k){
                    index = s.charAt(windowStart)-97;
                    windowStart++;
                    freqHash[index]--;
                    if(freqHash[index]==0){
                        uniqueCharCount--;
                    }
                }
            }
            windowEnd++;
        }
        return (maxLen == Integer.MIN_VALUE)?-1:maxLen;
    }
}









