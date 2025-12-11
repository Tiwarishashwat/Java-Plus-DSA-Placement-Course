import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int maxLen=0;
        for(Integer element: set){// 1
            int prevEl = element-1; //0
            if(!set.contains(prevEl)){
                int len=1;
                int nextEl=element+1; //2
                while(set.contains(nextEl)){
                    len++; //2,3
                    nextEl++;//3,4
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}
