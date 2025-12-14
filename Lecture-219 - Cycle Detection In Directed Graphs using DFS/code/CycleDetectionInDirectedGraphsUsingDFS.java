import java.util.*;

/*Complete the function below*/

class Solution {
    public boolean dfs(int src,boolean visited[],ArrayList<ArrayList<Integer>> adj,
    boolean pathVisited[]){
        visited[src] = true;
        pathVisited[src] = true;
        //dfs
        for(int neighbour : adj.get(src)){
            if(pathVisited[neighbour]){
                return true;
            }else if(visited[neighbour]){
                continue;
            }else{
                if(dfs(neighbour,visited,adj,pathVisited)){
                    return true;
                }
            }
        }
        pathVisited[src] = false;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] = new boolean[V];
        boolean pathVisited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,visited,adj,pathVisited)){
                    return true;
                }
            }
        }
        return false;
    }
}