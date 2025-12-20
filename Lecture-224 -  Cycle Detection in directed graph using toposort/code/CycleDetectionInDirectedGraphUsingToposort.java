import java.util.*;

/*Complete the function below*/

class Solution {
    
    boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int indegree[] = new int[V]; //0
        for(int u=0;u<adj.size();u++){
            for(int v : adj.get(u)){
                indegree[v]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        //3

        ArrayList<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int neighbour : adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.offer(neighbour);
                }
            }
        }
        
        if(res.size() != V){
            return true;
            // return new int[V];
        }
        
        int ans[] = new int[V];
        for(int i=0;i<V;i++){
            ans[i] = res.get(i);
        }
        return false; //ans;
    }
    
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        return topoSort(V,adj);
    }
}





    