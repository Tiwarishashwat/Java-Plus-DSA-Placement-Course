class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int n = s1.length();
        int m = s2.length();
        if(n!=m) return false;
        
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
            
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0) count += freq[i];
        }
        return (count<=k);
    }
}