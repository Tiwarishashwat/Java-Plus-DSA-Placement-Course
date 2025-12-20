import java.util.*;
//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        // [node, dist]
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int p1[], int p2[]){
                return p1[1] - p2[1];
            }
        });
        int dist[] = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S] = 0;
        pq.offer(new int[]{S,0});
        while(!pq.isEmpty()){
            int pair[] = pq.poll();
            int u = pair[0];
            int d = pair[1];
            if(d > dist[u]) continue;
            for(ArrayList<Integer> neighbour : adj.get(u)){
                int v = neighbour.get(0);
                int w = neighbour.get(1);
                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
            
        }
        return dist;
    }
}