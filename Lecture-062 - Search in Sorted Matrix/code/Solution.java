class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int m = matrix.length; // rows
        int n = matrix[0].length; // col
        int start = 0;
        int end = m*n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int r = mid/n;
            int c = mid%n;
            int val = matrix[r][c];
            if(val == target) {
                return true;
            } else if(target<val){
                end = mid-1; 
            } else {
                start = mid+1;
            }
        }
        return false;
    }

   public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int Rows = matrix.length;
        int Cols = matrix[0].length;
        int r = 0;
        int c = Cols-1;
        while(r < Rows && c >=0) {
            if(matrix[r][c] == target) {
                return true;
            } else if(target < matrix[r][c]){
                c = c-1;
            } else {
                r = r+1;
            }
        }
        return false;
        
    }

}