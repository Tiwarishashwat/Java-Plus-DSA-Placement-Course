class Solution {
    public String countAndSay(int n) {
        //base case
        if(n==1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder res = new StringBuilder("");
        int count=0;
        int len = prev.length();
        for(int i=0;i<len;i++){
            count++;
            if(i==len-1 || prev.charAt(i)!=prev.charAt(i+1)){
                res.append(count).append(prev.charAt(i));
                count=0;
            }
        }
        return res.toString();
    }
}