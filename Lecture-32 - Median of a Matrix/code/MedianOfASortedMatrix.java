public class MedianOfASortedMatrix {
    public static void main(String[] args) {

    }
    int median(int matrix[][], int R, int C) {
        // code here
        // total elements
        int N = R*C;
        int medianIndex = N/2;
        int start = 1;
        int end = 2000;

        while (start<=end){
            int assumedMedian = start + (end-start)/2;
            // no of elements less than assumed median.
            // k -> lesserElements
            int lesserElements = findSmallerElements(matrix, assumedMedian);
            if(lesserElements <= medianIndex){
              start = assumedMedian+1;
            } else {
                end = assumedMedian-1;
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













