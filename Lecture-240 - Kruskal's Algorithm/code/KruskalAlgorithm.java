
import java.util.*;
// User function Template for Java

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        //(u, v, weight)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[], int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        // insert edges in pq
        for(int i=0;i<V;i++){
            for(int edges[] : adj.get(i)){
                pq.offer(new int[]{i,edges[0],edges[1]});
            }
        }
        DisjointSet dsu = new DisjointSet(V);
        int sum=0;
        while(!pq.isEmpty()){
            int object[] = pq.poll();
            int u = object[0];
            int v = object[1];
            int weight = object[2];
            if(dsu.unionBySize(u,v)){
                sum += weight;
            }
        }
        return sum;
    }
}


class DisjointSet {
    int parent[];
    int size[];
    DisjointSet(int nodes){
        this.parent = new int[nodes];
        this.size = new int[nodes];
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    public int findRootParent(int node){
        if(node == parent[node]){
            return node;
        }
        parent[node] = findRootParent(parent[node]);
        return parent[node];
    }
    public boolean unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return false;
        }
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
        return true;
    }
}