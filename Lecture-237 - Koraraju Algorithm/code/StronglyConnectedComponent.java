import java.util.*;

//User function Template for Java


class Solution
{
    private void dfs(int node, boolean []vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    private void dfsCount(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjT) {
        vis[node] = true;
        for (Integer it : adjT.get(node)) {
            if (!vis[it]) {
                dfsCount(it, vis, adjT);
            }
        }
    }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, vis, adj, st);
            }
        }

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            vis[i] = false;
            for (Integer it : adj.get(i)) {
                adjList.get(it).add(i);
            }
        }
        int count = 0;
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();
            if (!vis[node]) {
                count++;
                dfsCount(node, vis, adjList);
            }
        }
        return count;

    }
}