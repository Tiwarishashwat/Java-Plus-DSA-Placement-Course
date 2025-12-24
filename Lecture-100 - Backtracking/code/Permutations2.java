import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); //nlogn
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean seen[] = new boolean[nums.length];
        permutations(nums,seen, current, res); //N * !N
        return res;
    }
    private void permutations(int nums[],boolean seen[], List<Integer> current, List<List<Integer>> res){
        //base case
        if(current.size() == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //if seen then skip
            if(seen[i]) continue;
            // avoid duplicate
            if(i>0 && nums[i] == nums[i-1] && !seen[i-1]) continue;
            seen[i] = true;
            current.add(nums[i]);
            permutations(nums,seen, current,res);
            current.remove(current.size()-1);
            seen[i] = false;
        }
    }
}

