import java.util.*;
class Solution {
    public boolean color(int src, int graph[][], int color[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        color[src] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbour : graph[node]){
                if(color[neighbour]==-1){
                    color[neighbour] = 1 - color[node];
                    queue.offer(neighbour);
                }else if(color[neighbour] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i] == -1){
                if(!color(i,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
}