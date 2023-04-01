public class MatrixTransposeAndRotate {
    public static void main(String[] args) {

    }
	// clockwise
    static void rotateby90(int matrix[][], int n)
    {
        transpose(matrix,n);
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }

    }
//anticlockwise
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix,n);
        // reverse rows.
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    static void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    static void transpose(int matrix[][], int n)
    {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(matrix, i, j);
            }
        }
    }
}
