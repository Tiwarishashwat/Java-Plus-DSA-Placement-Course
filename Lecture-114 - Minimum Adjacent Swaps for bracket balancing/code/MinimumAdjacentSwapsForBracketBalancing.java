class Solution{
    static int minimumNumberOfSwaps(String s){
        // code here
        int open=0,close=0,unbalanced=0,swaps=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[') {
                open++;
                if(unbalanced>0){
                    swaps += unbalanced;
                    unbalanced--;
                }
            } else {
                close++;
                unbalanced = close-open;
            }
        }
        return swaps;
    }
}