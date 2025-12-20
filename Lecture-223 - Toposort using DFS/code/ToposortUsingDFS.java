import java.util.*;

/*Complete the function below*/


class Solution
{
    public static void dfs(int src, ArrayList<ArrayList<Integer>> adj,boolean visited[],Stack<Integer> stack){
        visited[src] = true;
        for(int neighbour : adj.get(src)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,visited,stack);
            }
        }
        stack.push(src);
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i, adj, visited, stack);
            }
        }
        int index=0;
        int res[] = new int[V];
        while(!stack.isEmpty()){
            res[index] = stack.pop();
            index++;
        }
        return res;
    }
}