class Solution {
    public int kthSmallest(int[][] matrix, int k) {
           // code here
        // total elements
        int R = matrix.length;
        int C = matrix[0].length;
        int N = R*C;
        int requiredSmallerElements = k;  //N/2;
        int start = matrix[0][0]; //1;
        int end = matrix[R-1][C-1]; //2000;

        while (start<=end){
            int assumedKthElement = start + (end-start)/2;
            // no of elements less than assumed median.
            // k -> lesserElements
            int smallerElements = findSmallerElements(matrix, assumedKthElement);
            if(smallerElements < requiredSmallerElements){
              start = assumedKthElement+1;
            } else {
                end = assumedKthElement-1;
            }
        }
        return start;
    }
    int findSmallerElements(int matrix[][], int assumedMedian){
        int noOfSmallerElements = 0;
        // traverse row by row
        for(int i=0;i<matrix.length;i++){
            // matrix[i] -> 0,1,2
            // apply binary search on matrix[i]
//            int arr[] = matrix[i];
            int start = 0;
            int end = matrix[i].length-1;
            while (start<=end){
                int mid = start + (end-start)/2;
                if(matrix[i][mid] <= assumedMedian){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
            // start.
            noOfSmallerElements += start;
        }
        return noOfSmallerElements;
    }
}