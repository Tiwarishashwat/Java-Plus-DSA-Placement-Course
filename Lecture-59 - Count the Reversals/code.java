//Method -1
class Sol
{
    int countRev (String s)
    {
        // your code here
        if(s.length()%2!=0){
            return -1;
        }
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{'){
              	stack.push(ch);
            } else {
                // insert incase of invalid pair }} or close comes before open.
                if(stack.isEmpty() || stack.peek() == '}'){
                    stack.push(ch);
                } else {
                    // pop in case of valid pair {}
                    stack.pop();
                }
            }
        }
        int ans = 0, open = 0, close=0;
         while(!stack.isEmpty()){
             char top = stack.pop();
             if(top == '{'){
                 open++;
             } else {
                 close++;
             }
        }
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }
    
}


//Method -2
class Sol
{
    int countRev (String s)
    {
        // your code here
        if(s.length()%2!=0){
            return -1;
        }
        
         int ans = 0, open = 0, close=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{'){
                open+=1; 
            } else {
                // insert incase of invalid pair }} or close comes before open.
             
                if(open<=0) {
                    close++;
                } else {
                    // pop in case of valid pair {}
                    open--;
                }
            }
        }
       
     
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }
    
}



