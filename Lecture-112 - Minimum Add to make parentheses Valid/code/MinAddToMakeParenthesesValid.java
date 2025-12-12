// Approach 1: using stack data structure
    public int minAddToMakeValid(String s) {
        int open = 0, close=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            } else {
                if(open<=0) {
                    close++; 
                } else {
                    open--; 
                }
            }
        }
        return (open+close); 
    }

// Approach 2: using open/close variables
public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.peek()==')') {
                     stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size();
    } 