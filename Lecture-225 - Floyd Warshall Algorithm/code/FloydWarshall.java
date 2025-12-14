

//User function template for JAVA

class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        // matrix[i][j] == -1 no path to infinity
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = 1001; //check the contraints and assign acc.
                }
            }
        }
        //O(N^3)
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j] = Math.min(matrix[i][j] , matrix[i][k] + matrix[k][j]);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(matrix[i][i]<0){
                System.out.println("negative cycle detected");
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1001){
                    matrix[i][j] = -1; //check the contraints and assign acc.
                }
            }
        }
    }
}