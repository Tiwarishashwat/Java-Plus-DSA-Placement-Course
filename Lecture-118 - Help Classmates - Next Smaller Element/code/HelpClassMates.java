class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> stack = new Stack<>();
	    int res[] = new int[n];
	    for(int i=n-1;i>=0;i--){
	        while(!stack.isEmpty() && stack.peek()>= arr[i]) {
	            stack.pop();
	        }
	        
	        if(stack.isEmpty()) {
	            res[i] = -1;
	        } else {
	            res[i] = stack.peek();
	        }
	        
	        stack.push(arr[i]);
	    }
	    return res;
	} 
}