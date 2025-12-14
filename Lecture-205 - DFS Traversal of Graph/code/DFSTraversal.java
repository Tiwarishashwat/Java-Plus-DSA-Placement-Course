import java.util.*;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        boolean visited[] = new boolean[V]; //0 to v-1
        for(int i=0;i<visited.length;i++){
            if(!(visited[i])){
                dfs(i,visited,adj,res); 
            }
        }
        return res;
    }
    public void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[node] = true;
        res.add(node);
        for(int neighbour : adj.get(node)){
            if(!(visited[neighbour])){
                dfs(neighbour,visited,adj,res); 
            }
        }
    }
}












