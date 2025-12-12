class Solution {
    public int longestPalindrome(String s) {
        // HashSet<Character> set = new HashSet<>(); a ->97
        int set[] = new int[128]; //[0,0]
        int res=0;
        int oddCount=0;
        for(char ch : s.toCharArray()){
            if(set[ch]!=0){
                res+=2;
                set[ch]=0;
                oddCount--;
            }else{
                 set[ch]=1;
                 oddCount++;
            }
        }
        if(oddCount>0){
            res+=1;
        }
        return res;
    }
}