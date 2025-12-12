import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(""),n, 0, 0);
        return res;
    }
    private void backtrack(List<String> res, StringBuilder current,int n, int open, int close){
        //base case
        if(open==n && close==n){
            res.add(current.toString());
            return;
        }
        if(open<n){
            current.append('(');
            backtrack(res, current, n, open+1, close);
            current.deleteCharAt(current.length()-1);
        }

        if(close<n && close < open){
            current.append(')');
            backtrack(res, current, n, open, close+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}