public class KokoEatingBananas {
    public static void main(String[] args) {

    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE; // for finding largest value in piles

        // finding max
        for(int i=0;i<piles.length;i++){
            if(piles[i]>end){
                end = piles[i];
            }
        }
        int ans = -1;
        // apply binary search on the possible values of K -> (1, max(piles))
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isEatingSpeedValid(piles, mid, h)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
    boolean isEatingSpeedValid(int piles[], int eatingSpeed, int hours) {
        int hoursSpent = 0;
        for(int i=0;i<piles.length;i++){
            hoursSpent += piles[i]/eatingSpeed;
            if(piles[i]%eatingSpeed!=0){
                hoursSpent += 1;
            }
            if(hoursSpent>hours) return false;
        }
        return true;
    }
}








