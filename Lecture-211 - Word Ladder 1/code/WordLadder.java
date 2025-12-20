import java.util.*;
class Solution {
    public List<String> getNeighbours(String word,HashSet<String> set){
        List<String> neighbours = new ArrayList<>();
        // M^2*26
        for(int i=0;i<word.length();i++){ //3 -> 0,1,2 , (3,3)
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
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList); //O(N)
        if(!set.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        int level=0;
        // O(N*M^2*26)
        while(!queue.isEmpty()){
            int curLevelSize = queue.size();
            //level wise travesal
            for(int i=0;i<curLevelSize;i++){
                String node = queue.poll();
                if(node.equals(endWord)){
                    return level+1;
                }
                //adjList
                List<String> neighbours = getNeighbours(node,set);
                for(String word : neighbours){
                    if(set.contains(word)){
                        queue.offer(word);
                        set.remove(word);
                    }
                }

            }
            level++;
        }
        return 0;
    }
}