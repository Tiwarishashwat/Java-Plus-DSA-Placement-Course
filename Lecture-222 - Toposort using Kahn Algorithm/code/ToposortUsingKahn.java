
import java.util.*;
/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
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
            return new int[V];
        }
        
        int ans[] = new int[V];
        for(int i=0;i<V;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}