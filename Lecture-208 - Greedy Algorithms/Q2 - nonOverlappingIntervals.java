class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        // [ [s,e] , [s,e] , []]
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int removed=0;
        int lastEnd = intervals[0][1];   
        for(int i=1;i<n;i++){
            if(intervals[i][0] < lastEnd){ //overlap
                removed++;
            }else{
                lastEnd = intervals[i][1];
            }
        }
        return removed;
    }
}