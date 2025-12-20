import java.util.*;

// User function Template for Java

/*
*   edges: vector of vectors which represents the graph
*   S: source vertex to start traversing graph with
*   V: number of vertices
*/
class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int dist[] = new int[V]; 
        Arrays.fill(dist,(int)1e8);
        dist[S] = 0; 
        for(int i=0;i<V-1;i++){
            boolean isChanged = false;
            for(ArrayList<Integer> edge : edges){
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    isChanged=true;
                }
            }
            if(!isChanged){
                break; //if cur relation is not chaning any dist then no need to check further!
            }
        }
        
        for(ArrayList<Integer> edge : edges){
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                    return new int[]{-1};
                    // dist[v] = dist[u] + w;
                }
            }
        return dist;
    }
}