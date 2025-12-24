import java.util.*;

// User function Template for Java

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        //(parent, node, weight)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[], int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        int sum=0;
        ArrayList<int[]> edges = new ArrayList<>(); 
        boolean visited[] = new boolean[V];
        pq.offer(new int[]{-1,0,0});
        while(!pq.isEmpty()){
            int object[] = pq.poll();
            int parent = object[0];
            int node = object[1];
            int weight = object[2];
            if(visited[node]) continue;
            visited[node] = true;
            if(parent!=-1){
                edges.add(new int[]{parent, node});
                sum += weight;
            }
          
            for(int neighbourObject[] : adj.get(node)){
                int neighbourNode = neighbourObject[0];
                int neighbourWeight = neighbourObject[1];
                if(!visited[neighbourNode]){
                    pq.offer(new int[]{node,neighbourNode,neighbourWeight});
                }
            }
        }
        return sum;
    }
}