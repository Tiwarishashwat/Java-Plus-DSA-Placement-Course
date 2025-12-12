import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map =new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res = new ArrayList<>();
        backtrack(0,digits, res,new StringBuilder(""), map);
        return res;
    }
    // K^N
    //digits ="23"
    private void backtrack(int index, String digits, List<String> res, StringBuilder current, HashMap<Character,String> map ){
        //base case
        if(index == digits.length()){
            res.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for(int i=0;i<letters.length();i++){
            // "" + "a"
            // current = current + letters.charAt(i);
            current.append(letters.charAt(i));
            backtrack(index+1,digits, res,current, map);
            current.deleteCharAt(current.length()-1);
            // ""
            // current = current.substring(0,current.length()-1);
        }

    }
}










