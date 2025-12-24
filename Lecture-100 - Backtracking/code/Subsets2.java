import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); //nlogn
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsequences(0, nums, current, res); //N * 2^N
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
        //avoid all duplicates
        while((index+1)<nums.length && nums[index] == nums[index+1]){
            index++;
        }
         subsequences(index+1, nums, current, res);
    }
}


