class TrieNode {
    TrieNode trieNode[];
    int wordCount;
    TrieNode(){
        trieNode = new TrieNode[26];
        wordCount = 0;
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
    void increaseCount(){
        wordCount++;
    }
    int getCount(){
        return wordCount;
    }
}

class Solution {
    public int prefixCount(String[] words, String pref) {
        TrieNode root = new TrieNode();
        for(String word : words){
            TrieNode temp = root;
            for(char ch : word.toCharArray()){
                if(!temp.containsChar(ch)){
                    temp.add(ch);
                }
                temp = temp.getChar(ch);
                temp.increaseCount();
            }
        }
        TrieNode temp = root;
        for(char ch : pref.toCharArray()){
            if(!temp.containsChar(ch)){
                    return 0;
            }
            temp = temp.getChar(ch);
        }
        return temp.getCount();
    }
}

