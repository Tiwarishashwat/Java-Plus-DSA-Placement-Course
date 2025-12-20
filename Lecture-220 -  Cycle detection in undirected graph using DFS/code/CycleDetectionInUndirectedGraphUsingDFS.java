import java.util.*;

class Solution {
    public boolean checkIfCycle(int src,int parent, ArrayList<ArrayList<Integer>> adj, boolean visited[]){
       visited[src] = true;
       for(int neighbour : adj.get(src)){
           if(neighbour == parent) continue;
           if(visited[neighbour]){
               return true;
           }else{
               if(checkIfCycle(neighbour,src,adj,visited)){
                   return true;
               }
           }
       }
        return false;
        
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean[V]; //false
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(i,-1,adj,visited)){
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
}