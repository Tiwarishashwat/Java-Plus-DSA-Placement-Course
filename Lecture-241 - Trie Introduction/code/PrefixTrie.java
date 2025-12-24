class TrieNode {
    TrieNode trieNode[];
    boolean wordEnd;
    TrieNode(){
        trieNode = new TrieNode[26];
        wordEnd = false;
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
    void markWordEnd(){
        wordEnd = true;
    }
    boolean isWord(){
        return wordEnd;
    }
}
class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(!temp.containsChar(ch)){
                temp.add(ch);
            }
            temp = temp.getChar(ch);
        }
        temp.markWordEnd();
    }
    
    public boolean search(String word) {
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(!temp.containsChar(ch)){
               return false;
            }
            temp = temp.getChar(ch);
        }
        return temp.isWord();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char ch : prefix.toCharArray()){
            if(!temp.containsChar(ch)){
               return false;
            }
            temp = temp.getChar(ch);
        }
        return temp!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */