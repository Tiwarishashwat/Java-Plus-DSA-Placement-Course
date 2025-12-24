

//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
      
        //bfs
        while(!queue.isEmpty()){
            int size=queue.size(); //1
           for(int i=0;i<size;i++){
               
                Node node = queue.poll();
                if(i==0){
                     res.add(node.data);
                }
                
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }
}











