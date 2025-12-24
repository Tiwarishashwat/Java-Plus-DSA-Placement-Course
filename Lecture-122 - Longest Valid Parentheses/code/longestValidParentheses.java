// Brute force solution using stack.
 public int longestValidParentheses(String s) {
        // remove all valid parentheses.
        Stack<Integer> stack = new Stack<>();
        removeValidParenthese(s, stack);
        // if stack is empty then there were no invalid parentheses so return len :)
        if(stack.isEmpty()){
           return s.length();
        }

        ArrayList<Integer> arr = new ArrayList<>();
       formArrayOfInvalidIndexes(arr, stack, s);

        // find max difference between two invalid parentheses
        int max=0;
        for(int i=1;i<arr.size();i++){
             int prev = arr.get(i-1);
             max = Math.max(max,arr.get(i) - prev-1);
        }

    return max;
    }
    public void removeValidParenthese(String s, Stack<Integer> stack) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') {
                stack.push(i);
            } else {
                if(stack.isEmpty() || s.charAt(stack.peek())==')') {
                    stack.push(i);
                } else {
                    stack.pop();
                }
            }
        }
    }

    public void formArrayOfInvalidIndexes(ArrayList<Integer> arr, Stack<Integer> stack, String s) {
         arr.add(0,s.length());
        // now stack will have only the invalid parentheses indexes.
        while(!stack.isEmpty()){
            arr.add(0,stack.pop());
        }
         arr.add(0,-1);
    }



//optimal single stack solution
public int longestValidParentheses(String s) {

        //  Stack<Integer> stack = new Stack<>();
         int stack[] = new int[s.length()+1];
         int index=-1;
         int max = 0;
         stack[++index] = -1;
        //  stack.push(-1);
         for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
             if(ch == '(') {
                   stack[++index] = i;
                //  stack.push(i); // index
             } else {
                 index--;
                //  stack.pop();
                 if(index==-1) {
                     stack[++index] = i;
                 } else {
                    max = Math.max(max, i - stack[index]);
                 }
                //  if(stack.isEmpty()) {
                //      stack.push(i);
                //  } else {
                //     max = Math.max(max, i - stack.peek());
                //  }
                 
             }
         }
         return max;
       
    }