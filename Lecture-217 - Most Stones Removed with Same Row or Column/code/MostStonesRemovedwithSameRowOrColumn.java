import java.util.*;
class Solution {
    public void dfs(int src, List<List<Integer>> adjList, boolean visited[]){
        visited[src] = true;
        for(int neighbour : adjList.get(src)){
            if(!visited[neighbour]){
                dfs(neighbour,adjList,visited);
            }
        }
    }
    public int removeStones(int[][] stones) {
        int n = stones.length;
      //create the adjList
      List<List<Integer>> adjList = new ArrayList<>();
      for(int i=0;i<n;i++){
        adjList.add(new ArrayList<>());
      }
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }
        }
      }
      int components=0;
      boolean visited[] = new boolean[n];
      for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(i,adjList,visited);
            components++;
        }
      }
      return n-components;
    }
}