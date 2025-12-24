import java.util.*;
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        //find the degree
        long degree[] = new long[n];
        for(int edges[] : roads){
            degree[edges[0]]++;
            degree[edges[1]]++;
        }
        Arrays.sort(degree); //inc
        long res=0;
        long label=1;
        for(int i=0;i<n;i++){
            res += (degree[i] * label);
            label++;
        }
        return res;
    }
}