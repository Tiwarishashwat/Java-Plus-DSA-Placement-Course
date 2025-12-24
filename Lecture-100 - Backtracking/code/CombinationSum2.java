import java.util.*;
class Solution {
    // N * 2^N
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, current, res, candidates, target);
        return res;
    }
    private void backtrack(int index, List<Integer> current, List<List<Integer>> res, int[] candidates, int target){
        //base case
        if(target == 0){
            res.add(new ArrayList<>(current));
            return;
        }
        int n = candidates.length;
        // if(index == n){
        //     return;
        // }
        for(int i = index; i<n; i++){
            if((i == index || candidates[i]!=candidates[i-1]) && (candidates[i]<=target)){
                current.add(candidates[i]);
                backtrack(i+1, current, res, candidates, target - candidates[i]);
                current.remove(current.size()-1);
            }
        }
    }
}