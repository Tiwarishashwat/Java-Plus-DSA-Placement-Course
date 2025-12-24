import java.util.*;
class Solution {
    public int[] dijkstra(int src,int n, ArrayList<ArrayList<int[]>> adj){
        // pair -> (node, time)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int p1[], int p2[]){
                return p1[1] - p2[1];
            }
        });
        int time[] = new int[n];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[src] = 0;
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int pair[] = pq.poll();
            int u = pair[0];
            int d = pair[1];
            if(d > time[u]) continue;
            for(int neighbour[] : adj.get(u)){
                int v = neighbour[0];
                int w = neighbour[1];
                if(time[u] + w < time[v]){
                    time[v] = time[u] + w;
                    pq.offer(new int[]{v, time[v]});
                }
            }
        }
        return time;
    }
    //time complexity!
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int time[] : times){
            int u = time[0]-1;
            int v = time[1]-1;
            int w = time[2];
            adj.get(u).add(new int[]{v,w});
        }
        int minTime[] = dijkstra(k-1,n, adj);
        int res = Integer.MIN_VALUE;
        for(int time : minTime){
            res = Math.max(res,time);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
}