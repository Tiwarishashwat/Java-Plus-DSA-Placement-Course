class Solution {
    private int[] buildLPS(char pattern[]){
        int len=0;
        int i=1;
        int m = pattern.length;
        int lps[] = new int[m];
        while(i<m){
            if(pattern[len]==pattern[i]){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len==0) i++;
                else len = lps[len-1];
            }
        }
        return lps;
    }
    public int strStr(String text, String pat) {
        //KMP
        char pattern[] = pat.toCharArray();
        // 1. build lps
        int lps[] = buildLPS(pattern);
        // 2. compare
        int i=0; //txt
        int j=0; //pat
        int n = text.length();
        int m = pat.length();
        while(i<n){
            if(pat.charAt(j) == text.charAt(i)){
                i++;
                j++;
                if(j==m){ //whole pattern is matched
                    return (i-m);
                }
            }else{
                if(j==0) i++;
                else j = lps[j-1];
            }
        }
        return -1;
    }
}