// next greater element in circular array
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int res[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
         //  System.out.println("Index is " + i);
         //  System.out.println("Index considered is "+ (i%n));
         //   System.out.println("Element is " + nums[i%n]);
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
         //       System.out.println("Popped : " + stack.peek());
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    res[i%n] = -1; 
                } else {
                    res[i%n] = stack.peek();
                }
              //    System.out.println("Stored Result is " + res[i%n]);
            }
            //System.out.println("Pushed : " + nums[i%n]);
            stack.push(nums[i%n]);
        }
        return res;
    }
}

// next smaller element in circular array
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int res[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
         //  System.out.println("Index is " + i);
         //  System.out.println("Index considered is "+ (i%n));
         //   System.out.println("Element is " + nums[i%n]);
            while(!stack.isEmpty() && stack.peek()>=nums[i%n]){
         //       System.out.println("Popped : " + stack.peek());
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    res[i%n] = -1; 
                } else {
                    res[i%n] = stack.peek();
                }
              //    System.out.println("Stored Result is " + res[i%n]);
            }
            //System.out.println("Pushed : " + nums[i%n]);
            stack.push(nums[i%n]);
        }
        return res;
    }
}