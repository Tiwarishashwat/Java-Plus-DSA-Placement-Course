
import java.util.*;
class Solution {
    public boolean checkIfCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean visited[]){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src,-1});
        visited[src] = true;
        while(!queue.isEmpty()){
            int pair[] = queue.poll();
            int node = pair[0];
            int parent = pair[1];
            for(int neighbour : adj.get(node)){
                if(neighbour==parent) continue;
                if(visited[neighbour]) return true;
                else{
                    queue.offer(new int[]{neighbour,node});
                    visited[neighbour] = true;
                }
            }
        }
        return false;
        
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(i,adj,visited)){
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
}