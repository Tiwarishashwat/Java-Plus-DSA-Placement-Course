//User function Template for Java
class Solution {
    static int assignMiceHoles(int N , int[] M , int[] H) {
        // code here
        Arrays.sort(M);
        Arrays.sort(H);
        int maxTime=0;
        for(int i=0;i<N;i++){
            maxTime = Math.max(maxTime, Math.abs(M[i] - H[i]));
        }
        return maxTime;
    }
};