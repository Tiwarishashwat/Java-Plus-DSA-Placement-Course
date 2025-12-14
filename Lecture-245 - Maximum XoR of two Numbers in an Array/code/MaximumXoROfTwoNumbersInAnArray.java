class TrieNode {
    TrieNode trieNode[];
    TrieNode(){
        trieNode = new TrieNode[2];
    }
    boolean containsBit(int ch){
        return trieNode[ch]!=null;
    }

    void add(int ch){
        trieNode[ch] = new TrieNode();
    }

    TrieNode getBit(int ch){
        return trieNode[ch];
    }
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        //insert all numbers
        for(int num : nums){
            TrieNode temp = root;
            for(int i=31;i>=0;i--){
                int bit = ((num>>i) & 1);
                if(!temp.containsBit(bit)){
                    temp.add(bit);
                }
                temp = temp.getBit(bit);
            }
        }

        int maxXor = 0;

        //check for max xor
        for(int num : nums){
            TrieNode temp = root;
            int res=0;
            for(int i=31;i>=0;i--){
                int bit = ((num>>i) & 1);
                // 1-bit => opp bit
                if(temp.containsBit(1-bit)){
                    // res => 00100
                    // 1<<i=> 00010
                    // res=>  00110
                    res = res | (1<<i); 
                    temp = temp.getBit(1-bit);
                    // temp.add(1-bit);
                }else{ //if opp is not available then settle with actual value
                    temp = temp.getBit(bit);
                }
            }
            maxXor = Math.max(maxXor, res);
        }
        return maxXor;
    }
}