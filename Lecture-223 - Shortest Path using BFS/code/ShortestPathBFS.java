import java.util.*;

class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        // create adjaceny list
        List<List<Integer>> adj = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        //apply bfs
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        int dist[] = new int[n];
        Arrays.fill(dist,-1);
        dist[src] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbour : adj.get(node)){
                if(dist[neighbour] == -1){
                    dist[neighbour] = dist[node] + 1; //1st occurance is always the answer!
                    queue.offer(neighbour);
                }
            }
        }
        return dist;
    }
}








