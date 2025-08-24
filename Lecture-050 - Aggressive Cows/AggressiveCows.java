import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

    }
    public static int solve(int n, int cows, int[] stalls) {
        // if not enough stalls, then return
        if(stalls.length < cows){
            return -1;
        }

        // sort your arrays
        Arrays.sort(stalls);

        int start = 1; // optimize
        int end = stalls[n-1] - stalls[0];
        int ans =-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // if possible then increase the distance
            if(isAllocationPossible(stalls,mid,cows)){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    static boolean isAllocationPossible(int stalls[], int minDistance, int cows){
        int cowsCount = 1;
        int lastCowDistance = stalls[0];
        for(int i=1;i<stalls.length;i++){
            // check if min distance is maintained
            // then increase count of cow and assign new location.
            if(stalls[i] - lastCowDistance >= minDistance){
                cowsCount+=1;
                lastCowDistance = stalls[i];
            }
            if(cowsCount>=cows){
                return true;
            }
        }
        return false;
    }
}











