import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsequences(0, nums, current, res);
        return res;
    }
    private void subsequences(int index, int nums[], List<Integer> current, List<List<Integer>> res){
        //base case
        if(index == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        //include
        current.add(nums[index]);
        //pick
        subsequences(index+1, nums, current, res);

        //remove
        current.remove(current.size()-1);
        //no pick
         subsequences(index+1, nums, current, res);
    }
}