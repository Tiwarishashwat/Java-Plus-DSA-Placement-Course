class Solution {
    public int maximalRectangle(char[][] matrix) {

        // if there are no rows then return
        if(matrix.length==0){
            return 0;
        }
        // find the number of columns in a row.
        int heights[] = new int[matrix[0].length];
        int largest = 0; 
        //O(N^2)
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val = matrix[i][j]-'0'; // char to int
                if(val == 0){
                    heights[j] = 0;
                } else {
                    heights[j]+= val;
                }
            }
            int maxArea = largestRectangleArea(heights); //O(3N) ~ O(N)
            if(largest<maxArea){
                largest = maxArea;
            }
        }
        return largest;
    }
    public int largestRectangleArea(int[] heights) {
      //  Stack<Integer> stack = new Stack<>(); 
			int stack[] = new int[heights.length];
			int index = -1;
        int max = 0;
				int n = heights.length;
        for(int i=0;i<n;i++){
            // int element = (i==n)?0:heights[i]; //add 0 in the end to pop all the elements.
						while(index!=-1 && heights[stack[index]]>heights[i]){
							int h = heights[stack[index--]];
							int ps = (index==-1)?-1:stack[index];
							int w = i - ps - 1;
							max = Math.max(max, (h*w));
						} 
						// stack.push(i);
						stack[++index] = i;
        }
					while(index!=-1){
							int h = heights[stack[index--]];
							int ps = (index==-1)?-1:stack[index];
							int w = n - ps - 1;
							max = Math.max(max, (h*w));
						} 
        return max;
    }
}