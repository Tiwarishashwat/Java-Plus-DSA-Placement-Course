import java.util.ArrayList;

class TrieNode {
    //prefix tries
    TrieNode trieNode[];
    boolean wordEnd;
    TrieNode(){
        trieNode = new TrieNode[26]; //26 size trie
        wordEnd = false;
    }
    void addChar(char ch){
        trieNode[ch-'a'] = new TrieNode();
    }
    TrieNode getChar(char ch){
        return trieNode[ch-'a'];
    }
    boolean containsChar(char ch){
        return trieNode[ch - 'a'] != null;
    }
    void markWordEnd(){
        wordEnd = true;
    }
    boolean isWordEnd(){
        return wordEnd;
    }
}
public class Trie {
    TrieNode root = new TrieNode();
    public void addWord(String word){
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(!temp.containsChar(ch)){
               temp.addChar(ch);
            }
            temp = temp.getChar(ch);
        }
        temp.markWordEnd();
    }
    public boolean searchWord(String word){
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(!temp.containsChar(ch)){
                return false;
            }
            temp = temp.getChar(ch);
        }
        return temp.isWordEnd();
    }
    public boolean containsPrefix(String prefix){
        TrieNode temp = root;
        for(char ch : prefix.toCharArray()){
            if(!temp.containsChar(ch)){
                return false;
            }
            temp = temp.getChar(ch);
        }
        return true;
    }

}
