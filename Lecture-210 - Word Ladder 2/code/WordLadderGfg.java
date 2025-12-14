
import java.util.*;
//User function Template for Java

class Solution
{
        public List<String> getNeighbours(String word,HashSet<String> set){
        List<String> neighbours = new ArrayList<>();
        // M^2*26
        for(int i=0;i<word.length();i++){ 
           for(char ch='a';ch<='z';ch++){
                if(ch==word.charAt(i)){
                    continue;
                }
                String newWord = word.substring(0,i) + ch + word.substring(i+1,word.length());
                if(set.contains(newWord)){
                    neighbours.add(newWord);
                }
           }
        }
        return neighbours;
    }
    public ArrayList<ArrayList<String>> findLadders(String beginWord, String endWord, HashSet<String> set) {
        // HashSet<String> set = new HashSet<>(wordList); //O(N)
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        if(!set.contains(endWord)){
            return res;
        }
        ArrayList<String> dummy = new ArrayList<>();
        dummy.add(beginWord);
        Queue<ArrayList<String>> queue = new LinkedList<>();
        queue.offer(dummy);
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        int level=0;
        int resLevel=-1;
        // O(N*M^2*26)
        while(!queue.isEmpty()){
            HashSet<String> usedWords = new HashSet<>();
            int curLevelSize = queue.size();
            //level wise travesal
            for(int i=0;i<curLevelSize;i++){
                ArrayList<String> nodeList = queue.poll();
                String node = nodeList.get(nodeList.size()-1);
                if(node.equals(endWord)){
                    resLevel = level;
                    res.add(nodeList);
                }
                //adjList
                List<String> neighbours = getNeighbours(node,set);
                for(String word : neighbours){
                    if(set.contains(word)){  
                        nodeList.add(word);
                        queue.offer(new ArrayList<>(nodeList));
                        nodeList.remove(word);
                        usedWords.add(word);
                    }
                }

            }
            for(String visited : usedWords){
                set.remove(visited);
            }
            if(level==resLevel){
                break;
            }
            level++;
        }
        return res;
 
    }
    
    public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    {
        // Code here
        HashSet<String> set = new HashSet<>();
        for(String word : wordList){
            set.add(word);
        }
        // List<String> wordsList = Arrays.asList(wordList);
        return findLadders(startWord, targetWord, set);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}