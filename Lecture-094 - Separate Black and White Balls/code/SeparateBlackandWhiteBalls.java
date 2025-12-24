class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        int last=0;
        long swapCount=0;
        for(int cur=0;cur<n;cur++){
            if(s.charAt(cur) == '0'){
               swapCount+=(cur-last); //imag swapping
                last++;
            }
        }
        return swapCount;
    }
}