class TrieNode {
    TrieNode trieNode[];
    TrieNode(){
        trieNode = new TrieNode[26];
    }
    boolean containsChar(char ch){
        return trieNode[ch-'a']!=null;
    }

    void add(char ch){
        trieNode[ch-'a'] = new TrieNode();
    }

    TrieNode getChar(char ch){
        return trieNode[ch-'a'];
    }
}
class Solution {
    public int countDistinct(String s) {
        TrieNode root = new TrieNode();
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            TrieNode temp = root;
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(!temp.containsChar(ch)){
                    temp.add(ch);
                    count++;
                }
                temp = temp.getChar(ch);
            }
        }
        return count;
    }
}