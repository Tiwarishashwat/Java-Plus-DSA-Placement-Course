class Solution {
    public int findMinArrowShots(int[][] points) {
        // a,b -> swap -> pos(1) / /-1
        // (2,4) , (6,8)
        Arrays.sort(points,(a,b) -> (a[1]<=b[1])?-1:1);
        int arrows=1;
        int lastEnd=points[0][1];
        for(int point[] : points){
            //if there is no overalapping point then increase the arrow
            if(point[0] > lastEnd){
                arrows++;
                lastEnd = point[1];
            }
        }
        return arrows;
    }
}