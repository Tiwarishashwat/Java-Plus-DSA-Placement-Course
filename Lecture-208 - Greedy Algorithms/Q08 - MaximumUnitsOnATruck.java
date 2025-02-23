class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // sort in decreasing order of ratio
        // a[1], b[1] -> value of 1 item
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int res=0;
        for(int boxType[] : boxTypes){
            if(boxType[0]>=truckSize){
                res+=(truckSize*boxType[1]);
                truckSize=0;
            }else{
                res+=(boxType[0] * boxType[1]);
                truckSize-=boxType[0];
            }
            if(truckSize==0) break;
        }
        return res;

    }
}
