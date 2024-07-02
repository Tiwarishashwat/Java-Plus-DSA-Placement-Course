// Graph Lecture - 2 Code
// (Represent graph using adjacency list and adjacency matrix)


import java.util.*;
public class Graph {
    class Pair{
        int node;
        int weight;
        Pair(int n, int w){
            node = n;
            weight = w;
        }
//        (node, weight)
        @Override
        public String toString() {
            return "(" +node +"," + weight + ")";
        }
    }
    int adjMatrix[][];
    List<List<Integer>> adjList;
    List<List<Pair>> adjListWithWeight;
    Graph(int nodes){
        adjMatrix = new int[nodes][nodes]; //4*4 [0..]
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }
//    ->[[0,2],[0,1],[2,0]]
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjMatrix[u][v] = 1;
            }else{
                //undirected
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void addEdgesWithWeightInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                adjMatrix[u][v] = w;
            }else{
                //undirected
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }

    public void addEdgesInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjList.get(u).add(v);
            }else{
                //undirected
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgesWithWeightInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                Pair pair = new Pair(v,w);
                adjListWithWeight.get(u).add(pair);
            }else{
                //undirected
                Pair pair1 = new Pair(v,w);
                Pair pair2 = new Pair(u,w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }
    public void printMatrix(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row "+i + "-> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }
    /*
    0 -> [1,2,]
    1 -> [0]
    */
    public void printList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j));
                if(j!=adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printWeightedList(){
        for(int i=0;i<adjListWithWeight.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjListWithWeight.get(i).size();j++){
                System.out.print(adjListWithWeight.get(i).get(j));
                if(j!=adjListWithWeight.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

   public void findDegreeInUndirectedGraph(int edges[][], int nodes){
        int degree[] = new int[nodes];
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }

        //print
       for(int i=0;i<nodes;i++){
           System.out.println("node -> " + i + " degree -> "+degree[i]);
       }
   }

    public void findDegreeInDirectedGraph(int edges[][], int nodes){
        int inDegree[] = new int[nodes];
        int outDegree[] = new int[nodes];
        for(int edge[] : edges){
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;
        }

        //print
        for(int i=0;i<nodes;i++){
            System.out.print("node -> " + i + " in-degree -> "+inDegree[i] + " - ");
            System.out.print("node -> " + i + " out-degree -> "+outDegree[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
        System.out.println("UnDirected Graph->");
        Graph graph = new Graph(nodes);
        graph.addEdgesInMatrix(edges,false);
        graph.printMatrix();
        System.out.println("Directed Graph->");
        Graph graph1 = new Graph(nodes);
        graph1.addEdgesInMatrix(edges,true);
        graph1.printMatrix();


        int edgesWithWeight[][] = {{0,2,10},{0,1,20},{1,3,30}};
        System.out.println("Weighted UnDirected Graph->");
        Graph graph2 = new Graph(nodes);
        graph2.addEdgesWithWeightInMatrix(edgesWithWeight,false);
        graph2.printMatrix();
        System.out.println("Weighted Directed Graph->");
        Graph graph3 = new Graph(nodes);
        graph3.addEdgesWithWeightInMatrix(edgesWithWeight,true);
        graph3.printMatrix();


        System.out.println("UnDirected Graph->");
        Graph graph4 = new Graph(nodes);
        graph4.addEdgesInList(edges,false);
        graph4.printList();
        System.out.println("Directed Graph->");
        Graph graph5 = new Graph(nodes);
        graph5.addEdgesInList(edges,true);
        graph5.printList();


        System.out.println("Weighted UnDirected Graph->");
        Graph graph6 = new Graph(nodes);
        graph6.addEdgesWithWeightInList(edgesWithWeight,false);
        graph6.printWeightedList();
        System.out.println("Weighted Directed Graph->");
        Graph graph7 = new Graph(nodes);
        graph7.addEdgesWithWeightInList(edgesWithWeight,true);
        graph7.printWeightedList();


        // how to find degree of nodes in a graph



        // --- undirected graph --- //
        //find degree of nodes
        Graph graph8 = new Graph(4);
        System.out.println("UnDirected Graph");
        graph8.findDegreeInUndirectedGraph(edges,4);
        // --- directed graph --- //
        //find indegree of nodes using edges
        //find outdegree of nodes using edges
        System.out.println("Directed Graph");
        graph8.findDegreeInDirectedGraph(edges,4);

    }
}

