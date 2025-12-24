import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res =  new ArrayList<>();
        backtrack(0, current, res, candidates, target);
        return res;
    }
    private void backtrack(int index, List<Integer> current, List<List<Integer>> res, int[] candidates, int target){
        //base case
        if(target == 0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index == candidates.length){
            return;
        }
        //pick
        if(candidates[index]<=target){
            current.add(candidates[index]);
            backtrack(index, current, res, candidates, target - candidates[index]);
            current.remove(current.size()-1);
        }
        //no pick
        backtrack(index+1, current, res, candidates, target);
    }
}